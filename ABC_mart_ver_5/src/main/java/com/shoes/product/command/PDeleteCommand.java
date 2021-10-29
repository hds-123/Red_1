package com.shoes.product.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shoes.dao.PDao;

public class PDeleteCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse responsen) {
		
		
		String productid = request.getParameter("productid");

	
		
		PDao pDao = new PDao();	
		pDao.delete(productid);
	}

}
