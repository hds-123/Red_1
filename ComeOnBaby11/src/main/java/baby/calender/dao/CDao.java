package baby.calender.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


import baby.calender.dto.CDto;
import baby.calender.dto.CDto1;

public class CDao {
	
DataSource dataSource;
	
	public CDao() {
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/comeon_baby");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public  ArrayList<CDto> list(){
		ArrayList<CDto> dtos = new ArrayList<CDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
	try {
		connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
		
		String query = "select calCode, calInsertdate, calTitle, calContent, calFeel, calPhoto, calStartday, calEndday, calCycle, calUserid, calCheckCode, calPhoto_real from calender";
		preparedStatement = connection.prepareStatement(query);
		resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			int calCode = resultSet.getInt("calCode"); //sql 컬럼이름과 같아야 됨 
			String calInsertdate = resultSet.getString("calInsertdate");
			String calTitle = resultSet.getString("calTitle");
			String calContent = resultSet.getString("calContent");
			String calFeel = resultSet.getString("calFeel");
			String calPhoto = resultSet.getString("calPhoto");
			String calStartday = resultSet.getString("calStartday");
			String calEndday = resultSet.getString("calEndday");
			int calCycle = resultSet.getInt("calCycle");
			String calUserid = resultSet.getString("calUserid");
			String calCheckCode = resultSet.getString("calCheckCode");
			String calPhoto_real = resultSet.getString("calPhoto_real");
			CDto dto = new CDto(calCode, calInsertdate, calTitle, calContent, calFeel, calStartday, calEndday, calCycle, calPhoto, calUserid, calCheckCode, calPhoto_real); // 이제 한줄로 데이터를 박싱했음
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
	}// list
	
	public void write(String calTitle, String calContent, String calCycle, String calStartday, String calEndday, String calFeel, String calPhoto, String calPhoto_real) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "insert into calender (calCode, calInsertdate, calTitle, calContent, calCycle, calStartday, calEndday, calFeel, calPhoto, calPhoto_real) values (null, now(), ?, ?, ?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, calTitle);
			preparedStatement.setString(2, calContent);
			preparedStatement.setString(3, calCycle);
			preparedStatement.setString(4, calStartday);
			preparedStatement.setString(5, calEndday);
			preparedStatement.setString(6, calFeel);
			preparedStatement.setString(7, calPhoto);
			preparedStatement.setString(8, calPhoto_real);
			
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
}// write
	
	public CDto contentView(String scalCode) {
		CDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "select * from calender where calCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(scalCode));
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int calCode = resultSet.getInt("calCode");
				String calInsertdate = resultSet.getString("calInsertdate");
				String calTitle = resultSet.getString("calTitle");
				String calContent = resultSet.getString("calContent");
				int calCycle = resultSet.getInt("calCycle");
				String calStartday = resultSet.getString("calStartday");
				String calEndday = resultSet.getString("calEndday");
				String calFeel = resultSet.getString("calFeel");
				String calPhoto = resultSet.getString("calPhoto");
				String calUserid = resultSet.getString("calUserid");
				String calCheckCode = resultSet.getString("calCheckCode");
				String calPhoto_real = resultSet.getString("calPhoto_real");
				
				dto = new CDto(calCode, calInsertdate, calTitle, calContent, calFeel, calStartday, calEndday, calCycle, calPhoto, calUserid, calCheckCode, calPhoto_real); // 이제 한줄로 데이터를 박싱했음
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
		return dto;
	}//contentView
	
	public void delete(String calCode) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "delete from calender where calCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(calCode));
			
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
	
	}// delete
	
	public void modify(int calCode, String calInsertdate, String calTitle, String calContent, String calCycle, String calStartday, String calEndday, String calFeel, String calPhoto, String calPhoto_real) { // 받아올것이 없으므로 void
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "update calender set calInsertdate=?, calTitle=?, calContent=?, calCycle=?, calStartday=?, calEndday=?, calFeel=?, calPhoto=? calPhoto_real=? where calCode = ?"; // mysql에서 잘 되면 복붙ㄲ
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, calInsertdate);
			preparedStatement.setString(2, calTitle);
			preparedStatement.setString(3, calContent);
			preparedStatement.setString(4, calCycle);
			preparedStatement.setString(5, calStartday);
			preparedStatement.setString(6, calEndday);
			preparedStatement.setString(7, calFeel);
			preparedStatement.setString(8, calPhoto);
			preparedStatement.setString(9, calPhoto_real);
			preparedStatement.setInt(10, calCode);
			
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
}// modify
	
	public ArrayList<CDto1> search(String queryName, String queryContent, String start_date, String end_date, String userid) { // 받아올것이 없으므로 void
		ArrayList<CDto1> dtos = new ArrayList<CDto1>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "select calCode, calInsertdate, calTitle, calContent, calCycle, calStartday, calEndday, calFeel, calPhoto from calender where " + queryName + " like '%" + queryContent + "%'";
			
			String query2 =" and calInsertdate >= '" + start_date + "' and calInsertdate <= '" + end_date +"'";
			
			String query3 =" and userid = ?";
			preparedStatement = connection.prepareStatement(query+query2+query3);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int calCode = resultSet.getInt("calCode"); //sql 컬럼이름과 같아야 됨 
				String calInsertdate = resultSet.getString("calInsertdate");
				String calTitle = resultSet.getString("calTitle");
				String calContent = resultSet.getString("calContent");
				String calFeel = resultSet.getString("calFeel");
				String calStartday = resultSet.getString("calStartday");
				String calEndday = resultSet.getString("calEndday");
				int calCycle = resultSet.getInt("calCycle"); //sql 컬럼이름과 같아야 됨 
				String calPhoto = resultSet.getString("calPhoto");
				CDto1 dto = new CDto1(calCode, calInsertdate, calTitle, calContent, calFeel, calStartday, calEndday, calCycle, calPhoto); // 이제 한줄로 데이터를 박싱했음
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
	}// search
	
	public void mytemp_calc(String calStartday, int calCycle, String pps) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		//PreparedStatement preparedStatement1 = null;
		//PreparedStatement preparedStatement2 = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "SELECT DATE_ADD("+calStartday+", INTERVAL ("+calCycle+"-14) DAY) as pp;";
			//String query1 = "SELECT DATE_ADD(calStartday, INTERVAL (calCycle-14-3) DAY);";
			//String query2 = "SELECT DATE_ADD(calStartday, INTERVAL (calCycle-14+3) DAY);";
			
			preparedStatement = connection.prepareStatement(query);
			//preparedStatement1 = connection.prepareStatement(query1);
			//preparedStatement2 = connection.prepareStatement(query2);
			
			resultSet = preparedStatement.executeQuery();
			//preparedStatement1.executeUpdate();
			//preparedStatement2.executeUpdate();
			if(resultSet.next()) {
				pps = resultSet.getString("pp"); //sql 컬럼이름과 같아야 됨 
				System.out.println("--------------");
				System.out.println("preparedStatement : " + preparedStatement);
				System.out.println("resultSet : " + resultSet);
				System.out.println("pps : " + pps);
				System.out.println("--------------");
			}
			

			
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
}// mytemp_calc


}//
