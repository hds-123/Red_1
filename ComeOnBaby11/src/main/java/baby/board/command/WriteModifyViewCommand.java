package baby.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import baby.board.dao.WriteDao;
import baby.board.dto.writeDto;

public class WriteModifyViewCommand implements WriteCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		// TODO Auto-generated method stub
		String writeCode = request.getParameter("writeCode");
		WriteDao dao = new WriteDao();
		writeDto dto1 = dao.writeModifyView(writeCode);
		request.setAttribute("writemodi", dto1);

	}

}
