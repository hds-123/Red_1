package com.shoes.product.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shoes.dao.PDao;
import com.shoes.dto.PDto;

public class PContentCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse responsen) {
		// TODO Auto-generated method stub
		
		
		String productid = request.getParameter("productid");
		PDao pDao = new PDao();
		PDto pDto = pDao.contentView(productid);
		request.setAttribute(productid, pDao);
		
	}

}
