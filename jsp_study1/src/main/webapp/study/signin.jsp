<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<div id="signinBox">
	<form id="signFm" method="post" action="signCheck.jsp">
		<div class="signinInput">
			<div class="loginInput">
				<b>아이디</b>
				<input type="text" name="userId" id="userId">
				<p class="error"></p>
			</div>
			<div class="loginInput">
				<b>비밀번호</b>
				<input type="password" name="userPassword" id="userPassword">
				<p class="error"></p>
			</div>
			<button type="button" id="loginBt">로그인</button>
		</div>
	</form>
	<div class="findAndJoin">
		<p><a href="findUser.jsp">아이디/비밀번호찾기</a></p>
		<p><a href="/jsp_study1/study/?part=signup">회원가입</a></p>
	</div>
</div>

<style>
	.error{color:red; font-size:14px;}
</style>
<script>
	let bt = document.getElementById("loginBt");
	bt.addEventListener("click",function(){	// 로그인 버튼의 클릭 이벤트 등록 및 실행 함수정의
		let id = document.getElementById("userId");
		let pw = document.getElementById("userPassword");
		if(id.value==''){	// 아이디 입력하지 않은 경우
			document.getElementsByClassName("error")[0].innerText="아이디를 입력하세요";
		}else if(pw.value==''){	// 비밀번호 입력하지 않은 경우
			document.getElementsByClassName("error")[1].innerText="비밀번호를 입력하세요";
		}else{	// 아이디,비밀번호 입력하였다면 로그인 처리페이지로 전송 및 이동
			document.getElementById("signFm").submit();
		}
	});
</script>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
