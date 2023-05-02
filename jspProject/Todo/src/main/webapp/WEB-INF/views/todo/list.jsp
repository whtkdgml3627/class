<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LIST Page</title>
<style>
ul {margin:0;padding:0;}
li {margin:5px 0;list-style:none;}
.button_wrap {margin:15px 0 0;}
</style>
</head>
<body>

<h1>Todo 리스트 페이지</h1>
<ul>
	<li><a href="${pageContext.request.contextPath}/todo/read?no=1">1. 청소</a> 2023-05-01 DONE</li>
	<li><a href="${pageContext.request.contextPath}/todo/read?no=2">2. 청소</a> 2023-05-01 DONE</li>
	<li><a href="${pageContext.request.contextPath}/todo/read?no=3">3. 청소</a> 2023-05-01 DONE</li>
	<li><a href="${pageContext.request.contextPath}/todo/read?no=4">4. 청소</a> 2023-05-01 DONE</li>
	<li><a href="${pageContext.request.contextPath}/todo/read?no=5">5. 청소</a> 2023-05-01 DONE</li>
</ul>
${todoList }
<%-- <ul>
	<c:forEach var="list" items="${todoList}">
		<li><a href="${pageContext.request.contextPath}/todo/read?no=${todoList.tno}">${todoList.tno} ${todoList.todo}</a> ${todoList.duedate} DONE</li>
	</c:forEach>
</ul> --%>

<a href="${pageContext.request.contextPath}/todo/register">Todo Regist</a>

</body>
</html>