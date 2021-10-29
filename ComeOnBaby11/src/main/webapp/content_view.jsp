<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원정보 수정 후 수정 버튼을 누르세요</h2>
	<table border="0">
		<form action= "modify.cob" method="post">
		<input type="hidden" name="userid" value="${content_view.userid}">
			<tr>
			  <td>회원아이디</td>
			  <td>${content_view.userid}</td>
			 </tr>
			<tr>
			  <td>회원비밀번호</td>
			  <td><input type="text" name="userpw" value="${content_view.userpw}"></td>
			 </tr>
			<tr>
			  <td>회원이름</td>
			  <td><input type="text" name="username" value="${content_view.username}"></td>
			  </tr>
			<tr>
			  <td>주소1</td>
			  <td><input  type="text" name="useraddress1" value="${content_view.useraddress1}"></td> 
			 </tr>
			<tr>
			  <td>주소2</td>
			  <td><input  type="text" name="useraddress2" value="${content_view.useraddress2}"></td> 
			 </tr>
			<tr>
			  <td>전화번호</td>
			  <td><input  type="text" name="userphone" value="${content_view.userphone}"></td> 
			 </tr>
			<tr>
			  <td>생년월일</td>
			  <td><input  type="text" name="userbirth" value="${content_view.userbirth}"></td> 
			 </tr>
			<tr>
			  <td>이메일</td>
			  <td><input  type="text" name="useremail" value="${content_view.useremail}"></td> 
			 </tr>
			 <tr>	
			<tr>
			  <td>병원</td>
			  <td><input  type="text" name="userhospital" value="${content_view.userhospital}"></td> 
			 </tr>
			<tr>
			  <td>관리자</td>
			  <td><input  type="text" name="admin" value="${content_view.admin}"></td> 
			 </tr>
			 <tr>	
			 	<td colspan="2"><input type="submit" value="수정"></td>
			 </tr>
		</form>
	</table>
		<a href="delete.cob?userid=${content_view.userid}">삭제</a>
</body>
</html>