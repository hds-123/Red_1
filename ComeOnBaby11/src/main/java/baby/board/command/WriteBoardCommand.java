package baby.board.command;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import baby.board.dao.WriteDao;

public class WriteBoardCommand implements WriteCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		
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
		
		//HttpSession session = request.getSession();
		String writeTitle = multipartRequest.getParameter("writeTitle");
		String writeContent = multipartRequest.getParameter("writeContent");
		String writeSortation = multipartRequest.getParameter("writeSortation");
		String writeLocation = multipartRequest.getParameter("writeLocation");
		String user_userid = multipartRequest.getParameter("user_userid");
		
		String writeFile = multipartRequest.getOriginalFileName("file");
		String writeRealfile = multipartRequest.getOriginalFileName("file");
		
		System.out.println("*---------------------------");
		System.out.println("writeFile :" + writeFile);
		System.out.println("writeRealfile :" + writeRealfile);
		System.out.println("*---------------------------");
		
		WriteDao dao = new WriteDao();
		dao.writeboard(writeTitle, writeContent, writeSortation, writeLocation, writeFile, writeRealfile, user_userid );
		
	}

}
