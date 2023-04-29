<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>읽기 페이지</title>
<style>
* {margin:0;padding:0;}
.register {width:200px;height:100vh;padding:0 0 0 10px;}
.register ul li {margin:5px 0;list-style:none;}
input {width:100%;height:30px;}
a,
button {display:block;width:100%;height:30px;text-align:center;color:#000;border:1px solid #000;background:#ccc;box-sizing:content-box;cursor:pointer;}
</style>
</head>
<body>
<form action="list" method="post">
	<div class="register">
		<ul>
			<li><input type="text" name="count" value="${count}" readonly /></li>
			<li><input type="text" name="title" value="${title}" readonly /></li>
			<li><input type="date" name="date" value="${date}" readonly /></li>
			<li><button type="submit">Modify / Remove</button></li>
			<li><a href="list">list</a></li>
		</ul>
	</div>
</form>
</body>
</html>