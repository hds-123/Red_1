<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	
	String name = request.getParameter("name");
	String title = request.getParameter("title");


	String url_mysql ="jdbc:mysql://localhost/exam?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql = "qwer1234";

	PreparedStatement ps = null;
	
	try{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		String A = "insert into test (name, title, date) values (?,?,now())"; 
		
		ps = conn_mysql.prepareStatement(A);
		ps.setString(1, name);
		ps.setString(2, title);
		ps.executeUpdate();
		
		conn_mysql.close();
		
	}catch (Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("ksj.jsp");
%>