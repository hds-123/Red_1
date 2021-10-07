package com.jsplec.bbs.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.TDao;
import com.jsplec.bbs.dto.TDto;


public class TListCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse responsen) {
		TDao dao = new TDao();
		ArrayList<TDto> dtos = dao.list();
		request.setAttribute("list", dtos);

	}

}
