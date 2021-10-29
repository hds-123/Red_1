package com.jsplec.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.bbs.dto.UDto;

public class UDao {

	DataSource dataSource;
	
	
	
	public UDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/comeon_baby");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<UDto> list() {
		ArrayList<UDto> uDtos = new ArrayList<UDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "select * from user ";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				String userid = resultSet.getString("userid");
				String userpw = resultSet.getString("userpw");
				String username = resultSet.getString("username");
				String useraddress1 = resultSet.getString("useraddress1");
				String useraddress2 = resultSet.getString("useraddress2");
				String userphone = resultSet.getString("userphone");
				String userbirth = resultSet.getString("userbirth");
				String useremail = resultSet.getString("useremail");
				String userhospital = resultSet.getString("userhospital");
				int admin = resultSet.getInt("admin");

				UDto uDto = new UDto(userid, userpw, username, useraddress1, useraddress2, userphone, userbirth, useremail, userhospital, admin);
				uDtos.add(uDto);
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
		return uDtos;

	}// list
	
	public void write(String userid, String userpw, String username, String useraddress1, String useraddress2, String userphone, String userbirth, String useremail, String userhospital) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection=dataSource.getConnection();
			
			String query = "insert into user (userid, userpw, username, useraddress1, useraddress2, userphone, userbirth, useremail, userhospital, admin) values(?,?,?,?,?,?,?,?,?,1)";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, userid);
			preparedStatement.setString(2, userpw);
			preparedStatement.setString(3, username);
			preparedStatement.setString(4, useraddress1);
			preparedStatement.setString(5, useraddress2);
			preparedStatement.setString(6, userphone);
			preparedStatement.setString(7, userbirth);
			preparedStatement.setString(8, useremail);
			preparedStatement.setString(9, userhospital);
			preparedStatement.executeUpdate();		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null)
					preparedStatement.close();
				if(connection != null)
					connection.close();			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

		public UDto contentView(String uuserid) {
			UDto uDto = null;
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			
			try {
				connection = dataSource.getConnection();
				
				String query = "select * from user where userid = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, uuserid);
				resultSet = preparedStatement.executeQuery();
				
				if(resultSet.next()) {
					String userid = resultSet.getString("userid");
					String userpw = resultSet.getString("userpw");
					String username = resultSet.getString("username");
					String useraddress1= resultSet.getString("useraddress1");
					String useraddress2 = resultSet.getString("useraddress2");
					String userphone = resultSet.getString("userphone");
					String userbirth = resultSet.getString("userbirth");
					String useremail = resultSet.getString("useremail");
					String userhospital = resultSet.getString("userhospital");
					int admin = resultSet.getInt("admin");
					
					uDto = new UDto(userid, userpw, username, useraddress1, useraddress2, userphone, userbirth, useremail,userhospital, admin);
				}
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(preparedStatement != null)
							preparedStatement.close();
						if(connection != null)
							connection.close();
						if(resultSet != null)
							resultSet.close();					
					}catch (final Exception e) {
						e.printStackTrace();
					}
				}
			return uDto;
			
		} //content	
		
		
		

		public void modify(String userid, String userpw, String username, String useraddress1, String useraddress2, String userphone, String userbirth, String useremail,  String userhospital) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = dataSource.getConnection();

				String query = "update user set userpw =?, username =?, useraddress1 =?, useraddress2 =?, userphone =?, userbirth =?, useremail =?, userhospital =? where userid= ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, userpw);
				preparedStatement.setString(2, username);
				preparedStatement.setString(3, useraddress1);
				preparedStatement.setString(4, useraddress2);
				preparedStatement.setString(5, userphone);
				preparedStatement.setString(6, userbirth);
				preparedStatement.setString(7, useremail);
				preparedStatement.setString(8, userhospital);		
				preparedStatement.setString(9, userid);		
				preparedStatement.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (preparedStatement != null)
						preparedStatement.close();
					if (connection != null)
						connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		public int confirm(String userid) throws SQLException {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			
			int result=0;
			try {
				connection = dataSource.getConnection();
				preparedStatement = connection.prepareStatement("SELECT * FROM user where userid = ?");
				preparedStatement.setString(1, userid);
				ResultSet rs = preparedStatement.executeQuery();
				if(rs.next() == true) result=1;
				else result = 0;
			}catch(SQLException e) {
				System.err.println(" * Error 이유 : Database 구문 오류, "+e.getMessage());			
			}catch(Exception e) {
				System.err.println(" * Error 이유 : "+e.getMessage());
			}finally {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
				
			}
			return result;
			
		}
		
		public void delete(String userid) {
			Connection connection = null;
			PreparedStatement preparedStatement= null;
			
			try {
				connection = dataSource.getConnection();
				
				String query = "delete from user where userid=?"  ;
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, userid);
				
				preparedStatement.execute();
				
						
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				try {
					
					if(preparedStatement!=null)preparedStatement.close();
					if(connection !=null)connection.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}

		public ArrayList<UDto> search(String query1, String content) {
			ArrayList<UDto> dtos = new ArrayList<UDto>();
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				connection = dataSource.getConnection();

				String query = "select * from user where " +query1 +" like '%"+ content + "%'" ;
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					String userid = resultSet.getString("userid");
					String userpw = resultSet.getString("userpw");
					String username = resultSet.getString("username");
					String useraddress1 = resultSet.getString("useraddress1");
					String useraddress2 = resultSet.getString("useraddress2");
					String userphone = resultSet.getString("userphone");
					String userbirth = resultSet.getString("userbirth");
					String useremail = resultSet.getString("useremail");
					String userhospital = resultSet.getString("userhospital");
					int admin = resultSet.getInt("admin");
					UDto dto = new UDto(userid, userpw, username, useraddress1, useraddress2 ,userphone,userbirth,useremail,userhospital,admin);
					dtos.add(dto);

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
			}return dtos;

			
		}
			
		
		
		
}
