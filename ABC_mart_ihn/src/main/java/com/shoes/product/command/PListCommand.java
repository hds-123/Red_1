package com.shoes.product.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shoes.dao.PDao;
import com.shoes.dto.PDto;

public class PListCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse responsen) {
		
		PDao pDao = new PDao();
		ArrayList<PDto> pDtos = pDao.list();
		request.setAttribute("list", pDtos);
	}

}
