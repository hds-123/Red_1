<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다이어리 리스트</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr>
<%
		String userid = null;
		if(session.getAttribute("userid") != null){
			userid = (String)session.getAttribute("userid");
		}
	%>
<%
int cnt = 0;
%>
	<h1 align="center" style="color: #fd9a9a;">나의 다이어리 기록</h1><br>
	
	<div align="center">
	
	<form action="Csearch.cob" method="post">
		시작일 : <input type="date" name="start_date" value="2021-01-01" size="30">
		종료일 : <input type="date" name="end_date" value="2021-12-31" size="30">
		검색선택 :
		<select name = "queryName">
			<option value="calTitle">제목</option>
			<option value="calFeel">기분</option>
			<option value="calContent" selected="selected">내용</option>
		</select>
		<input type="text" name="queryContent" size="10">
		<input type="submit" style="background:#fd9a9a;color:white;border-radius: 10px" value="검색">
	
	</form>
	
	<table border = "1">
		<tr>
			<th>Seq</th><th>작성날짜</th><th>제목</th><th>내용</th><th>기분</th><th>생리시작일</th><th>생리종료일</th><th>주기</th><th>사진</th>
		</tr>
		<c:forEach items="${list}" var = "dto">
		
			<tr>
				<td><a href = "Ccontent_view.cob?calCode=${dto.calCode}">${dto.calCode}</a></td>
				<td>${dto.calInsertdate}</td>
				<td>${dto.calTitle}</td>
				<td>${dto.calContent}</td>
				<td>${dto.calFeel}</td>
				<td>${dto.calStartday}</td>
				<td>${dto.calEndday}</td>
				<td>${dto.calCycle}</td>
				<td>${dto.calPhoto}</td>
			</tr>
		<%cnt++; %>
		</c:forEach>
	</table>
	
	<table>
		<tr>
			<td><form action="Cwrite_view.cob?calCode=${dto.calCode}">
			<input type="submit" style="background:#fd9a9a;color:white;border-radius: 10px" value="입력">
			</form></td>
			<td><form action="mypage.cob" method="post">
				<input type="submit" style="background:#fd9a9a;color:white;border-radius: 10px" value="달력으로">
			</form></td>
		</tr>
	</table>
	총 <%=cnt %>일이 검색되었습니다.
	</div>
</body>
</html>
<jsp:include page="footer.jsp"/>