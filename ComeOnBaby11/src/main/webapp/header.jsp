<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
	<meta name="description" content="" />
	<meta name="author" content="" />
	
	<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
	<link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
	<link href="css/styles.css" rel="stylesheet" />
	<link rel="stylesheet" href="css/header.css" type="text/css" />
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Arimo&family=Source+Sans+Pro:wght@300;400&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css2?family=Arimo&family=Nanum+Gothic&family=Source+Sans+Pro:wght@300;400&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@100;200;300;400;500;600;700&display=swap" rel="stylesheet">

<title>Insert title here</title>
</head>
	<script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js" crossorigin="anonymous"></script>
	<script type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="js/scripts.js"></script>
    <script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
<body id="#page-top">
  	 	<%
		String userid = null;
		if(session.getAttribute("userid") != null){
			userid = (String)session.getAttribute("userid");
		}
		%>
	<!-- 네비게이션 바 시작 -->
	<nav class="nav_bar">
	<!-- 로고화면 -->
	<ul class="nav_logo_group">
		<li><a href="COB_MAIN.jsp"><img class="nav_logo" alt="nav_logo" src="image/logo_four.png"></a></li>
	</ul>
	<!-- 네비게이션 메뉴창 -->
		<ul class="nav_menu">
			<li><a href="#comeonbaby">COME ON BABY?</a></li>
			<li><a href="#">문의</a></li>
			<li><a href="listboard.cob">게시판</a></li>
			<li><a href="listproduct.cob">상품</a></li>
			<%
			// 로그인 하지 않았을 때 보여지는 화면
			if(userid == null){
			%>
			<li class="nav_login"><a style="color: white;" href="login.jsp">로그인</a></li>&nbsp;&nbsp;
			<li class="nav_login"><a style="color: white;" href="write_view.cob">회원가입</a></li>
		<!-- 로그인했을 때 보여주는 화면  -->
			<%} else{%>
            <li class="nav_login"><a style="color: white;" href="logoutAction.jsp">로그아웃</a></li>&nbsp;&nbsp;
			<li class="nav_login"><a style="color: white;" href="mypage.cob">마이페이지</a></li>
            <%} %>
		</ul>
	</nav>
	
</body>
</html>