package com.jsplec.bbs.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UCommand {

	
	public void execute(HttpServletRequest request, HttpServletResponse responsen);
	
	
}
