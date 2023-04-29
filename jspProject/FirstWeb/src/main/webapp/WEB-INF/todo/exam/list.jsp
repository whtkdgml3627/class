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
</style>
</head>
<body>
	<h1>리스트</h1>
	<ul>
		<c:forEach var="todo" items="${list}" varStatus="stat">
			<li><a href="#">${stat.count} / ${todo.title} / ${todo.date}</a></li>
		</c:forEach>
	</ul>
	<a href="register">등록페이지</a>
</body>
</html>