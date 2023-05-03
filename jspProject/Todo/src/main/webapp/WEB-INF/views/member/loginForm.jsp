<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login 페이지</title>
</head>
<body>
<h1>로그인 ${cookie.reid.value}</h1>
<hr>
<form method="post">
	ID : <input type="text" name="mid" value="${cookie.reid.value}" autocomplete="off" /><br>
	PW : <input type="password" name="pw" /><br>
	<input type="checkbox" name="reid" id="reid" ${cookie.reid.value ne null ? 'checked' : ''} /><label for="reid">ID 기억하기</label><br>
	<input type="submit" value="로그인" />
</form>

</body>
</html>