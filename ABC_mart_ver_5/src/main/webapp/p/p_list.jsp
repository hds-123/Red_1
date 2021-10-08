<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품목록</title>
</head>
<body>
	<h1>제품목록</h1>
	<table border="1">
		<tr>
		<th>제품번호</th><th>제품이름</th><th>가격</th><th>사이즈</th><th>품목</th><th>색상</th><th>입고일</th><th>제조사</th>
		</tr>
		<c:forEach items="${list}" var="pto">
			<tr>
			<td>${pto.productid}</td>
			<td>${pto.productname}</td>
			<td>${pto.productprice}</td>
			<td>${pto.productsize}</td>
			<td>${pto.productsection}</td>
			<td>${pto.productcolor}</td>
			<td>${pto.productqnt }</td>
			<td>${pto.productputin}</td>
			<td>${pto.productmadein}</td>
			</tr>

		</c:forEach>
		<tr>
			<td colspan="5"><a href="write_view.do">제품등록</a></td>
		</tr>
	</table>
	
</body>
</html>