<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

<h1 align="center" style="color: #fd9a9a;">글 수정 및 삭제</h1>
<div align="center">
	<form action="Cmodify.cob" method = "post">
		<table border="0">
			<%-- <input type="hidden" name="aId" value="${content_view.aId}"> --%>
			<tr>
				<td>SEQ</td>
				<td><input type ="hidden" name="calCode" size = "20" value="${content_view.calCode}"></td>
			</tr>
			<tr>
				<td>날짜</td>
				<td><input type ="date" name="calInsertdate" size = "20" value="${content_view.calInsertdate}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type ="text" name="calTitle" size = "20" value="${content_view.calTitle}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type ="text" name="calContent" size = "50" value="${content_view.calContent}"></td>
			</tr>
			<tr>
				<td>주기</td>
				<td><input type ="text" name="calCycle" size = "20" value="${content_view.calCycle}"></td>
			</tr>
			<tr>
				<td>생리시작일</td>
				<td><input type ="date" name="calStartday" size = "20" value="${content_view.calStartday}"></td>
			</tr>
			<tr>
				<td>생리종료일</td>
				<td><input type ="date" name="calEndday" size = "20" value="${content_view.calEndday}"></td>
			</tr>
			<tr>
				<td>기분</td>
				<td><input type ="text" name="calFeel" size = "20" value="${content_view.calFeel}"></td>
			</tr>
			<tr>
				<td>사진첨부</td>
				<td><img alt="photo" src="http://localhost:8080/ComeonBaby_calender/upload/${content_view.calPhoto_real}" height="20%" width="20%"></td>
			</tr>
	
		</table>
	</form>
	</div>
	<div align="center">
	<table>
	<tr>
		<td colspan="2"><input type="submit" style="background:#fd9a9a;color:white;border-radius: 10px" value="수정"></td>
		<td><form action="Cdelete.cob">
		<input type="hidden" name="calCode" value="${content_view.calCode}">
		<input type="submit" style="background:#fd9a9a;color:white;border-radius: 10px" value="삭제"> 
		</form><td>
	</tr>
	</table>
	</div>
</body>
</html>
<jsp:include page="footer.jsp"/>