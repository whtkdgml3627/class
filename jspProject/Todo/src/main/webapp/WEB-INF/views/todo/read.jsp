<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>READ Page</title>
<style>
* {margin:0;padding:0;}
.register {width:200px;padding:0 0 0 10px;}
.register ul li {display:flex;margin:5px 0;list-style:none;justify-content:space-between;align-items:center;}
span {width:50px;}
input {width:calc(100% - 50px);height:30px;}
input[type=checkbox] {width:auto;height:auto;}
.button_wrap a {width:calc(100%/2 - 3px);height:30px;}
.button_wrap input {width:100px;height:30px;}
</style>

</head>
<body>

<h1>Todo 상세 페이지</h1>

<div class="register">
	<ul>
		<li><span>번호 : </span><input type="text" name="no" value="${no}" readonly /></li>
		<li><span>할일 : </span><input type="text" name="todo" value="${todo}" placeholder="Title" readonly /></li>
		<li><span>날짜 : </span><input type="date" name="duedate" value="${duedate}" readonly /></li>
		<!-- checkbox의 value -> "on" 체크되면 넘어오는 값 -->
		<li><span>완료 : </span><input type="checkbox" name="complete" ${complete == 'done' ? 'checked' : ''} disabled /></li>
		<li class="button_wrap">
			<a href="modify?no=${no}">Modify</a>
			<%-- <a href="delete?no=${no}">Remove</a> --%>
			<form action="delete" method="post">
				<input type="hidden" name="no" value="${no}">
				<input type="submit" value="Remove">
			</form>
		</li>
	</ul>
</div>

</body>
</html>