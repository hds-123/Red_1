<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
		<th>번호</th><th>이름</th><th>제목</th><th>날짜</th><th>삭제</th>
		</tr>
		<c:forEach items= "${list}" var="dto">
			<tr>
				<td>${dto.number}</td>
				<td>${dto.name}</td>
				<td>${dto.title}</td>
				<td>${dto.date}</td>
				<td><a href ="content_view.do?number=${dto.number}">x</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="write_view.do">글작성</a></td>
		</tr>
		
	</table>
</body>
</html>