<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>product list</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr>
<%
int cnt = 0;
%>
	<h1 align="center">Product list</h1>
	
	<div align="center">
	<form action="product_search.cob" method="post">
		검색선택 :
		<select name = "queryName">
			<option value="productid">제품코드</option>
			<option value="productname">제품명</option>
			<option value="productcategory">구분</option>
			<option value="p_detail_category">상세구분</option>
			<option value="productprice">제품정가</option>
			<option value="productsaleprice" selected="selected">할인가</option>
		</select>
		<input type="text" name="queryContent" size="30">
		<input type="submit" value="검색">
	
	</form><br>
	<table border = "1">
		<tr>
			<th>제품코드</th><th>제품명</th><th>구분</th><th>상세구분</th><th>제품정가</th><th>할인가</th>
		</tr>
		<c:forEach items="${productlist}" var = "dto">
		
			<tr>
				<td><a href = "product_content_view.cob?productid=${dto.productid}">${dto.productid}</a></td>
				<td><a href = "detail_list.cob">${dto.productname}</a></td>
				<td>${dto.productcategory}</td>
				<td>${dto.p_detail_category}</td>
				<td>${dto.productprice}</td>
				<td>${dto.productsaleprice}</td>
			</tr>
		<%cnt++; %>
		</c:forEach>
	</table>
	<form action="product_write_view.cob?productid=${dto.productid}">
	<input type="submit" value="입력">
	</form>
	총 <%=cnt %>건이 검색되었습니다.
	</div><br><br><br>

</body>
</html>
<jsp:include page="footer.jsp"/>