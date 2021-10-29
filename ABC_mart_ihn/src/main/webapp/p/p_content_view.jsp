<<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>제품 수정 및 삭제</h2>
	<table border="0">
		<form action= "p_modify.do" method="post">
			<input type="hidden" name="productid" value="${content_view.productid}">
			<tr>
			  <td>제품번호</td>
			  <td>${content_view.productid}</td>
			 </tr>
			<tr>
			<tr>
			  <td>제품이름</td>
			  <td><input type="text" name="productname" size="20" value="${content_view.productname}"></td>
			 </tr>
			<tr>
			  <td>가격</td>
			  <td><input type="text" name="productprice" size="50" value="${content_view.productprice}"></td>
			  </tr>
			<tr>
			<tr>
			  <td>사이즈</td>
			  <td><input type="text" name="productsize" size="50" value="${content_view.productsize}"></td>
			  </tr>
			<tr>
			<tr>
			  <td>품목</td>
			  <td><input type="text" name="productsection" size="50" value="${content_view.productsection}"></td>
			  </tr>
			<tr>
			<tr>
			  <td>색상</td>
			  <td><input type="text" name="productcolor" size="50" value="${content_view.productcolor}"></td>
			  </tr>
			<tr>
			<tr>
			  <td>수량</td>
			  <td><input type="text" name="productqnt" size="50" value="${content_view.productqnt}"></td>
			  </tr>
			<tr>
			<tr>
			  <td>입고일</td>
			  <td><input type="date" name="productputin" size="50" value="${content_view.productputin}"></td>
			  </tr>
			<tr>
			<tr>
			  <td>제조사</td>
			  <td><input type="text" name="productmadein" size="50" value="${content_view.productmadein}"></td>
			  </tr>
			<tr>
			 	<td colspan="2"><input type="submit" value="수정">			  
			</tr>
			</form>
		<form action="p_delete.do">
			<input type="hidden" name="productid" value="${content_view.productid}">
			<td colspan="2"><input type="submit" value="삭제" ></td>
		</form>
	</table>
</body>
</html>