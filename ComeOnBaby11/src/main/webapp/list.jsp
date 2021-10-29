<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Come On BABY</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
</head>
<body>
<jsp:include page="header.jsp"/>
<hr>
<% int cnt = 0; %>
<h1 align="center" style="color: #fd9a9a;">회원 명단 리스트</h1>

<div align="center">
<form action="search.cob" method="post">
	검색 선택 :
			 <select name="query1">
			<option value="username" selected="selected">이름</option>
			<option value="userphone">전화번호</option>
			<option value="userid">아이디</option>
		</select>&nbsp;&nbsp;&nbsp; <input type="text" name="content" size="30">
		<input type="submit" style="background:#fd9a9a;color:white;border-radius: 10px" value="검색">
</form>
	<table border="1">
		<tr>
		<th>회원아이디</th><th>회원비밀번호</th><th>이름</th><th>주소1</th><th>주소2</th><th>전화번호</th><th>생년월일</th><th>이메일</th><th>병원</th><th>관리자</th>
		</tr>
		<c:forEach items= "${list}" var="pst">
			<tr>
				<td><a href="content_view.cob?userid=${pst.userid}">${pst.userid}</a></td>
				<td>${pst.userpw}</td>
				<td>${pst.username}</td>
				<td>${pst.useraddress1}</td>
				<td>${pst.useraddress2}</td>
				<td>${pst.userphone}</td>
				<td>${pst.userbirth}</td>
				<td>${pst.useremail}</td>
				<td>${pst.userhospital}</td>
				<td>${pst.admin}</td>
			</tr>
			<%cnt++; %>
		</c:forEach>
	</table><br>
			<form action="write_view.cob">
			<input type="submit" style="background:#fd9a9a;color:white;border-radius: 10px" value="입력">
			</form><br><br>
	총인원은 <%=cnt %> 명입니다.
  <a class="dropdown-item" href="mainad.jsp">관리자 메인</a>
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <!-- * *                               SB Forms JS                               * *-->
        <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</div>
</body>
</html>
<jsp:include page="footer.jsp"/>