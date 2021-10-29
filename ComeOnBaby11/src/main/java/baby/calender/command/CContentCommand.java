package baby.calender.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baby.calender.dao.CDao;
import baby.calender.dto.CDto;

public class CContentCommand implements CCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String calCode = request.getParameter("calCode");
		
		CDao dao = new CDao();
		CDto dto = dao.contentView(calCode);
		
		request.setAttribute("content_view", dto);

	}

}
