<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트 페이지</title>
<style>
ul {margin:0;padding:0;}
li {margin:5px 0;list-style:none;}
.button_wrap {margin:15px 0 0;}
</style>
</head>
<body>
	<h1>리스트</h1>
	<ul>
		<c:forEach var="todo" items="${list}" varStatus="stat">
			<li><a href="read?count=${stat.count}&title=${todo.title}&date=${todo.date}">${stat.count} / ${todo.title} / ${todo.date}</a></li>
		</c:forEach>
	</ul>
	<div class="button_wrap">
		<a href="register">등록페이지</a>
	</div>
</body>
</html>