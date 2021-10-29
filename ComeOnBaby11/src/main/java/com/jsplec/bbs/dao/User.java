package com.jsplec.bbs.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class User {
	private Connection conn; 
	private PreparedStatement pstmt;
	private ResultSet rs; 
	private static User instance;
	public User() {}
	public static User getInstance() {
		if(instance == null) {
			instance = new User();
		}
		return instance;
	}
	
	private Connection getConnection() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/comeon_baby");
			conn = ds.getConnection();
		}catch(SQLException e) {
			System.err.println(" * Error 이유 : Database 구문 오류, "+e.getMessage());
		}catch (Exception e) {
			System.err.println(" * Error 이유 : "+e.getMessage());
		}
		return conn;
	}

	public int confirm(String userid) throws SQLException {
		Connection conn = null;
		PreparedStatement psmt = null;
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement("SELECT * FROM user where userid = ?");
			psmt.setString(1, userid);
			ResultSet rs = psmt.executeQuery();
			if(rs.next() == true) result=1;
			else result = 0;
		}catch(SQLException e) {
			System.err.println(" * Error 이유 : Database 구문 오류, "+e.getMessage());			
		}catch(Exception e) {
			System.err.println(" * Error 이유 : "+e.getMessage());
		}finally {
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
			
		}
		return result;
		
	}
	public int login(String userid, String userpw) { 
		String SQL = "SELECT userpw FROM user WHERE userid = ?"; 	try {
			
		pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1,  userid);
		rs = pstmt.executeQuery(); 		if (rs.next()) {
			if (rs.getString(1).contentEquals(userpw)) {
				return 1; // 로그인 성공
			}
			else {
				return 0; // 비밀번호 불일치
			}
		}
		return -1; // 아이디가 없음	
		} catch (Exception e) {
		e.printStackTrace();
		}
		return -2; // DB 오류 
		}

	
}