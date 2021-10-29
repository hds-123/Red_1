package baby.calender.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baby.calender.dao.CDao;
import baby.calender.dto.CDto;
import baby.calender.dto.CDto1;

public class CSearchCommand implements CCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String queryName = request.getParameter("queryName");
		String queryContent = request.getParameter("queryContent");
		String start_date = request.getParameter("start_date");
		String end_date = request.getParameter("end_date");
		String userid = request.getParameter("userid");
		
		CDao dao = new CDao();
		ArrayList<CDto1> dtos = dao.search(queryName, queryContent, start_date, end_date, userid);
		request.setAttribute("list", dtos);

	}

}
