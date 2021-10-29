package baby.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public interface WriteCommand {
	
	public void execute(HttpServletRequest request,HttpServletResponse response, HttpSession session);

}
