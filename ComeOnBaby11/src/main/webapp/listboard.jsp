<%@page import="java.util.Vector"%>
<%@page import="baby.board.dao.WriteDao"%>
<%@page import="baby.board.dto.writeDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/header.css" type="text/css" />
<link rel="stylesheet" href="css/footer.css" type="text/css" />
<title>게시판</title>
</head>
 <%
		String userid = null;
		if(session.getAttribute("userid") != null){
			userid = (String)session.getAttribute("userid");
		}
	%>
<body>
<jsp:include page="./header.jsp"/>
	<h1 align="center">게시판</h1><hr>
	<div align="center">
		<form action="listboardSearch.cob" method="get">
			검색선택 : 
				<select name="search">
					<option value="writeCode"selected="selected">전체</option>
					<option value="writeSortation">				   분류</option>
					<option value="writeTitle">				  	   제목</option>
					<option value="user_userid">			       작성자</option>
					<option value="writeInsertdate">				   </option>
				</select>&nbsp;&nbsp;&nbsp;
			<input type="text" name="content" size="30">
			<input type="submit" value="검색">
		</form>
	</div><br>
	<!-- 검색창 -->
	
	
	<div align="center"> 
	<table border="1" style="width: 80%; align-content: center;" >
		<tr>
			<th >글번호</th><th>분류</th><th>글제목</th><th>작성자</th><th>작성날짜</th>
		</tr>
		<c:forEach items="${listboard}" var="dto">
			<tr>
				<td align="center" width="100"><a href="writemodifyView.cob?writeCode=${dto.writeCode}">${dto.writeCode}</a></td>
				<td align="center" width="200">${dto.writeSortation}</td>
				<td align="center"><a href="writemodifyView.cob?writeCode=${dto.writeCode}">${dto.writeTitle}</a></td>
				<td align="center">${dto.user_userid}</td>
				<td align="center">${dto.writeInsertdate}</td>
			</tr>
		</c:forEach>
		<tr>
		</tr>
	</table>
	<form action="writeBoardView.jsp">
	
			<br><input type="submit" value="글쓰기"><br><br>
	</form>
		<%
		
		Object count_obj = request.getAttribute("count");
		
		String count_str = count_obj.toString();
		int count = Integer.parseInt(count_str);
		
		for(int i = 1; i <= count; i++){ 
		%>
			<a style="align-self: center;" href="listboard.cob?page=<%=i %>">[<%=i %>]</a>
		<% };%>
	</div><br>
</body>
</html>
<jsp:include page="./footer.jsp"/>