<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>체크사항 입력</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr>
<%
		String userid = null;
		if(session.getAttribute("userid") != null){
			userid = (String)session.getAttribute("userid");
		}
	%>
	<h1 align="center" style="color:#fd9a9a">체크사항 입력 후 확인 버튼을 누르세요!</h1>
	
	<form action="checklist_write.cob" method = "post">
	<div align="center">
		<table border="0">
			<tr>
				<!-- <td>입력일</td>
				<td><input type ="date" name="calInsertdate" size = "25"></td> -->
				<td>병원명</td>
				<td><input type ="text" name="checkAppHospital" size = "25"></td>
				<td></td>
				<td></td>
				<td>병원예약일</td>
				<td><input type ="date" name="checkAppointdate" size = "25"></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td>병원주소</td>
				<td><input type ="text" name="checkHAddress1" id="address_kakao" size = "25"></td>
				<td></td>
				<td></td>
				<td>상세 주소</td>
            	<td><input type="text" name="checkHAddress2" /></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td>사랑기록</td>
				<td><input type ="date" name="checkRelation" size = "25"></td>
				<td></td>
				<td></td>
				<td>체온</td>
				<td><input type ="text" name="checkBodytemp" size = "5"> 도</td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td>예약시간</td>
				<td><select name = "checkAppointTime">
					<option value="09:00:00" selected="selected">09:00</option>
					<option value="10:00:00">10:00</option>
					<option value="11:00:00">11:00</option>
					<option value="12:00:00">12:00</option>
					<option value="13:00:00">13:00</option>
					<option value="14:00:00">14:00</option>
					<option value="15:00:00">15:00</option>
					<option value="16:00:00">16:00</option>
					<option value="17:00:00">17:00</option>
					<option value="18:00:00">18:00</option>
				</select></td>
				<td></td>
				<td></td>
				<td>약복용 여부 </td>
				<td>복용<input type ="radio" name="checkDrug" value="복용" size = "25">
					미복용<input type ="radio" name="checkDrug" value="미복용" size = "25"></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td><input type="submit" style="background:#fd9a9a;color:white;border-radius: 10px" value="입력"></td>
				<td><a href=checklist_list.jsp><input type="button" style="background:#fd9a9a;color:white;border-radius: 10px" value="목록으로"></a></td>
<!-- 				<td><a href=front_calender.jsp><input type="button" value="달력"></a></td> -->
			</tr>
		</table>
	</div>
	</form>
			
</body>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
window.onload = function(){
    document.getElementById("address_kakao").addEventListener("click", function(){ //주소입력칸을 클릭하면
        //카카오 지도 발생
        new daum.Postcode({
            oncomplete: function(data) { //선택시 입력값 세팅
                document.getElementById("address_kakao").value = data.address; // 주소 넣기
                document.querySelector("input[name=address_detail]").focus(); //상세입력 포커싱
            }
        }).open();
    });
}
</script>
<br><br>
</html>
<jsp:include page="footer.jsp"/>