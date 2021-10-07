package com.jsplec.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.bbs.dto.TDto;

public class TDao {

	// Field
	
	DataSource dataSource;
	
	// Constructor
	
	public TDao() {

		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/exam");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Method
	public ArrayList<TDto> list(){
		ArrayList<TDto> dtos = new ArrayList<TDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select number, name, title, date, delect from test ";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int number = resultSet.getInt("number");
				String name = resultSet.getString("name");
				String title = resultSet.getString("title");
				Timestamp date = resultSet.getTimestamp("date");
				String delect = resultSet.getString("delect");
				
				TDto dto = new TDto(number, name, title, date, delect);
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
	}//list
	
	
	
}
