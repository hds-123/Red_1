351<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import = "java.sql.*" %>

<%
	request.setCharacterEncoding("utf-8"); 

	int number =Integer.parseInt(request.getParameter("number"));


	String url_mysql ="jdbc:mysql://localhost/exam?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql = "qwer1234";

	PreparedStatement ps = null;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		String query = "delete from test where number =?"; 
		
		ps = conn_mysql.prepareStatement(query);
		ps.setInt(1, number);
		ps.executeUpdate();
		
		conn_mysql.close();
		

	}catch (Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("ksj.jsp");
%>