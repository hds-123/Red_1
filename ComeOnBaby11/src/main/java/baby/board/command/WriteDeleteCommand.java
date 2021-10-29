package baby.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import baby.board.dao.WriteDao;

public class WriteDeleteCommand implements WriteCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		
		String writeCode = request.getParameter("writeCode");
		
		WriteDao dao = new WriteDao();
		dao.writedelete(writeCode);

	}

}
