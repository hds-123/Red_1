<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="com.jsplec.bbs.dao.User" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		User md = User.getInstance();
		int result = md.confirm(id);
		if(result ==0){
			out.println("사용할 수 있는 아이디 입니다.");
		}else{
			out.println("이미 있는 아이디 입니다.");
			out.println("다른 것을 사용해주십시오.");
		}
	%>
</body>
</html>