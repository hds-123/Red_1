<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>LogIn</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="css/comeonCSS.css" type="text/css" />
    <style>
.container_loginpage {
	margin: 40px auto;
	width: 385px;
	line-height: 50px;
}

h5 {
	text-align: center;
}

h5 span {
	color: teal;
}

.login {
	
}

#signup {
	background-color: white;
	color: teal;
	border: 0;
	font-size: 17px;
}

p {
	text-align: center;
}

i {
	color: lightgray;
}

#imail {
	position: absolute;
	top: 130px;
	margin: 0 355px;
}

#ipw {
	position: absolute;
	top: 180px;
	margin: 0 355px;
}

.input {
	border: 1px solid lightgray;
	border-radius: 3px;
}

.login_btn{
	display: flex;
	flex-direction: column;
	padding: 0;
	
}
.login_btn li{
	list-style: none;
	background-color: rgb(255, 80, 90);
	color: white;
	border-radius: 5px;
	border: 0;
	text-align: center;
	margin: 10px;
}

</style>
</head>
<body>
<header>
<jsp:include page="header.jsp"/>
</header>

	<div class="container_loginpage">
        	<h5><span>로그인</span> 페이지입니다.</h5>
        <hr />
        <form action="loginaction.jsp" method="post">
            <input type="text" placeholder="아이디" name="userid" required style="height:30px; width: 380px;" /><br />
            <input type="password" placeholder="비밀번호" name="userpw" required style="height:30px; width: 380px" /><br >
             <ul class="login_btn">
				<li ><input type= "submit" value="일반회원 로그인" style="background-color: rgb(255, 80, 90); color: white; width: 380px;" ><br /></li>
				<li ><input type= "submit" value="관리자 로그인" style="background-color: rgb(255, 80, 90); color: white;width: 380px;" formaction="loginadaction.jsp"><br /></li>
				<li ><input type= "submit" value="HOME" style="background-color: rgb(255, 80, 90); color: white;width: 380px;" formaction="COB_MAIN.jsp"><br /></li>
			</ul>
        </form>
        
        <hr />
        <p><a href="write_view.cob"><input type="button" value="회원가입" id="signup" /></a></p>
    </div>
</body>
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
<script>
Kakao.init('f32a7750bb8e4e95c3927daa0fc8a03a'); //발급받은 키 중 javascript키를 사용해준다.
console.log(Kakao.isInitialized()); // sdk초기화여부판단
//카카오로그인
function kakaoLogin() {
   window.Kakao.Auth.login({
	scope:'profile_nickname,profile_image,gender'
      success: function (response) {
        Kakao.API.request({
          url: '/v2/user/me',		
          success: function (response) {
        	  console.log(response)
          },
          fail: function (error) {
            console.log(error)
          },
        })
      },
      fail: function (error) {
        console.log(error)
      },
    })
  }
//카카오로그아웃  
function kakaoLogout() {
    if (Kakao.Auth.getAccessToken()) {
      Kakao.API.request({			
        url: '/v1/user/unlink',
        success: function (response) {
        	console.log(response)
        },
        fail: function (error) {
          console.log(error)
        },
      })
      Kakao.Auth.setAccessToken(undefined)
    }
  }  
</script>



</html>
<jsp:include page="footer.jsp"/>