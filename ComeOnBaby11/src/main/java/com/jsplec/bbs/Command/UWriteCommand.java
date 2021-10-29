package com.jsplec.bbs.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.UDao;

public class UWriteCommand implements UCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse responsen) {
		// TODO Auto-generated method stub
		String userid = request.getParameter("id");
		String userpw = request.getParameter("pw");
		String username = request.getParameter("name");
		String useraddress1 = request.getParameter("roadaddress");
		String useraddress2 = request.getParameter("detailaddress");
		String userphone = request.getParameter("phone");
		String userbirth = request.getParameter("date");
		String useremail = request.getParameter("email");
		String userhospital = request.getParameter("userhospital");
		UDao uDao = new UDao();
		uDao.write(userid, userpw, username, useraddress1, useraddress2, userphone, userbirth, useremail, userhospital);	
	}
}
