package baby.board.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;
import com.mysql.cj.xdevapi.PreparableStatement;

public class commentDao {

	DataSource dataSource;
	
	public commentDao() {
		// TODO Auto-generated constructor stub
	}

	//댓글 정보를 전달받아 AJAX_COMMENT테이블에 저장된 댓글을 변경하고 변경행의 개수를 반환
//	public int updateAjaxComment() {
//		Connection conn = null;
//		PreparableStatement psm = null;
//		
//		int rows = 0;
//		
//		try {
//			conn = dataSource.getConnection();
//			
//			String query = "update comment set ";
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(conn != null) conn.close();
//				psm.close();
//				
//			}catch(Exception e)
//				e.printStackTrace();
//		}
//}
	
}
