package baby.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import baby.board.dto.writeDto;

public class WriteDao {

	DataSource dataSource;
	  
		

	//constructor
	public WriteDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/comeon_baby");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}  

	
	// 게시판 글 목록 가져오기
		public ArrayList<writeDto> listboard(){
			ArrayList<writeDto> dtos = new ArrayList<writeDto>();
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			
			try {
				connection = dataSource.getConnection();
				
				String query = "select * from board";
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
				System.out.println("--->" + "List");
				
				while(resultSet.next()) {
					int writeCode = resultSet.getInt("writeCode");
					String user_userid = resultSet.getString("user_userid");
					String writeTitle = resultSet.getString("writeTitle");
					String writeContent = resultSet.getString("writeContent");
					String writeSortation = resultSet.getString("writeSortation");
					String writeLocation = resultSet.getString("writeLocation");
					String writeInsertdate = resultSet.getString("writeInsertdate");
					String writeModate = resultSet.getString("writeModate");
					String writeDeldate = resultSet.getString("writeDeldate");
					String writeFile = resultSet.getString("writeFile");
					String writeRealfile = resultSet.getString("writeRealfile");
					
					writeDto dto = new writeDto(writeCode, user_userid, writeTitle, writeContent, writeSortation, writeLocation, writeInsertdate, writeModate, writeDeldate, writeFile, writeRealfile);
					dtos.add(dto);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(resultSet != null) resultSet.close();
					if(preparedStatement != null) preparedStatement.close();
					if(connection != null) connection.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			return dtos;
		}//게시판 글 목록 가져오기 끝
		
		//게시판 글 작성하기		
		public void writeboard(String writeTitle, String writeContent, String writeSortation, String writeLocation, String writeFile, String writeRealfile, String user_userid) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			System.out.println("--> Insert");
			
			try {
				connection = dataSource.getConnection();
				System.out.println("----------------------------");
				System.out.println("writeTitle :" + writeTitle);
				System.out.println("writeContent :" + writeContent);
				System.out.println("writeSortation :" + writeSortation);
				System.out.println("writeLocation :" + writeLocation);
				System.out.println("writeFile :" + writeFile);
				System.out.println("writeRealfile :" + writeRealfile);
				System.out.println("user_userid :" + user_userid);
				System.out.println("----------------------------");
				String query = "insert into board (writeTitle, writeContent, writeSortation, writeLocation, writeFile, writeRealfile, user_userid, writeInsertdate) values (?,?,?,?,?,?,?, now())";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, writeTitle);
				preparedStatement.setString(2, writeContent);
				preparedStatement.setString(3, writeSortation);
				preparedStatement.setString(4, writeLocation);
				preparedStatement.setString(5, writeFile);
				preparedStatement.setString(6, writeRealfile);
				preparedStatement.setString(7, user_userid);
				
				preparedStatement.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(preparedStatement != null) preparedStatement.close();
					if(connection != null) connection.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}//write
		
		  //첨부 파일을 올리기
		/*
		public int fileboard(String writeFile, String writeRealfile) {
			
		  Connection connection = null;
		  PreparedStatement preparedStatement = null;
		  
		  try { 
			  connection = dataSource.getConnection();
		  
			  String query = "insert into board (writeFile, writeRealfile) values (?, ?)";
		  
			  preparedStatement = connection.prepareStatement(query);
			  
			  preparedStatement.setString(1, writeFile);
			  preparedStatement.setString(2, writeRealfile);
			  
			  return preparedStatement.executeUpdate();
		  
		  }catch(Exception e) { 
			  	e.printStackTrace();
		  }
		  		return -1;
		  }// 파일 업로드
		*/
		//페이징, 게시물의 전체 개수 알아내기
		public int selectCnt(String table) {
			ResultSet resultSet = null;
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			
			int result = 0;
			
			try {
				connection = dataSource.getConnection();
				
				String query = "select count(*) from " + table; //해당 테이블을 불러올 수 있음
				//ex) "select count(*) from " + board;
				
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
					if(resultSet.next()) {
						result = resultSet.getInt(1);
					}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					resultSet.close();
					preparedStatement.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			return result;
		}
		//selectPage
		public Vector<writeDto> selectPage(String table, int start, int pageCnt){
			ResultSet resultSet = null;
			PreparedStatement preparedStatement = null;
			Connection connection = null;
			
			Vector<writeDto> v = new Vector<writeDto>();
			
			try {
				connection = dataSource.getConnection();
				
				String query = "select * from "+ table + " limit ?, ?"; //테이블 이름 입력하면 해당 테이블 테이블 행 범위 지정 가능
				//ex) String query = "select * from "+ board + " limit 0, 10";
				//ex) 게시물이 50개인 "board"라는 테이블이 있으면 limit 0, 10이면 10행의 게시물을 보여줌// 총 5페이지를 볼 수 있음.
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, start);
				preparedStatement.setInt(2, pageCnt);
				
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					writeDto dto = new writeDto();
					dto.setWriteCode(resultSet.getInt("writeCode"));
					dto.setUser_userid(resultSet.getString("user_userid"));
					dto.setWriteContent(resultSet.getString("writeContent"));
					dto.setWriteTitle(resultSet.getString("writeTitle"));
					dto.setWriteSortation(resultSet.getString("writeSortation"));
					dto.setWriteLocation(resultSet.getString("writeLocation"));
					dto.setWriteInsertdate(resultSet.getString("writeInsertdate"));
					dto.setWriteModate(resultSet.getString("writeModate"));
					dto.setWriteFile(resultSet.getString("writeFile"));
					dto.setWriteRealfile(resultSet.getString("writeRealfile"));
					
					v.add(dto);
//					System.out.println("--->제품 리스트 조회" + v);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					resultSet.close();
					preparedStatement.close();
					connection.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			return v;
		}
		
		//게시글을 수정하기 위해 글 정보 가져오기
		public writeDto writeModifyView(String writecodes) {
			writeDto dto1 = null;
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			
			try {
				connection = dataSource.getConnection();
				
				String query = "select * from board where writeCode = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, writecodes);
				
				resultSet = preparedStatement.executeQuery();
				
				if(resultSet.next()) {
					int writeCode = resultSet.getInt("writeCode");
					String user_userid = resultSet.getString("user_userid");
					String writeTitle = resultSet.getString("writeTitle");
					String writeContent = resultSet.getString("writeContent");
					String writeSortation = resultSet.getString("writeSortation");
					String writeLocation = resultSet.getString("writeLocation");
					String writeInsertdate = resultSet.getString("writeInsertdate");
					String writeModate = resultSet.getString("writeModate");
					String writeDeldate = resultSet.getString("writeDeldate");
					String writeFile = resultSet.getString("writeFile");
					String writeRealfile = resultSet.getString("writeRealfile");
					
				dto1 = new writeDto(writeCode, user_userid, writeTitle, writeContent, writeSortation, writeLocation, writeInsertdate, writeModate, writeDeldate, writeFile, writeRealfile);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(resultSet != null) resultSet.close();
					if(preparedStatement != null) preparedStatement.close();
					if(connection != null) connection.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			return dto1;
		}//게시글을 수정하기 위해 글 정보 가져오기
		
		//게시글을 수정하기
		public void writemodify(int writeCode, String writeTitle, String writeContent, String writeSortation, String writeLocation, String writeFile, String writeRealfile) {
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			
			try {
				connection = dataSource.getConnection();
				
				String query = "update board set writeTitle=?, writeContent=?, writeSortation=?, writeLocation=?, writeModate=now(), writeFile=?, writeRealfile=? where writeCode=?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, writeTitle);
				preparedStatement.setString(2, writeContent);
				preparedStatement.setString(3, writeSortation);
				preparedStatement.setString(4, writeLocation);
				preparedStatement.setString(5, writeFile);
				preparedStatement.setString(6, writeRealfile);
				preparedStatement.setInt(7, writeCode);
				
				preparedStatement.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(preparedStatement != null) preparedStatement.close();
					if(connection != null) connection.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}//게시글 수정하기
		
		//게시글 삭제하기
		public void writedelete(String writeCode) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			
			try {
				connection = dataSource.getConnection();
				
				String query = "delete from board where writeCode = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, Integer.parseInt(writeCode));
				
				preparedStatement.executeUpdate();
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(preparedStatement != null) preparedStatement.close();
					if(connection != null) connection.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}//delete
		
		//저장된 사진을 불러오기
//		public void writeGetimg(String writeCode) {
//			Connection connection = null;
//			PreparedStatement preparedStatement = null;
//			ResultSet resultSet = null;
//			
//			try {
//				connection = dataSource.getConnection();
//				
//				String query = "select writeRealfile from board where writeCode = ?";
//				preparedStatement = connection.prepareStatement(query);
//				preparedStatement.setInt(1, Integer.parseInt(writeCode));
//				
//				preparedStatement.executeUpdate();
//					if(resultSet.next()) {
//						Blob blob = resultSet.getBlob("writeRealfile");
//				        byte byteArray[] = blob.getBytes(1, (int)blob.length());
//				        response.setContentType("image/gif");
//				        OutputStream os = response.getOutputStream();
//				        os.write(byteArray);
//				        os.flush();
//				        os.close();
//						
//					}
//				
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//
//		}
		
		//게시판 검색하기
		
		public Vector<writeDto> search(int start, int pageCnt, String searchName, String searchContent){
			ResultSet resultSet = null;
			PreparedStatement preparedStatement = null;
			Connection connection = null;
			
			Vector<writeDto> v = new Vector<writeDto>();
			
			try {
				connection = dataSource.getConnection();
				
				String WhereDefault = "select * from board " ;
				String WhereDefault2 = "where " + searchName + " like '%" + searchContent + "%'" + " limit ?, ?";				
				
				
				//ex) String query = "select * from "+ board + " limit 0, 10";
				//ex) 게시물이 50개인 "board"라는 테이블이 있으면 limit 0, 10이면 10행의 게시물을 보여줌// 총 5페이지를 볼 수 있음.
				preparedStatement = connection.prepareStatement(WhereDefault + WhereDefault2);
				preparedStatement.setInt(1, start);
				preparedStatement.setInt(2, pageCnt);
				
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					writeDto dto = new writeDto();
					dto.setWriteCode(resultSet.getInt("writeCode"));
					dto.setUser_userid(resultSet.getString("user_userid"));
					dto.setWriteContent(resultSet.getString("writeContent"));
					dto.setWriteTitle(resultSet.getString("writeTitle"));
					dto.setWriteSortation(resultSet.getString("writeSortation"));
					dto.setWriteLocation(resultSet.getString("writeLocation"));
					dto.setWriteInsertdate(resultSet.getString("writeInsertdate"));
					dto.setWriteModate(resultSet.getString("writeModate"));
					dto.setWriteFile(resultSet.getString("writeFile"));
					dto.setWriteRealfile(resultSet.getString("writeRealfile"));
					
					v.add(dto);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					resultSet.close();
					preparedStatement.close();
					connection.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			return v;
		}
		
		public int selectSortationCnt(String table, String searchName, String searchContent) {
			ResultSet resultSet = null;
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			
			int result = 0;
			
			try {
				connection = dataSource.getConnection();
				
				String query = "select count(*) from " + table;
				String query2 = " where " + searchName + " like '%" + searchContent + "%'";//해당 테이블을 불러올 수 있음
				//ex) "select count(*) from " + board;
				
				preparedStatement = connection.prepareStatement(query + query2);
				resultSet = preparedStatement.executeQuery();
					if(resultSet.next()) {
						result = resultSet.getInt(1);
					}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					resultSet.close();
					preparedStatement.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			return result;
		}
		
		
//		public ArrayList<writeDto> search(String searchName, String searchContent){
//			ArrayList<writeDto> searchs = new ArrayList<writeDto>();
//			
//			Connection connection = null;
//			PreparedStatement preparedStatement = null;
//			ResultSet resultSet = null;
//			
//			String WhereDefault = "select * from board ";
//			String WhereDefault2 = "where " + searchName + " like '%" + searchContent + "%'";
//			
//			System.out.println("***" + searchName + "/" + searchContent);
//			System.out.println(WhereDefault + WhereDefault2);
//			
//			try {
//				connection = dataSource.getConnection();
//				
//				preparedStatement = connection.prepareStatement(WhereDefault + WhereDefault2);
//				resultSet = preparedStatement.executeQuery();
//				
//				while(resultSet.next()) {
//					int writeCode = resultSet.getInt("writeCode");
//					String user_userid = resultSet.getString("user_userid");
//					String writeTitle = resultSet.getString("writeTitle");
//					String writeContent = resultSet.getString("writeContent");
//					String writeSortation = resultSet.getString("writeSortation");
//					String writeLocation = resultSet.getString("writeLocation");
//					String writeInsertdate = resultSet.getString("writeInsertdate");
//					String writeModate = resultSet.getString("writeModate");
//					String writeDeldate = resultSet.getString("writeDeldate");
//					String writeFile = resultSet.getString("writeFile");
//					String writeRealfile = resultSet.getString("writeRealfile");
//
//					
//					writeDto dto = new writeDto(writeCode, user_userid, writeTitle, writeContent, writeSortation, writeLocation, writeInsertdate, writeModate, writeDeldate, writeFile, writeRealfile);
//					searchs.add(dto);
//					System.out.println(writeTitle);
//				}
//				
//			}catch(Exception e) {
//				e.printStackTrace();
//			}finally {
//				try {
//					if(resultSet != null) resultSet.close();
//					if(preparedStatement != null) preparedStatement.close();
//					if(connection != null) connection.close();
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//			return searchs;
//		}//search
		
		 
		
}
