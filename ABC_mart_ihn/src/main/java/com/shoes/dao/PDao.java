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
	
	// Product write
	public void write(String productname, String productprice, String productsize,String productsection, String productcolor, String productqnt, String productputin, String productmadein) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into (productname, productprice, productsize, productsection, productcolor, productqnt, productputin, productmadein) values (?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, productname);
			preparedStatement.setString(2, productprice);
			preparedStatement.setString(3, productsize);
			preparedStatement.setString(4, productsection);
			preparedStatement.setString(5, productcolor);
			preparedStatement.setString(6, productqnt);
			preparedStatement.setString(7, productputin);
			preparedStatement.setString(8, productmadein);
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
	
	// Product contentview
	public PDto contentView(String sproductid) {
		PDto pDto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select * from product where productid = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(sproductid));
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int productid = resultSet.getInt("productid");
				String productname = resultSet.getString("productname");
				int productprice = resultSet.getInt("productprice");
				int productsize = resultSet.getInt("productsize");
				String productsection = resultSet.getString("productsection");
				String productcolor = resultSet.getString("productcolor");
				String productqnt = resultSet.getString("productqnt");
				Timestamp productputin = resultSet.getTimestamp("productputin");
				String productmadein = resultSet.getString("productmadein");
				
				pDto = new PDto(productid, productname, productprice, productsize, productsection, productcolor, productqnt, productputin, productmadein);
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
		return pDto;
}//contentView
	
	// Product delete
	public void delete(String productid) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "delete from product where productid =? ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, productid);
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
	
	
	// Product modify
	public void modify(String productid, String productname, String productprice, String productsize, String productsection, String productcolor, String productqnt, String productputin, String productmadein) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update product set productname = ?, productprice= ? productsize = ?, productsection = ? productcolor = ? productqnt = ? productputin = ?, productmadein = ? where productid = ?" ;
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, productname);
			preparedStatement.setString(2, productprice);
			preparedStatement.setString(3, productsize);
			preparedStatement.setString(4, productsection);
			preparedStatement.setString(5, productcolor);
			preparedStatement.setString(6, productqnt);
			preparedStatement.setString(7, productputin);
			preparedStatement.setString(8, productmadein);
			preparedStatement.setString(9, productid);
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
	public ArrayList<PDto> search(String queryName, String queryContent) {
		ArrayList<PDto> psearch = new ArrayList<PDto>();
		Connection connection = null;
		
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "select productid, productname, productprice, productsize, productsection, productcolor, productqnt, productputin, productmadein from product ";
			String qurey1 = "where " + queryName + " like '%" + queryContent + "%'";
			preparedStatement = connection.prepareStatement(query+qurey1);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int productid = resultSet.getInt("productid");
				String productname = resultSet.getString("productname");
				int productprice = resultSet.getInt("productprice");
				int productsize = resultSet.getInt("productsize");
				String productsection = resultSet.getString("productsection");
				String productcolor = resultSet.getString("productcolor");
				String productqnt = resultSet.getString("productqnt");
				Timestamp productputin = resultSet.getTimestamp("productputin");
				String productmadein = resultSet.getString("productmadein");
				
				PDto pDto = new PDto(productid, productname, productprice, productsize,productsection, productcolor, productqnt, productputin,productmadein);
				psearch.add(pDto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return psearch;
	} // search
		
}