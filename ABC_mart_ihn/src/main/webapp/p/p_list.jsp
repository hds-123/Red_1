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
	<% int cnt = 0; %>
	<h1>제품 조회</h1>
	<form action="p_search.do" method="get">
		검색선택 : 
			<select name="query">
				<option value="productname"selected="selected">제품명</option>
				<option value="productprice">				   가격</option>
				<option value="productsize">				   사이즈</option>
				<option value="productsection">			       품목</option>
				<option value="productcolor">				   색상</option>
				<option value="productqnt">				       수량</option>
				<option value="productinput">				   입고일</option>
				<option value="productmadein">				   제조사</option>
			</select>&nbsp;&nbsp;&nbsp;
		<input type="text" name="content" size="30">
		<input type="submit" value="검색">
	</form>

	<h1>제품목록</h1>
	<table border="1">
		<tr>
		<th>제품번호</th><th>제품명</th><th>가격</th><th>사이즈</th><th>품목</th><th>색상</th><th>수량</th><th>입고일</th><th>제조사</th>
		</tr>
		<c:forEach items="${list}" var="pto">
			<tr>
			<td><a href="p_content_view.do?productid=${pto.productid}">${pto.productid}</a></td>
			<td>${pto.productname}</td>
			<td>${pto.productprice}</td>
			<td>${pto.productsize}</td>
			<td>${pto.productsection}</td>
			<td>${pto.productcolor}</td>
			<td>${pto.productqnt }</td>
			<td>${pto.productputin}</td>
			<td>${pto.productmadein}</td>
			</tr>
		<%cnt++; %>
		</c:forEach>

	</table>
	<form action="p_write_view.do" method="get">
	<input type="submit" value="등록">	
	</form>
	총 제품의 개수는 <%=cnt %> 개입니다.
</body>
</html>