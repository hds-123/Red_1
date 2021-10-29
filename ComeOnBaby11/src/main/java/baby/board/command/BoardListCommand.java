package baby.board.command;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import baby.board.dao.WriteDao;
import baby.board.dto.writeDto;

public class BoardListCommand implements WriteCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		
//		WriteDao dao = new WriteDao();
//		ArrayList<writeDto> dtos = dao.listboard();
//		ArrayList<writeDto> dtos = dao.selectPage("board", 0, 10);
		
//		System.out.println("==>>>" + dtos.get(0).getWriteTitle());
//		request.setAttribute("listboard", dtos);
		
		WriteDao dao = new WriteDao();
		int count = dao.selectCnt("board"); //전체 행 개수
		String tempStart = request.getParameter("page"); //현재 페이지를 받아옴
		
		int startPage = 0; //limit의 시작값
		int onePageCnt = 10; //한 페이지의 행 개수
		
		count = (int)Math.ceil((double)count/(double)onePageCnt); //페이지 수 저장
		
		if(tempStart != null){
			startPage = (Integer.parseInt(tempStart)-1)*onePageCnt;
		}
		System.out.println("*****" + count);
		Vector<writeDto> v = dao.selectPage("board", startPage, onePageCnt);
		request.setAttribute("listboard", v);
		request.setAttribute("count", count);

	}

}
