package com.shoes.product.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface PCommand {

	public void execute(HttpServletRequest request,HttpServletResponse responsen);
	
}
