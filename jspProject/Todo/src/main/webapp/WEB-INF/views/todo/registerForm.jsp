<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REGISTER Page</title>
<style>
* {margin:0;padding:0;}
.register {width:200px;padding:0 0 0 10px;}
.register ul li {display:flex;margin:5px 0;list-style:none;justify-content:space-between;align-items:center;}
span {width:50px;}
input {width:calc(100% - 50px);height:30px;}
.button_wrap input {width:calc(100%/2 - 3px);height:30px;}
</style>
</head>
<body>

<h1>Todo 등록 페이지</h1>

<form method="post">
	<div class="register">
		<ul>
			<li><span>할일 : </span><input type="text" name="todo" placeholder="Title" /></li>
			<li><span>날짜 : </span><input type="date" name="duedate" /></li>
			<li class="button_wrap">
				<input type="reset" value="RESET" />
				<input type="submit" value="REGISTER" />
			</li>
		</ul>
	</div>
</form>

</body>
</html>