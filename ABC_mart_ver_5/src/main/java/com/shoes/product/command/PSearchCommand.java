package com.shoes.product.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shoes.dao.PDao;
import com.shoes.dto.PDto;

public class PSearchCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse responsen) {
		String queryName = request.getParameter("query");
		String queryContent = request.getParameter("content");
		
		
		PDao pDao = new PDao();
		ArrayList<PDto> pDtos = pDao.search(queryName, queryContent);
		request.setAttribute("list", pDtos);
	
	}
}
