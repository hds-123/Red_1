<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>입력 후 확인 버튼을 누르세요!</h2>

	<form action="product_write.cob" method = "post">
		<table border="0">
			<tr>
				<td>제품명</td>
				<td><input type ="text" name="productname" size = "25"></td>
			</tr>
			<tr>
				<td>구분</td>
				<td><select name = "productcategory">
					<option value="임신" selected="selected">임신</option>
					<option value="육아">육아</option>
				</select></td>
			</tr>
			<tr>
				<td>상세구분</td>
				<td><select name = "p_detail_category">
					<option value="영양제">영양제</option>
					<option value="임신테스트기">임신테스트기</option>
					<option value="배란테스트기" selected="selected">배란테스트기</option>
					<option value="임산부속옷">임산부속옷</option>
					<option value="임부복">임부복</option>
					<option value="아동복">아동복</option>
					<option value="이유식">이유식</option>
				</select></td>
			</tr>
			<tr>
				<td>제품정가</td>
				<td><input type ="text" name="productprice" size = "25"></td>
			</tr>
			<tr>
				<td>할인가</td>
				<td><input type ="text" name="productsaleprice" size = "25"></td>
			</tr>
			<tr>
				<td><input type="submit" value="입력"></td>
			</tr>
		</table>
	</form>
</body>
</html>
			<!-- <tr>
				<td>기분</td>
				<td><select name = "calFeel">
					<option value="행복">행복</option>
					<option value="화남">화남</option>
					<option value="보통" selected="selected">보통</option>
					<option value="슬픔">슬픔</option>
					<option value="우울함">우울함</option>
				</select></td>
			</tr> -->
			<!-- <tr>
				<td>사진첨부</td>
				<td><input type ="file" name="calPhoto" size = "25"></td>
				<td><input type="submit" value="업로드"></td>
			</tr> -->