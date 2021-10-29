package com.jsplec.bbs.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.UDao;

public class UModifyCommand implements UCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse responsen) {

		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		String username = request.getParameter("username");
		String useraddress1 = request.getParameter("useraddress1");
		String useraddress2 = request.getParameter("useraddress2");
		String userphone = request.getParameter("userphone");
		String userbirth = request.getParameter("userbirth");
		String useremail = request.getParameter("useremail");
		String userhospital = request.getParameter("userhospital");
		
		UDao uDao = new UDao();
		uDao.modify(userid, userpw, username, useraddress1, useraddress2, userphone, userbirth, useremail,userhospital);
		

		
	}

}
