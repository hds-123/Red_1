package com.jsplec.bbs.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.UDao;

public class UDeleteCommand implements UCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse responsen) {
		// TODO Auto-generated method stub

		String userid = request.getParameter("userid");
	
		
		UDao dao = new UDao();
		dao.delete(userid);
	}

}
