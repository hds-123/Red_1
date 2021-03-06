package com.jsplec.bbs.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.bbs.Command.UCommand;
import com.jsplec.bbs.Command.UContentCommand;
import com.jsplec.bbs.Command.UDeleteCommand;
import com.jsplec.bbs.Command.UListCommand;
import com.jsplec.bbs.Command.UModifyCommand;
import com.jsplec.bbs.Command.USearchCommand;
import com.jsplec.bbs.Command.UWriteCommand;

import baby.board.command.BoardListCommand;
import baby.board.command.WriteBoardCommand;
import baby.board.command.WriteCommand;
import baby.board.command.WriteDeleteCommand;
import baby.board.command.WriteModifyCommand;
import baby.board.command.WriteModifyViewCommand;
import baby.board.command.listboardSearchCommand;
import baby.calender.command.CCommand;
import baby.calender.command.CContentCommand;
import baby.calender.command.CDeleteCommand;
import baby.calender.command.CListCommand;
import baby.calender.command.CModifyCommand;
import baby.calender.command.CSearchCommand;
import baby.calender.command.CWriteCommand;
import baby.calender.command.TWriteCommand;
import baby.checklist.command.CheckCommand;
import baby.checklist.command.CheckContentCommand;
import baby.checklist.command.CheckDeleteCommand;
import baby.checklist.command.CheckListCommand;
import baby.checklist.command.CheckModifyCommand;
import baby.checklist.command.CheckSearchCommand;
import baby.checklist.command.ChecklistWriteCommand;
import baby.product.command.OrderDetailCommand;
import baby.product.command.ProductCommand;
import baby.product.command.ProductContentCommand;
import baby.product.command.ProductDeleteCommand;
import baby.product.command.ProductDetailViewCommand;
import baby.product.command.ProductListCommand;
import baby.product.command.ProductModifyCommand;
import baby.product.command.ProductRegisterCommand;
import baby.product.command.ProductSearchCommand;

/**
 * Servlet implementation class FFrontController
 */
@MultipartConfig(
		//location = "/tmp", //????????? ????????? ?????? ??????????????? ??????
		fileSizeThreshold = 1024*1024, //1MB ????????? ?????? ??????????????? ??????.
		maxFileSize = 1024*1024*50, //????????? ?????? ???????????? ????????? ??????. ????????? 50MB
		maxRequestSize = 1024*1024*50*5 //?????? ????????? ?????? ??????.250MB
			)
@WebServlet("*.cob")
public class UFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);	
	}	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();	
		request.setCharacterEncoding("utf-8");
		
		String viewPage = null;
		UCommand command = null;
		WriteCommand wcommand=null;
		CCommand Ccommand = null;
		CheckCommand checkcommand = null;
		ProductCommand Pcommand = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		switch(com) {
		case("/list.cob"):
			command = new UListCommand();
			command.execute(request, response);
			viewPage ="list.jsp";
		break;
		
		case("/write_view.cob"):
			viewPage ="write_view.jsp";
		break;
		
		case("/write.cob"):
			command = new UWriteCommand();
			command.execute(request, response);
			viewPage ="COB_MAIN.jsp";
		break;
		
		case("/content_view.cob"):
			command = new UContentCommand();
			command.execute(request, response);
			viewPage = "content_view.jsp";
		break;
		
		case("/modify.cob"):
			command = new UModifyCommand();
			command.execute(request, response);
			viewPage ="list.cob";
		break;
		
		case("/delete.cob"):
			command = new UDeleteCommand();
			command.execute(request, response);
			viewPage = "list.cob";
			break;
		
		case("/search.cob"):
			command = new USearchCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
		case("/listboard.cob"):
			wcommand = new BoardListCommand();
			wcommand.execute(request, response, session);
			viewPage = "listboard.jsp";
			break; //????????? ????????? ????????????
			
		case("/writeView.cob"): 
			wcommand.execute(request, response, session);
			viewPage = "writeBoardView.jsp";
			break; //????????? ????????????
			
		case("/writeboard.cob"):
			wcommand = new WriteBoardCommand();
			wcommand.execute(request, response, session);
			viewPage = "listboard.cob";
			break; //????????? ???????????????
		/*	
		case("/board/writefileUpload.cob"):
			command = new writefileUploadCommand();
			command.execute(request, response);
			viewPage = "/board/writeBoardView.jsp";
			break; //???????????????
		*/
//		case("/board/writePaging.cob"):
//			command = new WritePagingCommand();
//			command.execute(request, response);
//			viewPage = "/board/listboard.cob";
//			break; //???????????????
			
		case("/writemodifyView.cob"):
			wcommand = new WriteModifyViewCommand();
			wcommand.execute(request, response, session);
			viewPage = "writeModifyView.jsp";
			break; //????????? ??? ?????? ????????????
			
		case("/writemodify.cob"):
			wcommand = new WriteModifyCommand();
			wcommand.execute(request, response, session);
			viewPage = "listboard.cob";
			break;//????????? ????????????
			
		case("/writedelete.cob"):
			wcommand = new WriteDeleteCommand();
			wcommand.execute(request, response, session);
			viewPage = "listboard.cob";
			break; //????????? ????????????
			
		case("/listboardSearch.cob"):
			wcommand = new listboardSearchCommand();
			wcommand.execute(request, response, session);
			viewPage = "listboard.jsp";
			break; //????????? ????????????


		// front
		case("/mypage.cob"):
			viewPage = "front_calender.jsp";
			break;
			
		// calender - diary
		case("/Clist.cob"):
			Ccommand = new CListCommand();
			Ccommand.execute(request, response);
			viewPage = "calender_list.jsp";
			break;
		case("/Cwrite_view.cob"):
			viewPage = "calender_write_view.jsp";
			break;
		case("/Cwrite.cob"):
			Ccommand = new CWriteCommand();
			Ccommand.execute(request, response);
			viewPage = "Clist.cob";
			break;
		case("/Ccontent_view.cob"):
			Ccommand = new CContentCommand();
			Ccommand.execute(request, response);
			viewPage = "calender_content_view.jsp";
			break;
		case("/Cdelete.cob"):
			Ccommand = new CDeleteCommand();
			Ccommand.execute(request, response);
			viewPage = "Clist.cob";
			break;
		case("/Cmodify.cob"):
			Ccommand = new CModifyCommand(); //?????? ?????? ????????????
			Ccommand.execute(request, response); // ?????? ??? ????????????
			viewPage = "Clist.cob"; // ?????????????????? ????????????
			break;
		case("/Csearch.cob"):
			Ccommand = new CSearchCommand(); //?????? ?????? ????????????
			Ccommand.execute(request, response); // ?????? ??? ????????????
			viewPage = "calender_list.jsp"; // ?????????????????? ????????????
			break;
			
		// calender - mytemp
//		case("/mytemp.cob"):
//			command = new TContentCommand();
//			command.execute(request, response);
//			viewPage = "mytemp_list.jsp";
//			break;
		case("/mytemp_write_view.cob"):
			viewPage = "mytemp_write_view.jsp";
			break;
		case("/mytemp_write.cob"):
			Ccommand = new TWriteCommand();
			Ccommand.execute(request, response);
			viewPage = "mytemp_list.jsp";
			break;
			
		// checklist
		case("/checklist.cob"):
			checkcommand = new CheckListCommand();
			checkcommand.execute(request, response);
			viewPage = "checklist_list.jsp";
			break;
		case("/checklist_write_view.cob"):
			viewPage = "checklist_write_view.jsp";
			break;
		case("/checklist_write.cob"):
			checkcommand = new ChecklistWriteCommand();
			checkcommand.execute(request, response);
			viewPage = "checklist.cob";
			break;
		case("/checklist_content_view.cob"):
			checkcommand = new CheckContentCommand();
			checkcommand.execute(request, response);
			viewPage = "checklist_content_view.jsp";
			break;
		case("/checklist_delete.cob"):
			checkcommand = new CheckDeleteCommand();
			checkcommand.execute(request, response);
			viewPage = "checklist.cob";
			break;
		case("/checklist_modify.cob"):
			checkcommand = new CheckModifyCommand(); //?????? ?????? ????????????
			checkcommand.execute(request, response); // ?????? ??? ????????????
			viewPage = "checklist.cob"; // ?????????????????? ????????????
			break;
		case("/checklist_search.cob"):
			checkcommand = new CheckSearchCommand(); //?????? ?????? ????????????
			checkcommand.execute(request, response); // ?????? ??? ????????????
			viewPage = "checklist_list.jsp";; // ?????????????????? ????????????
			break;
			
			
		case("/listproduct.cob"):
			Pcommand = new ProductListCommand();
			Pcommand.execute(request, response, session);
			viewPage = "productPage.jsp";
			break; //?????? ????????? ????????????
			
		case("/productRegister.cob"):
			Pcommand = new ProductRegisterCommand();
			Pcommand.execute(request, response, session);
			viewPage = "listproduct.cob";
			break; //?????? ????????????
			
		case("/productDetailView.cob"):
			Pcommand = new ProductDetailViewCommand();
			Pcommand.execute(request, response, session);
			viewPage = "productDetailPage.jsp";
			break; //??????????????? ????????????
			
		case("/orderDetail.cob"):
			Pcommand = new OrderDetailCommand();
			Pcommand.execute(request, response, session);
			viewPage = "orderDetailPage.jsp";
			break; //????????????
			
		case("/listProductSearch.cob"):
			Pcommand = new ProductSearchCommand();
			Pcommand.execute(request, response, session);
			viewPage = "productPage.jsp";
			break; // ?????? ?????? ???????????? ????????????
			
		case("/productcontentview.cob"):
			Pcommand = new ProductContentCommand();
			Pcommand.execute(request, response, session);
			viewPage = "product_content_view.jsp";
			break; // ?????? ?????? ???????????? ?????? ????????????
			
		case("/product_modify.cob"):
			Pcommand = new ProductModifyCommand();
			Pcommand.execute(request, response, session);
			viewPage = "listproduct.cob";
			break; // ?????? ?????? ????????????
			
		case("/product_delete.cob"):
			Pcommand = new ProductDeleteCommand();
			Pcommand.execute(request, response, session);
			viewPage = "listproduct.cob";
			break; // ?????? ?????? ????????????
			
			
		}
		

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
		}
	}

