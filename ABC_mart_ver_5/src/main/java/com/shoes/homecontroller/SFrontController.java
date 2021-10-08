package com.shoes.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shoes.customer.command.CCommand;
import com.shoes.order.command.OCommand;
import com.shoes.product.command.PCommand;

/**
 * Servlet implementation class SFrontController
 */
@WebServlet("*.do")
public class SFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SFrontController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		actionDo(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		request.setCharacterEncoding("utf-8");
		
		String c_viewPage = null;
		String o_viewPage = null;
		String p_viewPage = null;
		String b_viewPage = null;
		
		CCommand c_command = null;
		OCommand o_command = null;
		PCommand p_command = null;
		PCommand b_command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length()); // 빼기 /abc.do 로 만들어줌
		
		switch(com) {
		
		// 1. list.do
		
		// 고객리스트
		case("/c_list.do"):
			c_command = new CListCommand();
			c_command.execute(request, response);
			c_viewPage = "c_list.jsp";
			break;
			
		// 주문리스트
		case("/o_list.do"):
			o_command = new OListCommand();
			o_command.execute(request, response);
			o_viewPage = "o_list.jsp";
			break;
			
		// 제품리스트
		case("/p_list.do"):
			p_command = new PListCommand();
			p_command.execute(request, response);
			p_viewPage = "p_list.jsp";
			break;
			
		// 게시판
		case("/b_list.do"):
			b_command = new BListCommand();
			b_command.execute(request, response);
			b_viewPage = "b_list.jsp";
			break;
		
		// 2. write_view.do
			
		// 회원가입
		case("/c_write_view.do"):
			c_viewPage = "c_write_view.jsp";
			break;
			
		case("/c_write.do"):
			c_command = new CWriteCommand();
			c_command.execute(request, response);
			c_viewPage = "c_list.do";
			break;
			
		// 주문결정
		case("/o_write_view.do"):
			o_viewPage = "o_write_view.jsp";
			break;
			
		case("/o_write.do"):
			o_command = new OWriteCommand();
			o_command.execute(request, response);
			o_viewPage = "o_list.do";
			break;
			
		// 제품등록
		case("/p_write_view.do"):
			p_viewPage = "p_write_view.jsp";
			break;
			
		case("/p_write.do"):
			p_command = new PWriteCommand();
			p_command.execute(request, response);
			p_viewPage = "p_list.do";
			break;
			
		// 게시판 글작성
		case("/b_write_view.do"):
			b_viewPage = "b_write_view.jsp";
			break;
			
		case("/b_write.do"):
			b_command = new BWriteCommand();
			b_command.execute(request, response);
			b_viewPage = "b_list.do";
			break;
			
		// 3. content_view
			// 고객
		case("/c_content_view.do"):
			c_command = new CContentCommand();
			c_command.execute(request, response);
			c_viewPage = "c_content_view.jsp";
			break;
			// 주문
		case("/o_content_view.do"):
			o_command = new OContentCommand();
			o_command.execute(request, response);
			o_viewPage = "o_content_view.jsp";
			break;
			// 제품
		case("/p_content_view.do"):
			p_command = new PContentCommand();
			p_command.execute(request, response);
			p_viewPage = "p_content_view.jsp";
			break;
			// 게시판
		case("/b_content_view.do"):
			b_command = new BContentCommand();
			b_command.execute(request, response);
			b_viewPage = "b_content_view.jsp";
			break;
			
		// 4. delete
			// 고객
		case("/c_delete.do"):
			c_command = new CDeleteCommand();
			c_command.execute(request, response);
			c_viewPage = "c_list.do";
			break;
			// 주문
		case("/o_delete.do"):
			o_command = new ODeleteCommand();
			o_command.execute(request, response);
			o_viewPage = "o_list.do";
			break;
			// 제품
		case("/p_delete.do"):
			p_command = new PDeleteCommand();
			p_command.execute(request, response);
			p_viewPage = "p_list.do";
			break;
			// 게시판
		case("/b_delete.do"):
			b_command = new BDeleteCommand();
			b_command.execute(request, response);
			b_viewPage = "b_list.do";
			break;
			
		// 5. modify
			// 고객
		case("/c_modify.do"):
			c_command = new CModifyCommand(); //내가 이름 지어주기
			c_command.execute(request, response); // 이건 다 있어야됨
			c_viewPage = "c_list.do"; // 데이터베이스 읽어오기
			break;
			// 주문
		case("/o_modify.do"):
			o_command = new OModifyCommand(); //내가 이름 지어주기
			o_command.execute(request, response); // 이건 다 있어야됨
			o_viewPage = "o_list.do"; // 데이터베이스 읽어오기
			break;
			// 제품
		case("/p_modify.do"):
			p_command = new PModifyCommand(); //내가 이름 지어주기
			p_command.execute(request, response); // 이건 다 있어야됨
			p_viewPage = "p_list.do"; // 데이터베이스 읽어오기
			break;
			// 게시판
		case("/b_modify.do"):
			b_command = new BModifyCommand(); //내가 이름 지어주기
			b_command.execute(request, response); // 이건 다 있어야됨
			b_viewPage = "b_list.do"; // 데이터베이스 읽어오기
			break;
			
		// 6. search
			// 고객
		case("/c_search.do"):
			c_command = new CSearchCommand(); //내가 이름 지어주기
			c_command.execute(request, response); // 이건 다 있어야됨
			c_viewPage = "c_list.jsp"; // 데이터베이스 읽어오기
			break;
			// 주문
		case("/o_search.do"):
			o_command = new OSearchCommand(); //내가 이름 지어주기
			o_command.execute(request, response); // 이건 다 있어야됨
			o_viewPage = "o_list.jsp"; // 데이터베이스 읽어오기
			break;
			// 제품
		case("/p_search.do"):
			p_command = new PSearchCommand(); //내가 이름 지어주기
			p_command.execute(request, response); // 이건 다 있어야됨
			p_viewPage = "p_list.jsp"; // 데이터베이스 읽어오기
			break;
			// 게시판
		case("/b_search.do"):
			b_command = new BSearchCommand(); //내가 이름 지어주기
			b_command.execute(request, response); // 이건 다 있어야됨
			b_viewPage = "b_list.jsp"; // 데이터베이스 읽어오기
			break;
			
			}
		
		RequestDispatcher c_dispatcher = request.getRequestDispatcher(c_viewPage);
		RequestDispatcher o_dispatcher = request.getRequestDispatcher(o_viewPage);
		RequestDispatcher p_dispatcher = request.getRequestDispatcher(p_viewPage);
		RequestDispatcher b_dispatcher = request.getRequestDispatcher(b_viewPage);
		
		c_dispatcher.forward(request, response);
		o_dispatcher.forward(request, response);
		p_dispatcher.forward(request, response);
		b_dispatcher.forward(request, response);
	}

}//
