package baby.checklist.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baby.calender.dao.CDao;
import baby.calender.dao.CheckDao;
import baby.calender.dto.CDto1;
import baby.calender.dto.CheckDto;

public class CheckSearchCommand implements CheckCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String queryName = request.getParameter("queryName");
		String queryContent = request.getParameter("queryContent");
		String startAppointdate = request.getParameter("startAppointdate");
		String endAppointdate = request.getParameter("endAppointdate");
		
		CheckDao dao = new CheckDao();
		ArrayList<CheckDto> dtos = dao.search(queryName, queryContent, startAppointdate, endAppointdate);
		request.setAttribute("checklist", dtos);
		

	}

}
