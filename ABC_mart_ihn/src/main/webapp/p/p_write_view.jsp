<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>제품등록</h2>
	
	<table border="0">
		<form action= "p_write_view.do" method="post">
			<tr>
			  <td>제품이름</td>
			  <td><input type="text" name="productname" size="20"></td>
			 </tr>
			<tr>
			  <td>가격</td>
			  <td><input type="text" name="productprice" size="20"></td>
			  </tr>
			<tr>
			  <td>사이즈</td>
			  <td><input  type="text" name="productsize" size="10"></td> 
			 </tr>
			 <tr>
			<tr>
			  <tr>
			  <td>사이즈:</td>
				<td><input type="radio" name="productsize" value="210">210mm
					<input type="radio" name="productsize" value="220">220mm
					<input type="radio" name="productsize" value="230">230mm
					<input type="radio" name="productsize" value="240">240mm
					<input type="radio" name="productsize" value="250">250mm
					<input type="radio" name="productsize" value="260">260mm
					<input type="radio" name="productsize" value="270">270mm</td>
			</tr>
			<tr>
			  <td>품목</td>
			 <td><select name="productsection">
			<option value="운동화">운동화</option>
			<option value="구두">구두</option>
			<option value="샌들">샌들</option>
			<option value="장화">장화</option>
			<option value="기타">기타</option></select></td>
			 <tr>
			 	<tr><td>색상: </td>
			 	<td><input type="text" name="productcolor" size="10"></td>
			 </tr>
			<tr>
			<td>입고수량: </td>
			<td><input type="text" name="productqnt" size="3">개</td>
			</tr>
			<tr>
			<td>입고일: </td>
			<td><input type="date" name="productputin"></td>
			</tr>
			<tr>
			<td>제조사: </td>
			<td><input type="text" name="productmadein" size="10"></td>
			</tr>
			<tr>
			 	<td colspan="2"><input type="submit" value="입력"> &nbsp;&nbsp;&nbsp;<a href="list.do">목록보기</a></td>			  
			</tr>
		</form>
	</table>
	
</body>
</html>