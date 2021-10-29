package baby.product.command;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import baby.board.dao.ProductDao;
import baby.board.dto.ProductDto;

public class ProductSearchCommand implements ProductCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		// TODO Auto-generated method stub
		String searchName = request.getParameter("search");
		String searchContent = request.getParameter("content");
		
		ProductDao dao = new ProductDao();
		int count = dao.selectSortationCnt("product", searchName, searchContent); //전체 행 개수
		String tempStart = request.getParameter("page"); //현재 페이지를 받아옴
		
		int startPage = 0; //limit의 시작값
		int onePageCnt = 10; //한 페이지의 행 개수
		
		count = (int)Math.ceil((double)count/(double)onePageCnt); //페이지 수 저장
		
		if(tempStart != null){
			startPage = (Integer.parseInt(tempStart)-1)*onePageCnt;
		}
		
		Vector<ProductDto> v = dao.search(startPage, onePageCnt, searchName, searchContent);
		request.setAttribute("listproduct", v);
		request.setAttribute("count", count);

	}

}
