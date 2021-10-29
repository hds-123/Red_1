package com.shoes.product.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shoes.dao.PDao;

public class PWriteCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse responsen) {

		String productname = request.getParameter("productname");
		String productprice = request.getParameter("productprice");
		String productsize = request.getParameter("productsize");
		String productsection = request.getParameter("productsection");
		String productcolor = request.getParameter("productcolor");
		String productqnt = request.getParameter("productqnt");
		String productputin = request.getParameter("productputin");
		String productmadein = request.getParameter("productmadein");
		
	
		PDao pDao = new PDao();
		pDao.write(productname,productprice,productsize,productsection,productcolor,productqnt,productputin,productmadein);
	}

}
