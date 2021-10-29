package baby.calender.command;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import baby.calender.dao.CDao;

public class CWriteCommand implements CCommand {

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
		
		String calTitle = multipartRequest.getParameter("calTitle");
		String calContent = multipartRequest.getParameter("calContent");
		String calCycle = multipartRequest.getParameter("calCycle");
		String calStartday = multipartRequest.getParameter("calStartday");
		String calEndday = multipartRequest.getParameter("calEndday");
		String calFeel = multipartRequest.getParameter("calFeel");
		String calPhoto = multipartRequest.getParameter("file");
		String calPhoto_real = multipartRequest.getParameter("file");
		
		CDao dao = new CDao();
		dao.write(calTitle, calContent, calCycle, calStartday, calEndday, calFeel, calPhoto, calPhoto_real);

	}

}
