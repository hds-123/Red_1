package baby.checklist.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CheckCommand {
	public void execute(HttpServletRequest request, HttpServletResponse response);

}
