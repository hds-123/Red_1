package baby.product.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import baby.board.dao.ProductDao;
import baby.board.dto.ProductDto;

public class ProductDetailViewCommand implements ProductCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		// TODO Auto-generated method stub
		String productid = request.getParameter("productid");
		ProductDao dao = new ProductDao();
		ProductDto dto = dao.ProductDetailView(productid);
		request.setAttribute("proview", dto);

	}

}
