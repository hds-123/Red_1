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

	<form action="ksj2.jsp" method="get">
	<table>
	<tr>
	<td>성명 :</td>
	<td> <input type = "text" name = "name"></td>
	</tr>
	<tr>
	<td>제목 : </td>
	<td><input type = "text" name ="title"></td>
	</tr>
	
	</table>
	<input type="submit"  value="입력"><p><a href="ksj.jsp">목록보기</a></p>
	</form>
	
</body>
</html>