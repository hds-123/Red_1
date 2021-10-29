package baby.product.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import baby.board.dao.ProductDao;
import baby.board.dto.ProductDto;

public class ProductContentCommand implements ProductCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		// TODO Auto-generated method stub
		String productid = request.getParameter("productid");
		
		System.out.println("-----------");
		System.out.println(productid);
		System.out.println("-----------");
		
		ProductDao dao = new ProductDao();
		ProductDto dto = dao.product_contentView(productid);
		
		request.setAttribute("product_content_view", dto);

	}

}
