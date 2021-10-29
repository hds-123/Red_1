<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록 페이지</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<hr>
<h1 align="center">상품 등록 페이지</h1>
<div align="center">

<table>
	<form action="productRegister.cob" method="post" enctype="multipart/form-data">
		<tr><td>상품명:</td><td><input type="text" name="productname" size="20"></td></tr>
		<tr><td>상품분류:</td><td>
		<select name="productcategory">
			<option value="임신">임신</option>
			<option value="육아">육아</option>
		</select>(임신/육아 중 선택 가능)</td></tr>
		<tr><td>상세분류:</td><td> <input type="text" name="p_detail_category"></td></tr>
		<tr><td>사이즈:</td><td> <input type="text" name="detailSize"></td></tr>
		<tr><td>색상:</td><td> <input type="text" name="detailColor"></td></tr>
		<tr><td>상품가격:</td><td> <input type="text" name="productprice">원</td></tr>
		<tr><td>상품할인가격:</td><td> <input type="text" name="productsaleprice">원</td></tr>
		<tr><td>입고량:</td><td> <input type="text" name="detailAmount">개</td></tr>
		<tr><td>상품사진:</td><td><input type="file" name="file"></td></tr>
		<tr><td colspan="2"><input type="submit" value="상품등록"></td></tr>
	</form>
</table>
</div><br><br><Br>
</body>
</html>
<jsp:include page="/footer.jsp"/>