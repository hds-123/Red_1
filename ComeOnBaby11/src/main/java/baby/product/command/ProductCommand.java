package baby.product.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public interface ProductCommand {
	
	public void execute(HttpServletRequest request,HttpServletResponse response, HttpSession session);

}
