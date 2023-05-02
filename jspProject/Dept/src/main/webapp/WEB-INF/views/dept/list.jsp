<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LIST Page</title>
</head>
<body>

<h1>Dept 리스트 페이지</h1>

<ul>
	<c:forEach var="list" items="${deptlist}">
		<li><a href="#">${list.deptno} / ${list.dname} / ${list.loc}</a></li>
	</c:forEach>
</ul>

</body>
</html>