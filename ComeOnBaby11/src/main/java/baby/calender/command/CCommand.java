package baby.calender.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CCommand {
	public void execute(HttpServletRequest request, HttpServletResponse response);

}
