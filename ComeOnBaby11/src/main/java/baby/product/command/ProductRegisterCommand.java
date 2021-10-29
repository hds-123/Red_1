package baby.product.command;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import baby.board.dao.ProductDao;

public class ProductRegisterCommand implements ProductCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		// TODO Auto-generated method stub
		ServletContext context = request.getServletContext();
		String directory = context.getRealPath("/upload/");

//		String directory = appliacation.getRealPath("/upload/");
		int maxSize = 1024 * 1024 * 100;
		String encoding = "utf-8";
		
		MultipartRequest multipartRequest = null;
		try {
			multipartRequest = new MultipartRequest(request, directory, maxSize, encoding,
					new DefaultFileRenamePolicy());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//HttpSession session = request.getSession();
		String productname = multipartRequest.getParameter("productname");
		String productcategory = multipartRequest.getParameter("productcategory");
		int productprice = Integer.parseInt(multipartRequest.getParameter("productprice"));
		int productsaleprice = Integer.parseInt(multipartRequest.getParameter("productsaleprice"));
		String p_detail_category = multipartRequest.getParameter("p_detail_category");
		int detailAmount = Integer.parseInt(multipartRequest.getParameter("detailAmount"));
		String detailSize = multipartRequest.getParameter("detailSize");
		String detailColor = multipartRequest.getParameter("detailColor");
		
		String productImage = multipartRequest.getOriginalFileName("file");
		String productRealPath = multipartRequest.getOriginalFileName("file");
		
		System.out.println("*---------------------------");
		System.out.println("writeFile :" + productImage);
		System.out.println("writeRealfile :" + productRealPath);
		System.out.println("*---------------------------");
		
		ProductDao dao = new ProductDao();
		dao.productRegister(productname, productcategory, productprice, productsaleprice, p_detail_category,
					 productImage, productRealPath, detailAmount,  detailSize, detailColor);

	}

}
