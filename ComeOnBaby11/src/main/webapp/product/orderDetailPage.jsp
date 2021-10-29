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
<title>주문 상세 내역</title>
</head>
<body>
<%-- <table>
<tr><th>이미지</th><th>상품정보</th><th>판매가</th><th>수량</th><th>배송비</th><th>합계</th></tr>
	<c:forEach items="${orderdetailview}" var="dto">
			<tr>
				<td align="center" width="100">
				<img alt="http://localhost:8080/ComeOnBaby/upload/${dto.productRealPath }"
			src="http://localhost:8080/ComeOnBaby/upload/${dto.productRealPath}" height="50%" width="50%"
			href="productDetailView.cob?PCode=${dto.productid}">
				<td align="center"><a href="productDetailView.cob?PCode=${dto.productid}">${dto.productname}</a></td>
				
				<td align="center">${dto.productsaleprice}</td>
				<td align="center" width="200">${dto.productcategory}</td>
				<td align="center">${dto.productprice}</td>
			</tr>
		</c:forEach>
		<tr>
		</tr>
</table> --%>

<h1>구매가 완료되었습니다!</h1>
<h1>감사합니다!</h1>

<form action="list.cob" method="get">
<input type="submit" value="목록으로 돌아가기" formaction="listproduct.cob">
<input type="submit" value="주문내역조회" formaction="orderdetailscheck.cob">
</form>



</body>
</html>