package baby.calender.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baby.calender.dao.CDao;
import baby.calender.dto.CDto;

public class TWriteCommand implements CCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
//		String calUserid = request.getParameter("calUserid");
		String calStartday = request.getParameter("calStartday");
		int calCycle = Integer.parseInt(request.getParameter("calCycle"));
		String pps ="";
		
		CDao dao = new CDao();
		dao.mytemp_calc(calStartday, calCycle, pps);

	}

}
