<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");

	String dbURL = "jdbc:mysql://localhost/exam?serverTimezone=Asia/Seoul&characterEncoding=utf8&&useSSL=false";
	String dbID = "root";
	String dbPassword = "qwer1234";
	String query = "select number, name, title, date, delect from test ";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(dbURL, dbID, dbPassword);
		Statement stmt_mysql = conn_mysql.createStatement();

		ResultSet rs = stmt_mysql.executeQuery(query);
	%>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>제목</th>
			<th>날짜</th>
			<th>삭제</th>
		</tr>


		<%
		while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><a href="ksj3.jsp?number=<%=rs.getString(1)%>">X</a></td>
			
		</tr>
		<%
		}
		%>
		<tr>
			<td colspan="5"><a href="ksj1.jsp">글작성</a></td>
		</tr>
	</table>
	
	<%
	conn_mysql.close();

	} catch (Exception e) {
	e.printStackTrace();

	}
	%>
	

</body>
</html>