package baby.calender.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import baby.calender.dto.CDto1;
import baby.calender.dto.ProductDto;

public class ProductDao {
	
	DataSource dataSource;
	
	public ProductDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/comeon_baby");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public  ArrayList<ProductDto> productlist(){
		ArrayList<ProductDto> dtos = new ArrayList<ProductDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
	try {
		connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
		
		String query = "select productid, productname, productcategory, productprice, productsaleprice, p_detail_category from product";
		preparedStatement = connection.prepareStatement(query);
		resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			int productid = resultSet.getInt("productid"); //sql 컬럼이름과 같아야 됨 
			String productname = resultSet.getString("productname");
			String productcategory = resultSet.getString("productcategory");
			int productprice = resultSet.getInt("productprice"); //sql 컬럼이름과 같아야 됨 
			int productsaleprice = resultSet.getInt("productsaleprice"); //sql 컬럼이름과 같아야 됨 
			String p_detail_category = resultSet.getString("p_detail_category");
			ProductDto dto = new ProductDto(productid, productname, productcategory, productprice, productsaleprice, p_detail_category); // 이제 한줄로 데이터를 박싱했음
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
	
	public void product_write(String productname, String productcategory, 
			int productprice, int productsaleprice, String p_detail_category) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "insert into product (productname, productcategory, "
					+ "productprice, productsaleprice, p_detail_category) values (?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, productname);
			preparedStatement.setString(2, productcategory);
			preparedStatement.setInt(3, productprice);
			preparedStatement.setInt(4, productsaleprice);
			preparedStatement.setString(5, p_detail_category);
			
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
	
	public ProductDto product_contentView(String sproductid) {
		ProductDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "select productid, productname, productcategory, productprice, productsaleprice, p_detail_category from product where productid = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(sproductid));
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int productid = resultSet.getInt("productid");
				String productname = resultSet.getString("productname");
				String productcategory = resultSet.getString("productcategory");
				int productprice = resultSet.getInt("productprice");
				int productsaleprice = resultSet.getInt("productsaleprice");
				String p_detail_category = resultSet.getString("p_detail_category");
//				System.out.println("-->" + checkAppointdate);
				dto = new ProductDto(productid, productname, productcategory,productprice, productsaleprice, p_detail_category); // 이제 한줄로 데이터를 박싱했음
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
	
	public void product_delete(String sproductid) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "delete from product where productid = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(sproductid));
			
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
	
	public void product_modify(String productid, String productname, String productcategory, String productprice, String productsaleprice, String p_detail_category) { // 받아올것이 없으므로 void
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "update product set productname=?, productcategory=?, productprice=?, productsaleprice=?, p_detail_category=? where productid = ?"; // mysql에서 잘 되면 복붙ㄲ
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, productname);
			preparedStatement.setString(2, productcategory);
			preparedStatement.setInt(3, Integer.parseInt(productprice));
			preparedStatement.setInt(4, Integer.parseInt(productsaleprice));
			preparedStatement.setString(5, p_detail_category);
			preparedStatement.setInt(6, Integer.parseInt(productid));
			
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
	
	public ArrayList<ProductDto> product_search(String queryName, String queryContent) { // 받아올것이 없으므로 void
		ArrayList<ProductDto> dtos = new ArrayList<ProductDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
			
			String query = "select productid, productname, productcategory, productprice, productsaleprice, p_detail_category from product where " + queryName + " like '%" + queryContent + "%'";
			
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int productid = resultSet.getInt("productid"); //sql 컬럼이름과 같아야 됨 
				String productname = resultSet.getString("productname");
				String productcategory = resultSet.getString("productcategory");
				int productprice = resultSet.getInt("productprice"); //sql 컬럼이름과 같아야 됨 
				int productsaleprice = resultSet.getInt("productsaleprice"); //sql 컬럼이름과 같아야 됨 
				String p_detail_category = resultSet.getString("p_detail_category");
				ProductDto dto = new ProductDto(productid, productname, productcategory, productprice, productsaleprice, p_detail_category); // 이제 한줄로 데이터를 박싱했음
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
