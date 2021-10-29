package baby.board.command;

import java.util.ArrayList;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import baby.board.dao.WriteDao;
import baby.board.dto.writeDto;

public class listboardSearchCommand implements WriteCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		// TODO Auto-generated method stub
		String searchName = request.getParameter("search");
		String searchContent = request.getParameter("content");
		
		WriteDao dao = new WriteDao();
		int count = dao.selectSortationCnt("board",searchName, searchContent); //전체 행 개수
		String tempStart = request.getParameter("page"); //현재 페이지를 받아옴
		
		int startPage = 0; //limit의 시작값
		int onePageCnt = 10; //한 페이지의 행 개수
		
		count = (int)Math.ceil((double)count/(double)onePageCnt); //페이지 수 저장
		
		if(tempStart != null){
			startPage = (Integer.parseInt(tempStart)-1)*onePageCnt;
		}
		
		Vector<writeDto> v = dao.search(startPage, onePageCnt, searchName, searchContent);
		request.setAttribute("listboard", v);
		request.setAttribute("count", count);

	}

}


/*
 * 		int count = dao.selectCnt("board"); //전체 행 개수
		String tempStart = request.getParameter("page"); //현재 페이지를 받아옴
		
		int startPage = 0; //limit의 시작값
		int onePageCnt = 10; //한 페이지의 행 개수
		
		count = (int)Math.ceil((double)count/(double)onePageCnt); //페이지 수 저장
		
		if(tempStart != null){
			startPage = (Integer.parseInt(tempStart)-1)*onePageCnt;
		}
		
		Vector<writeDto> v = dao.selectPage("board", startPage, onePageCnt);
		request.setAttribute("listboard", v);
		request.setAttribute("count", count);

 */
