<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
<style>
ul, li {padding:0;list-style:none;}
label {display:inline-block;width:70px;}
</style>
</head>
<body>

	<h1>로그인</h1>
	<hr>
	<!--
		절대경로(서버 루트 경로기준) : /web/auth/login.jsp
		상대경로(현재 파일기준) : login.jsp
	-->
	<form action="/web/login" method="post">
		<ul>
			<li>
				<label for="userid">아이디</label>
				<input type="text" name="userid" id="userid" autocomplete="off" />
			</li>
			<li>
				<label for="userpw">비밀번호</label>
				<input type="password" name="userpw" id="userpw" />
			</li>
			<li><input type="submit" value="로그인" /></li>
		</ul>
	</form>

</body>
</html>