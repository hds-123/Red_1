package baby.checklist.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baby.calender.dao.CheckDao;
import baby.calender.dto.CheckDto;

public class CheckListCommand implements CheckCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		CheckDao dao = new CheckDao();
		ArrayList<CheckDto> dtos = dao.checklist();
		request.setAttribute("checklist", dtos);

	}

}
