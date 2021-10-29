<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체크리스트</title>
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
	<h1 align="center" style="color: #fd9a9a;">나의 체크리스트</h1>
	<div align="center">
	<form action="checklist_search.cob" method="post">
		검색시작기간 : <input type="date" name="startAppointdate" value="2021-10-01" size="10">
		검색종료기간 : <input type="date" name="endAppointdate" value="2021-12-31" size="10">
		검색선택 :
		<select name = "queryName">
			<option value="checkAppHospital">병원명</option>
		</select>
		<input type="text" name="queryContent" size="10">
		<input type="submit" style="background:#fd9a9a;color:white;border-radius: 10px" value="검색">
	
	</form>
	</div><br>
	<div align="center">
	<table border = "1">
		<tr>
			<th>Seq</th><th>병원예약일</th><th>예약시간</th><th>병원명</th><th>주소</th><th>상세주소</th><th>사랑기록</th><th>체온</th><th>약복용</th>
		</tr>
		<c:forEach items="${checklist}" var = "dto">
		
			<tr>
				<td><a href = "checklist_content_view.cob?checkCode=${dto.checkCode}">${dto.checkCode}</a></td>
				<td>${dto.checkAppointdate}</td>
				<td>${dto.checkAppointTime}</td>
				<td>${dto.checkAppHospital}</td>
				<td>${dto.checkHAddress1}</td>
				<td>${dto.checkHAddress2}</td>
				<td>${dto.checkRelation}</td>
				<td>${dto.checkBodytemp}</td>
				<td>${dto.checkDrug}</td>
			</tr>
		<%cnt++; %>
		</c:forEach>
	</table>
	</div>
	<div align="center">
	<form action="checklist_write_view.cob?checkCode=${dto.checkCode}">
	<input type="submit" style="background:#fd9a9a;color:white;border-radius: 10px" value="입력">
	</form>
	총 <%=cnt %>건 검색되었습니다.
	</div>
</body>
</html>
<jsp:include page="footer.jsp"/>