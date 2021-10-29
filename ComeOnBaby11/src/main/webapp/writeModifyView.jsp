<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<head>
<meta charset="UTF-8">
<title>게시글 수정 및 삭제</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<hr>
<h1 align="center">게시글 수정 및 삭제</h1><br>
<!-- 회원이 게시판 글 수정 및 삭제하는 화면 출력 -->
	<table border="0" style="margin: auto;">
		<form action="writemodify.cob" method="post" enctype="multipart/form-data">
			<tr><td>
				<input type="hidden" name="writeCode" value="${writemodi.writeCode }">
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
				</select></td></tr>
			<tr><td>첨부파일: <input type="file" name="file" value="http://localhost:8080/ComeOnBaby/upload/${writemodi.writeRealfile}"></td></tr>
<%-- 			<tr><td><img alt="C:\Users\chedl\Documents\What\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\ComeOnBaby\upload\ ${writemodi.writeRealfile }"
			src="C:\Users\chedl\Documents\What\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\ComeOnBaby\upload\"+"${writemodi.writeRealfile}" height="100" width="100"></td></tr>
 --%>
 			<tr><td><img alt="http://localhost:8080/ComeOnBaby/upload/${writemodi.writeRealfile }"
			src="http://localhost:8080/ComeOnBaby/upload/${writemodi.writeRealfile}" height="20%" width="20%"></td></tr>
			<tr><td><input type="text" name="writeTitle" size="48.5" value="${writemodi.writeTitle }" placeholder="글 제목을 입력하세요."></td></tr>
			<tr>
				<td><textarea name="writeContent" rows="10" cols ="60" placeholder="글 내용을 입력하세요.
				타인에게 욕설을 하거나 비방하는 글은 제재될 수 있음을 알려드립니다.
				건강한 커뮤니티를 만들어가요^^">${writemodi.writeContent }</textarea></td></table>
				
			<table style="margin: auto;"></tr>
			<tr><td><textarea name="comment" placeholder="여러분의 소중한 댓글을 올려주세요." rows="3" cols="60"></textarea>
			<input type="submit" value="등록" formaction="commentWrite.cob" /> </td></tr>
			<br><hr><br>
			<tr>
				<td align="center">
					<br><input type="submit" value="수정" formaction="writemodify.cob">&nbsp;&nbsp;&nbsp;
					<input type="submit" value="삭제" formaction="writedelete.cob">&nbsp;&nbsp;&nbsp;
					<input type="submit" value="목록" formaction="listboard.cob">
				</form></td>
			</tr>
	</table><br><Br>
</body>
</html>
<jsp:include page="/footer.jsp"/>