package baby.checklist.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baby.calender.dao.CDao;
import baby.calender.dao.CheckDao;
import baby.calender.dto.CDto;
import baby.calender.dto.CheckDto;

public class CheckContentCommand implements CheckCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String checkCode = request.getParameter("checkCode");
		CheckDao dao = new CheckDao();
		CheckDto dto = dao.checklist_contentView(checkCode);
		
		request.setAttribute("checklist_content_view", dto);

	}

}
