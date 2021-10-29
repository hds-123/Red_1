package com.jsplec.bbs.Command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.UDao;
import com.jsplec.bbs.dto.UDto;

public class USearchCommand implements UCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse responsen) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				String query = request.getParameter("query1");
				String content = request.getParameter("content");
				
				
				UDao dao = new UDao();
				ArrayList<UDto> dtos =  dao.search(query, content);
				request.setAttribute("list", dtos);
			
	}

}
