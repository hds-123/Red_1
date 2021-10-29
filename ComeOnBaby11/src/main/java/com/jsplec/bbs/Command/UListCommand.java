package com.jsplec.bbs.Command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.UDao;
import com.jsplec.bbs.dto.UDto;

public class UListCommand implements UCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse responsen) {
		// TODO Auto-generated method stub

		UDao uDao = new UDao();
		ArrayList<UDto> uDtos = uDao.list();
		request.setAttribute("list", uDtos);
		
	}

}
