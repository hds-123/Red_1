<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>제품 수정 및 삭제</h2>
	<form action="product_modify.cob" method = "post">
		<table border="0">
			<%-- <input type="hidden" name="aId" value="${content_view.aId}"> --%>
			<tr>
				<td>제품코드</td>
				<td><input type ="text" readonly="readonly" name="productid" size = "20" value="${product_content_view.productid}"></td>
			</tr>
			<tr>
				<td>제품명</td>
				<td><input type ="text" name="productname" size = "20" value="${product_content_view.productname}"></td>
			</tr>
			<tr>
				<td>구분</td>
				<td><input type ="text" name="productcategory" size = "20" value="${product_content_view.productcategory}"></td>
			</tr>
			<tr>
				<td>상세구분</td>
				<td><input type ="text" name="p_detail_category" size = "20" value="${product_content_view.p_detail_category}"></td>
			</tr>
			<tr>
				<td>정가</td>
				<td><input type ="text" name="productprice" size = "20" value="${product_content_view.productprice}"></td>
			</tr>
			<tr>
				<td>할인가</td>
				<td><input type ="text" name="productsaleprice" size = "20" value="${product_content_view.productsaleprice}"></td>
			</tr>
	
			<tr><td colspan="2"><input type="submit" value="수정"></td></tr>
		</table>
	</form>
		
	<form action="product_delete.cob">
	<input type="hidden" name="productid" value="${product_content_view.productid}">
	<input type="submit" value="삭제"> 
	</form>
</body>
</html>