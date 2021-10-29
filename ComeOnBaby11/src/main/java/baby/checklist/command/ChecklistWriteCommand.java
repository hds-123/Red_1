package baby.checklist.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baby.calender.dao.CDao;
import baby.calender.dao.CheckDao;

public class ChecklistWriteCommand implements CheckCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String checkAppHospital = request.getParameter("checkAppHospital");
		String checkAppointdate = request.getParameter("checkAppointdate");
		String checkHAddress1 = request.getParameter("checkHAddress1");
		String checkHAddress2 = request.getParameter("checkHAddress2");
		String checkRelation = request.getParameter("checkRelation");
		String checkBodytemp = request.getParameter("checkBodytemp");
		String checkAppointTime = request.getParameter("checkAppointTime");
		String checkDrug = request.getParameter("checkDrug");
		
		CheckDao dao = new CheckDao();
		dao.checklist_write(checkAppHospital, checkAppointdate, checkHAddress1, checkHAddress2, checkRelation, 
				checkBodytemp, checkAppointTime, checkDrug);

	}

}
