package baby.product.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import baby.board.dao.ProductDao;
import baby.board.dto.ProductDto;

public class OrderDetailCommand implements ProductCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		// TODO Auto-generated method stub
		int productid = Integer.parseInt(request.getParameter("productid"));
		int orderAmount = Integer.parseInt(request.getParameter("orderAmount"));
		int orderDeliverfee = Integer.parseInt(request.getParameter("orderDeliverfee"));
		
		System.out.println(productid+orderAmount+orderDeliverfee);
		
		ProductDao dao = new ProductDao();
		ProductDto dto = dao.orderDetailView(productid, orderAmount, orderDeliverfee);
		request.setAttribute("orderdetailview", dto);
		
		
	}

}
