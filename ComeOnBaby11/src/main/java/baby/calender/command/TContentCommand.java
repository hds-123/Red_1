package baby.calender.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baby.calender.dao.CDao;
import baby.calender.dto.CDto;

public class TContentCommand implements CCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String calStartday = request.getParameter("calStartday");
		String calCycle = request.getParameter("calCycle");
		String calTitle = request.getParameter("calTitle");
		String calContent = request.getParameter("calContent");
		
		CDao dao = new CDao();
//		dao.mytemp_list(calTitle, calContent, calCycle, calStartday);

	}

}
