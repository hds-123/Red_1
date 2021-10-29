package com.jsplec.bbs.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.UDao;
import com.jsplec.bbs.dto.UDto;

public class UContentCommand implements UCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse responsen) {

		String userid = request.getParameter("userid");
		
		UDao uDao = new UDao();
		UDto uDto = uDao.contentView(userid);
		request.setAttribute("content_view", uDto);
		
		
	}

}
