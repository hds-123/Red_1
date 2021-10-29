<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Vector"%>
<%@page import="baby.board.dao.ProductDao"%>
<%@page import="baby.board.dto.ProductDto"%>
<!DOCTYPE html>
<html lang="ko">
<style>
.searchBoard{
	margin: 0px 150px 0px
}

</style>
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.9.0/jquery.js"></script>
<script>
function choisePri(){
	document.cartForm.submit();
}

$(function(){
	var cartno = document.getElementsByName("productid");
	var count = cartno.length;

	$("#allCheck").click(function(){
		var cnList = $("input[name=productid]");
		for(var i = 0; i<cnList.length; i++){
			cnList[i].checked = this.checked;
		}
	});
	$("input[name='productid']").click(function(){
		if($("input[name='productid']:checked").length == count){
			$("#allCheck")[0].checked= true;
		}
		else {
			$("#allCheck")[0].checked= false;
		}
	});
	

});
function selectDelete() {
	var cartno = $("input[name='cart_no']").length
	var str = '';
	for(var i = 0; i<cartno; i++){
		if(document.getElementsByName("cart_no")[i].checked==true){
			var cart_no = document.getElementsByName("cart_no")[i].value;
			if(i==cartno-1){
				str += "cart_no="+cart_no;
			}else{
				str += "cart_no="+cart_no+"&";
			}
		}
	}
	if(cartno == 0){
		alert("선택된 상품이 없습니다.");
	} else{
		open("cartDelete.jsp?"+str, "seleteDelete", "width=300, height=200");
	}
	
}

function allDelete(){
	var cartno = $("input[name='cart_no']").length
	var str = '';
	for(var i = 0; i<cartno; i++){
		if(document.getElementsByName("cart_no")[i]){
			var cart_no = document.getElementsByName("cart_no")[i].value;
			if(i==cartno-1){
				str += "cart_no="+cart_no;
			}else{
				str += "cart_no="+cart_no+"&";
			}
		}
	}
	if(cartno == 0){
		alert("선택된 상품이 없습니다.");
	} else{
		open("cartDelete.jsp?"+str, "seleteDelete", "width=300, height=200");
	}


}
</script>
<head>
<style type="text/css"></style>
<hr>
<title>상품페이지</title>
</head>

<body>
<jsp:include page="/header.jsp"/>
<h1 align="center">상품페이지</h1><br><br>
	<div align="left" class="searchBoard">
		<form action="listProductSearch.cob" method="get">
			검색선택 : 
				<select name="search">
					<option value="productcategory">분류</option>
					<option value="productname">	상품명</option>
				</select>
			<input type="text" name="content" size="30">
			<input type="submit" value="검색"><br><br>
		</form>
	</div><br>
	<!-- 검색창 -->


	<div align="center"> 
	<table border="1" style="width: 80%; align-content: center;" >
		<tr>
			<th><input type="checkbox" id="allCheck"></th><th>제품코드</th><th>분류</th><th>상품명</th><th>가격</th><th>할인가</th>
		</tr>
		<c:forEach items="${listproduct}" var="dto">
			<tr>
				<td><input type="checkbox" ></td>
				<td align="center"><a href="productcontentview.cob?productid=${dto.productid}">${dto.productid}</a></td>
				<td align="center" width="100">${dto.productcategory}</td>
				<td align="center"><a href="productDetailView.cob?productid=${dto.productid}">${dto.productname}</a></td>
				<td align="center">${dto.productprice}</td>
				<td align="center">${dto.productsaleprice}</td>
			</tr>
		</c:forEach>
		<tr>
		</tr>
	</table>
	<form action="productRegisterView.jsp">
			<br><input type="submit" value="상품등록"><br><br>
	</form>
		
		<%
		Object count_obj = request.getAttribute("count");
		String count_str = count_obj.toString();
		int count = Integer.parseInt(count_str);
		
		for(int i = 1; i <= count; i++){ 
		%>
			<a style="align-self: center;" href="listproduct.cob?page=<%=i %>">[<%=i %>]</a>
		<% };%>
		<br><br>
</body>
</html>
<jsp:include page="/footer.jsp"/>