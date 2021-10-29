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
<h1 align="center" style="color: #fd9a9a;">작성 후 입력 버튼을 눌러주세요</h1>
<div align="center">
<table border="0">
		<form action="Cwrite.cob" method = "post" enctype="multipart/form-data">

			<tr>
				<td>제목</td>
				<td><input type ="text" name="calTitle" size = "25"></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="5" name="calContent" cols="20">간단하게 입력하세요</textarea> <br></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td>주기</td>
				<td><input type ="text" name="calCycle" size = "5"> 일</td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td>생리시작일</td>
				<td><input type ="date" name="calStartday" size = "25"></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td>생리종료일</td>
				<td><input type ="date" name="calEndday" size = "25"></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td>기분</td>
				<td><select name = "calFeel">
					<option value="행복">행복</option>
					<option value="화남">화남</option>
					<option value="보통" selected="selected">보통</option>
					<option value="슬픔">슬픔</option>
					<option value="우울함">우울함</option>
				</select></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td><input type="submit" style="background:#fd9a9a;color:white;border-radius: 10px" value="입력"></td>
			</tr>
			<!-- <tr>
				<td>사진첨부</td>
				<td><input type ="file" name="file" size = "25"></td>
				<td><input type="submit" value="업로드"></td>
			</tr> -->
		</form>
	</table>
</div><br><br>
</body>
</html>
<jsp:include page="footer.jsp"/>