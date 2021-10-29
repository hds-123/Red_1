package baby.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import baby.board.dto.ProductDto;
import baby.board.dto.writeDto;

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
	
	//페이징, PRODUCT의 전체 개수 알아내기(PRODUCT 테이블이 기초가 되기에 다른 테이블의 전체 행은 고려하지 않음)
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
	
	//보여줄 게시물과 게시물의 수 범위 선택하기(등록과 관련된 테이블만 고려함)
	public Vector<ProductDto> selectPage(String table, int start, int pageCnt){
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		
		Vector<ProductDto> v = new Vector<ProductDto>();
//		Vector<ProductDetailDto> v2 = new Vector<ProductDetailDto>();
//		Vector<RegisterDto> v3 = new Vector<RegisterDto>();
		
		try {
			connection = dataSource.getConnection();
			
//			String query = "select * from "+ table +","+ table2 +","+ table3+ " limit ?, ?"; //테이블 이름 입력하면 해당 테이블 테이블 행 범위 지정 가능
			String query = "select * from "+ table + " limit ?, ?"; //테이블 이름 입력하면 해당 테이블 테이블 행 범위 지정 가능
			//ex) String query = "select * from "+ board + " limit 0, 10";
			//ex) 게시물이 50개인 "board"라는 테이블이 있으면 limit 0, 10이면 10행의 게시물을 보여줌// 총 5페이지를 볼 수 있음.
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, start);
			preparedStatement.setInt(2, pageCnt);
			
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				ProductDto dto = new ProductDto();
//				ProductDetailDto pddto = new ProductDetailDto();
//				RegisterDto rgdto = new RegisterDto();
				
				dto.setProductid(resultSet.getInt("productid"));
				dto.setProductname(resultSet.getString("productname"));
				dto.setProductcategory(resultSet.getString("productcategory"));
				dto.setProductprice(resultSet.getInt("productprice"));
				dto.setProductsaleprice(resultSet.getInt("productsaleprice"));
				dto.setP_detail_category(resultSet.getString("p_detail_category"));
				dto.setProductImage(resultSet.getString("productImage"));
				dto.setProductRealPath(resultSet.getString("productRealPath"));
				
//				pddto.setDetailAmount(resultSet.getInt("detailAmount"));
//				pddto.setDetailStarscore(resultSet.getDouble("detailStarscore"));
//				pddto.setDetailReview(resultSet.getString("detailReview"));
//				
//				rgdto.setUser_userid(resultSet.getString("user_userid"));
//				rgdto.setProduct_productid(resultSet.getInt("product_productid"));
//				rgdto.setRegisterInsertdate(resultSet.getString("registerInsertdate"));
//				rgdto.setRegisterAmount(resultSet.getInt("registerAmount"));
				
				v.add(dto);
//				v2.add(pddto);
//				v3.add(rgdto);
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
	//상품 등록하기
	  public void productRegister(String productname, String productcategory, int productprice, int productsaleprice, String p_detail_category,
			  						String productImage, String productRealPath, int detailAmount,  String detailSize, String detailColor) { 
		  
		  Connection connection = null;
		  PreparedStatement preparedStatement = null;
		  PreparedStatement preparedStatement2 = null;
	  
		  try { 
			  connection = dataSource.getConnection();
			  String A = "insert into product (productname, productcategory, productprice, productsaleprice, p_detail_category, productImage, productRealPath) values (?,?,?,?,?,?,?)";
			  String B = "insert into product_detail (detailAmount, detailSize, detailColor, detailproductid) values (?,?,?,last_insert_id());";
			  preparedStatement = connection.prepareStatement(A);
	  
			  preparedStatement.setString(1, productname);
			  preparedStatement.setString(2, productcategory);
			  preparedStatement.setInt(3, productprice);
			  preparedStatement.setInt(4, productsaleprice);
			  preparedStatement.setString(5, p_detail_category);
			  preparedStatement.setString(6, productImage);
			  preparedStatement.setString(7, productRealPath);
			  preparedStatement.executeUpdate();
			  
			  preparedStatement2 = connection.prepareStatement(B);
			  preparedStatement2.setInt(1, detailAmount);
			  preparedStatement2.setString(2, detailSize);
			  preparedStatement2.setString(3, detailColor);
	  
			  preparedStatement2.executeUpdate();
	  
		  }catch(Exception e) { 
			  e.printStackTrace(); 
		  }finally{
			  try {
			  if(preparedStatement != null)
				  preparedStatement.close();
			  if(preparedStatement2 != null)
				  preparedStatement2.close();
			  if(connection != null) connection.close();
			  }
			  catch(Exception e) { e.printStackTrace();
			  }
		  }
	  }//write
	  
	//상품 상세페이지를 보기위해 자료 가져오기
	public ProductDto ProductDetailView(String productids) {
		ProductDto dto1 = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select * from product where productid = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, productids);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int productid = resultSet.getInt("productid");
				String productname = resultSet.getString("productname");
				String productcategory = resultSet.getString("productcategory");
				int productprice = resultSet.getInt("productprice");
				int productsaleprice = resultSet.getInt("productsaleprice");
				String p_detail_category = resultSet.getString("p_detail_category");
				String productImage = resultSet.getString("productImage");
				String productRealPath = resultSet.getString("productRealPath");
				
			dto1 = new ProductDto(productid, productname, productcategory, productprice, productsaleprice, p_detail_category, productImage, productRealPath);
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
		
		
	}//주문 내역를 보기위해 자료 가져오기
	
	public ProductDto orderDetailView(int productid, int orderAmount, int orderDeliverfee) {
		ProductDto dto1 = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		PreparedStatement preparedStatement2 = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into comeon_baby.order (product_productid, orderAmount, orderDeliverfee, orderInsertdate) values (?,?,?,now())";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, productid);
			preparedStatement.setInt(2, orderAmount);
			preparedStatement.setInt(3, orderDeliverfee);
			preparedStatement.executeUpdate();
			
			System.out.println("productid:" + productid);
			System.out.println("orderAmount:" + orderAmount);
			System.out.println("orderDeliverfee:" + orderDeliverfee);
			
			String query2 = "update product_detail left join comeon_baby.order on product_detail.detailproductid = comeon_baby.order.product_productid set product_detail.detailAmount = product_detail.detailAmount - " + orderAmount + " where product_detail.detailproductid = ?"; //수량 뺄셈을 위한 아이들
			preparedStatement2 = connection.prepareStatement(query2);
			preparedStatement2.setInt(1, productid);
			preparedStatement2.executeUpdate();
			System.out.println("productid:" + productid);
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(preparedStatement2 != null) preparedStatement2.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dto1;
	}//주문 내역를 보기위해 자료 가져오기
	
	//상품을 내용으로 검색하기
		public Vector<ProductDto> search(int start, int pageCnt, String searchName, String searchContent){
			ResultSet resultSet = null;
			PreparedStatement preparedStatement = null;
			Connection connection = null;
			
			Vector<ProductDto> v = new Vector<ProductDto>();
			
			try {
				connection = dataSource.getConnection();
				
				String WhereDefault = "select * from product " ;
				String WhereDefault2 = "where " + searchName + " like '%" + searchContent + "%'" + " limit ?, ?";				
				
				
				//ex) String query = "select * from "+ board + " limit 0, 10";
				//ex) 게시물이 50개인 "board"라는 테이블이 있으면 limit 0, 10이면 10행의 게시물을 보여줌// 총 5페이지를 볼 수 있음.
				preparedStatement = connection.prepareStatement(WhereDefault + WhereDefault2);
				preparedStatement.setInt(1, start);
				preparedStatement.setInt(2, pageCnt);
				
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					ProductDto dto = new ProductDto();
					dto.setProductid(resultSet.getInt("productid"));
					dto.setProductname(resultSet.getString("productname"));
					dto.setProductcategory(resultSet.getString("productcategory"));
					dto.setProductprice(resultSet.getInt("productprice"));
					dto.setProductsaleprice(resultSet.getInt("productsaleprice"));
					dto.setP_detail_category(resultSet.getString("p_detail_category"));
					dto.setProductImage(resultSet.getString("productImage"));
					dto.setProductRealPath(resultSet.getString("productRealPath"));
					
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
	//제품 정보를 수정하기
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
		
		public ProductDto product_contentView(String sproductid) {
			ProductDto dto = null;
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			
			try {
				connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
				
				String query = "select * from product where productid = ?";
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
					String productImage = resultSet.getString("productImage");
					String productRealPath = resultSet.getString("productRealPath");
//					System.out.println("-->" + checkAppointdate);
					dto = new ProductDto(productid, productname, productcategory,productprice, productsaleprice, p_detail_category, productImage, productRealPath); // 이제 한줄로 데이터를 박싱했음
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
			PreparedStatement preparedStatement2 = null;
			
			try {
				connection = dataSource.getConnection(); // 어제 긴줄들이한줄로 정리됨
				
				String query = "delete from product_detail where detailproductid = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, Integer.parseInt(sproductid));
				
				preparedStatement.executeUpdate();
				
				String query2 = "delete from product where productid = ?";
				
				preparedStatement2 = connection.prepareStatement(query2);
				preparedStatement2.setInt(1, Integer.parseInt(sproductid));
				
				preparedStatement2.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(preparedStatement != null) preparedStatement.close();
					if(preparedStatement2 != null) preparedStatement2.close();
					if(connection != null) connection.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		
		}// delete
	
	 
}
