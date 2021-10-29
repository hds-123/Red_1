package baby.calender.command;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import baby.calender.dao.CDao;

public class CModifyCommand implements CCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServletContext context = request.getServletContext();
		String directory = context.getRealPath("/upload/");
 
//		String directory = appliacation.getRealPath("/upload/");
		int maxSize = 1024 * 1024 * 100;
		String encoding = "utf-8";
		
		MultipartRequest multipartRequest = null;
		try {
			multipartRequest = new MultipartRequest(request, directory, maxSize, encoding,
					new DefaultFileRenamePolicy());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int calCode = Integer.parseInt(request.getParameter("calCode"));
		String calInsertdate = request.getParameter("calInsertdate");
		String calTitle = request.getParameter("calTitle");
		String calContent = request.getParameter("calContent");
		String calCycle = request.getParameter("calCycle");
		String calStartday = request.getParameter("calStartday");
		String calEndday = request.getParameter("calEndday");
		String calFeel = request.getParameter("calFeel");
		String calPhoto = request.getParameter("file");
		String calPhoto_real = request.getParameter("file");
		
//		System.out.println(calStartday);
		
		CDao dao = new CDao();
		dao.modify(calCode, calInsertdate, calTitle, calContent, calCycle, calStartday, calEndday, calFeel, calPhoto, calPhoto_real);

	}

}
