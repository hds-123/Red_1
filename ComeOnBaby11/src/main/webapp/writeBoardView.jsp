<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 작성하기</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<h2 align="center">COME ON BOARD!</h2>
 <%
		String userid = null;
		if(session.getAttribute("userid") != null){
			userid = (String)session.getAttribute("userid");
			System.out.println(userid);
		}
	%>
	<!-- 회원이 게시판 글 작성하는 화면 출력 -->
	<table border="0" style="margin: auto;">
		<form action="writeboard.cob" method="post" enctype="multipart/form-data">
	<input type = "hidden" name="user_userid" value="${userid}">
			<tr>
			
				<td>
				<select name="writeSortation">
					<option value="임신커뮤니티">임신커뮤니티</option>
					<option value="육아커뮤니티">육아커뮤니티</option>
					<option value="문의사항">문의사항</option>
				</select>
				<select name="writeLocation">
					<option value="서울특별시 강남구">서울특별시 강남구</option>
					<option value="서울특별시 강동구">서울특별시 강동구</option>
					<option value="서울특별시 강북구">서울특별시 강북구</option>
					<option value="서울특별시 강서구">서울특별시 강서구</option>
					<option value="서울특별시 관악구">서울특별시 관악구</option>
					<option value="서울특별시 광진구">서울특별시 광진구</option>
					<option value="서울특별시 구로구">서울특별시 구로구</option>
					<option value="서울특별시 금천구">서울특별시 금천구</option>
				</select></td>
			</tr>
			<tr><td><input type="text" name="writeTitle" size="48.5" placeholder="글 제목을 입력하세요."></td></tr>
			<tr>
				<td><textarea name="writeContent" rows="10" cols ="60" placeholder="글 내용을 입력하세요. 타인에게 욕설을 하거나 비방하는 글은 제재될 수 있음을 알려드립니다. 건강한 커뮤니티를 만들어가요^^"></textarea></td>
			</tr>
			<tr>
				<td>첨부파일: <input type="file" name="file"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="등록"> &nbsp;&nbsp;&nbsp;<a href="listboard.cob">목록으로 돌아가기</a></td>
			</tr>
		</form>
	</table>
		<!--  
		<form action="writefileUpload.cob" method="post" enctype="multipart/form-data">
			<input type="file" name="file">
			<input type="submit" value="첨부"><br>
		</form> 
		-->	
		
</body>
</html>
<br><br><br>
<jsp:include page="/footer.jsp"/>