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
		case("/list.do"):
			c_command = new CListCommand();
			c_command.execute(request, response);
			c_viewPage = "c_list.jsp";
			
			o_command = new OListCommand();
			o_command.execute(request, response);
			o_viewPage = "o_list.jsp";
			
			p_command = new PListCommand();
			p_command.execute(request, response);
			p_viewPage = "p_list.jsp";
			
			b_command = new BListCommand();
			b_command.execute(request, response);
			b_viewPage = "b_list.jsp";
			
			break;
			
		case("/write_view.do"):
			c_viewPage = "c_write_view.jsp";
			o_viewPage = "o_write_view.jsp";
			p_viewPage = "p_write_view.jsp";
			b_viewPage = "b_write_view.jsp";
			break;
			
		case("/write.do"):
			c_command = new CWriteCommand();
			c_command.execute(request, response);
			c_viewPage = "c_list.do";
			
			o_command = new OWriteCommand();
			o_command.execute(request, response);
			o_viewPage = "o_list.do";
			
			p_command = new PWriteCommand();
			p_command.execute(request, response);
			p_viewPage = "p_list.do";
			
			b_command = new BWriteCommand();
			b_command.execute(request, response);
			b_viewPage = "b_list.do";
			break;
			
		case("/content_view.do"):
			c_command = new CContentCommand();
			c_command.execute(request, response);
			c_viewPage = "c_content_view.jsp";
			
			o_command = new OContentCommand();
			o_command.execute(request, response);
			o_viewPage = "o_content_view.jsp";
			
			p_command = new PContentCommand();
			p_command.execute(request, response);
			p_viewPage = "p_content_view.jsp";
			
			b_command = new BContentCommand();
			b_command.execute(request, response);
			b_viewPage = "b_content_view.jsp";
			break;
			
		case("/delete.do"):
			c_command = new CDeleteCommand();
			c_command.execute(request, response);
			c_viewPage = "c_list.do";
			
			o_command = new ODeleteCommand();
			o_command.execute(request, response);
			o_viewPage = "o_list.do";
			
			p_command = new PDeleteCommand();
			p_command.execute(request, response);
			p_viewPage = "p_list.do";
			
			b_command = new BDeleteCommand();
			b_command.execute(request, response);
			b_viewPage = "b_list.do";
			break;
			
		case("/modify.do"):
			c_command = new CModifyCommand(); //내가 이름 지어주기
			c_command.execute(request, response); // 이건 다 있어야됨
			c_viewPage = "c_list.do"; // 데이터베이스 읽어오기
			
			o_command = new OModifyCommand(); //내가 이름 지어주기
			o_command.execute(request, response); // 이건 다 있어야됨
			o_viewPage = "o_list.do"; // 데이터베이스 읽어오기
			
			p_command = new PModifyCommand(); //내가 이름 지어주기
			p_command.execute(request, response); // 이건 다 있어야됨
			p_viewPage = "p_list.do"; // 데이터베이스 읽어오기
			
			b_command = new BModifyCommand(); //내가 이름 지어주기
			b_command.execute(request, response); // 이건 다 있어야됨
			b_viewPage = "b_list.do"; // 데이터베이스 읽어오기
			break;
			
		case("/search.do"):
			c_command = new CSearchCommand(); //내가 이름 지어주기
			c_command.execute(request, response); // 이건 다 있어야됨
			c_viewPage = "c_list.jsp"; // 데이터베이스 읽어오기
			
			o_command = new OSearchCommand(); //내가 이름 지어주기
			o_command.execute(request, response); // 이건 다 있어야됨
			o_viewPage = "o_list.jsp"; // 데이터베이스 읽어오기
			
			p_command = new PSearchCommand(); //내가 이름 지어주기
			p_command.execute(request, response); // 이건 다 있어야됨
			p_viewPage = "p_list.jsp"; // 데이터베이스 읽어오기
			
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
