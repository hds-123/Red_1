<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Vector"%>
<%@page import="baby.board.dao.ProductDao"%>
<%@page import="baby.board.dto.ProductDto"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세페이지</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<hr>
<div align="center">
<br><br><br>
<h1 align="center">상품 상세페이지</h1><br><br><br>
	<table border="1" style="width: 80%; align-content: center;">
	<form action="orderDetail.cob" method="get">
		<tr><th align="center">사진</th><th>내용</th></tr>
		<tr><td align="center" rowspan="4">
			<img alt="http://localhost:8080/ComeOnBaby/upload/${proview.productRealPath }"
			src="http://localhost:8080/ComeOnBaby/upload/${proview.productRealPath}" height="50%" width="50%"></td>
			<td><input type="hidden" name="productname" value="${proview.productname}"/> ${proview.productname}</td></tr>
		<tr><td><input type="hidden" name="productsaleprice" value="${proview.productsaleprice}"/>${proview.productprice}원->${proview.productsaleprice}원</td></tr>
		<tr><td>구매수량: <input type="text" name="orderAmount">개</td></tr>
		
		<tr><td align="center"><input type="submit" value="구매하기">
		&nbsp;&nbsp;<input type="submit" value="장바구니담기" src="addcart.cob"></td></tr>
	</table>
			<input type="hidden" name="productid" value="${proview.productid}">
			<input type="hidden" name="productRealPath" value="${proview.productRealPath}"/>
			<input type="hidden" name="orderDeliverfee" value="3000"/>
			</form>
</div><br><br><br><br><br><br>
</body>
</html>
<jsp:include page="/footer.jsp"/>