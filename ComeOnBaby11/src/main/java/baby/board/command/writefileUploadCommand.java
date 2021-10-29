package baby.board.command;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import baby.board.dao.WriteDao;


public class writefileUploadCommand implements WriteCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
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
		
		String writeFile = multipartRequest.getOriginalFileName("file");
		String writeRealfile = multipartRequest.getOriginalFileName("file");
		
		//new WriteDao().fileboard(writeFile, writeRealfile);
	}

}
