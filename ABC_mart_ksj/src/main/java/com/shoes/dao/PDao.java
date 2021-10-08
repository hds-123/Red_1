package com.shoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.directory.InitialDirContext;
import javax.sql.DataSource;

import com.shoes.dto.PDto;

public class PDao {

	
	// Field
	DataSource dataSource;
	
	
	
	// Constructor
	public PDao() {

	try {
		 Context context = new InitialDirContext();
		 dataSource = (DataSource) context.lookup("java:comp/env/jdbc/abc_mart");
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
	// Method
	// Product list
	public ArrayList<PDto> list(){
		ArrayList<PDto> pdtos = new ArrayList<PDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select productid, productname, productprice, productsize, productsection, productcolor, productqnt, productputin, productmadein from product";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int productid = resultSet.getInt("productid");
				String productname = resultSet.getString("productname");
				int productprice  = resultSet.getInt("productprice");
				int productsize = resultSet.getInt("productsize");
				String productsection = resultSet.getString("productsection");
				String productcolor = resultSet.getString("productcolor");
				String productqnt = resultSet.getString("productqnt");
				Timestamp productputin = resultSet.getTimestamp("productputin");
				String productmadein = resultSet.getString("productputin");
			
				PDto pDto =new PDto(productid, productname, productprice, productsize, productsection, productcolor, productqnt, productputin,productmadein);
				pdtos.add(pDto);
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
			return pdtos;
		}// list
		
	
}