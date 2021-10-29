package baby.checklist.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baby.calender.dao.CheckDao;

public class CheckDeleteCommand implements CheckCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String checkCode = request.getParameter("checkCode");
		CheckDao dao = new CheckDao();
		dao.checklist_delete(checkCode);

	}

}
