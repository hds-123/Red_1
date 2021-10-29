package baby.calender.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import baby.calender.dto.CheckDto;

public class CheckDao {
	
	DataSource dataSource;
	
	public CheckDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/comeon_baby");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public  ArrayList<CheckDto> checklist(){
		ArrayList<CheckDto> dtos = new ArrayList<CheckDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
	try {
		connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
		
		String query = "select checkCode, checkDrug, checkAppHospital, checkAppointdate, checkAppointTime, checkBodytemp, checkRelation, checkHAddress1, checkHAddress2 from checklist";
		preparedStatement = connection.prepareStatement(query);
		resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			int checkCode = resultSet.getInt("checkCode"); //sql 컬럼이름과 같아야 됨 
			String checkDrug = resultSet.getString("checkDrug");
			String checkAppHospital = resultSet.getString("checkAppHospital");
			String checkAppointdate = resultSet.getString("checkAppointdate");
			String checkAppointTime = resultSet.getString("checkAppointTime");
			String checkBodytemp = resultSet.getString("checkBodytemp");
			String checkRelation = resultSet.getString("checkRelation");
			String checkHAddress1 = resultSet.getString("checkHAddress1");
			String checkHAddress2 = resultSet.getString("checkHAddress2");
			CheckDto dto = new CheckDto(checkCode, checkDrug, checkAppHospital, checkAppointdate, checkAppointTime, checkBodytemp, checkRelation, checkHAddress1, checkHAddress2); // 이제 한줄로 데이터를 박싱했음
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
	
	public void checklist_write(String checkAppHospital, String checkAppointdate, 
			String checkHAddress1, String checkHAddress2, String checkRelation, 
			String checkBodytemp, String checkAppointTime, String checkDrug) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "insert into checklist (checkAppHospital, checkAppointdate, "
					+ "checkHAddress1, checkHAddress2, checkRelation, checkBodytemp, "
					+ "checkAppointTime, checkDrug) values (?, ?, ?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, checkAppHospital);
			preparedStatement.setString(2, checkAppointdate);
			preparedStatement.setString(3, checkHAddress1);
			preparedStatement.setString(4, checkHAddress2);
			preparedStatement.setString(5, checkRelation);
			preparedStatement.setString(6, checkBodytemp);
			preparedStatement.setString(7, checkAppointTime);
			preparedStatement.setString(8, checkDrug);
			
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
	
	public CheckDto checklist_contentView(String scheckCode) {
		CheckDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "select checkCode, checkAppointdate, checkAppointTime, checkAppHospital, checkHAddress1, checkHAddress2, checkRelation, checkBodytemp, checkDrug from checklist where checkCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(scheckCode));
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int checkCode = resultSet.getInt("checkCode");
				String checkAppointdate = resultSet.getString("checkAppointdate");
				String checkAppointTime = resultSet.getString("checkAppointTime");
				String checkAppHospital = resultSet.getString("checkAppHospital");
				String checkHAddress1 = resultSet.getString("checkHAddress1");
				String checkHAddress2 = resultSet.getString("checkHAddress2");
				String checkRelation = resultSet.getString("checkRelation");
				String checkBodytemp = resultSet.getString("checkBodytemp");
				String checkDrug = resultSet.getString("checkDrug");
				System.out.println("-->" + checkAppointdate);
				dto = new CheckDto(checkCode, checkAppointdate, checkAppointTime,checkAppHospital, checkHAddress1, checkHAddress2, checkRelation, checkBodytemp, checkDrug); // 이제 한줄로 데이터를 박싱했음
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
	
	public void checklist_delete(String checkCode) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "delete from checklist where checkCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(checkCode));
			
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
	
	public void checklist_modify(String checkCode, String checkAppHospital, String checkAppointdate, String checkHAddress1, String checkHAddress2, String checkRelation, String checkBodytemp, String checkAppointTime, String checkDrug) { // 받아올것이 없으므로 void
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "update checklist set checkAppHospital=?, checkAppointdate=?, checkHAddress1=?, checkHAddress2=?, checkRelation=?, checkBodytemp=?, checkAppointTime=?, checkDrug=? where checkCode = ?"; // mysql에서 잘 되면 복붙ㄲ
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, checkAppHospital);
			preparedStatement.setString(2, checkAppointdate);
			preparedStatement.setString(3, checkHAddress1);
			preparedStatement.setString(4, checkHAddress2);
			preparedStatement.setString(5, checkRelation);
			preparedStatement.setString(6, checkBodytemp);
			preparedStatement.setString(7, checkAppointTime);
			preparedStatement.setString(8, checkDrug);
			preparedStatement.setInt(9, Integer.parseInt(checkCode));
			
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
	
	public ArrayList<CheckDto> search(String queryName, String queryContent, String startAppointdate, String endAppointdate) { // 받아올것이 없으므로 void
		ArrayList<CheckDto> dtos = new ArrayList<CheckDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "select checkCode, checkAppHospital, checkAppointdate, checkHAddress1, checkHAddress2, checkRelation, checkBodytemp, checkAppointTime, checkDrug from checklist where " + queryName + " like '%" + queryContent + "%'";
			
			String query2 =" and checkAppointdate >= '" + startAppointdate + "' and checkAppointdate <= '" + endAppointdate +"'";
			
			preparedStatement = connection.prepareStatement(query+query2);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int checkCode = resultSet.getInt("checkCode"); //sql 컬럼이름과 같아야 됨 
				String checkAppHospital = resultSet.getString("checkAppHospital");
				String checkAppointdate = resultSet.getString("checkAppointdate");
				String checkHAddress1 = resultSet.getString("checkHAddress1");
				String checkHAddress2 = resultSet.getString("checkHAddress2");
				String checkBodytemp = resultSet.getString("checkBodytemp"); //sql 컬럼이름과 같아야 됨 
				String checkRelation = resultSet.getString("checkRelation");
				String checkAppointTime = resultSet.getString("checkAppointTime");
				String checkDrug = resultSet.getString("checkDrug");
				CheckDto dto = new CheckDto(checkCode, checkAppHospital, checkAppointdate, checkHAddress1, checkHAddress2, checkRelation, checkBodytemp, checkAppointTime, checkDrug); // 이제 한줄로 데이터를 박싱했음
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

}// dao
