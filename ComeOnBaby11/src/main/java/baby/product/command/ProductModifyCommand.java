package baby.product.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import baby.board.dao.ProductDao;

public class ProductModifyCommand implements ProductCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		// TODO Auto-generated method stub
		String productid = request.getParameter("productid");
		String productname = request.getParameter("productname");
		String productcategory = request.getParameter("productcategory");
		String productprice = request.getParameter("productprice");
		String productsaleprice = request.getParameter("productsaleprice");
		String p_detail_category = request.getParameter("p_detail_category");
		
		ProductDao dao = new ProductDao();
		dao.product_modify(productid, productname, productcategory, productprice, productsaleprice, p_detail_category);

	}

}
