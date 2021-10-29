package baby.calender.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baby.calender.dao.CDao;
import baby.calender.dto.CDto;

public class CListCommand implements CCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		CDao dao = new CDao();
		ArrayList<CDto> dtos = dao.list();
		request.setAttribute("list", dtos);

	}

}
