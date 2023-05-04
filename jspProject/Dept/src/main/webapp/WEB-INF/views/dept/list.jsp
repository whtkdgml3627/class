<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LIST Page</title>
</head>
<body>

<h1>Company 리스트 페이지</h1>

<ul>
	<c:forEach var="list" items="${companyList}" varStatus="stat">
		<li><a href="${pageContext.request.contextPath}/read?count=${stat.count}">${stat.count} / ${list.deptno} / ${list.empno} / ${list.ename} / ${list.job} / ${list.hiredate}</a></li>
	</c:forEach>
</ul>
<a href="${pageContext.request.contextPath}/regist">등록</a>

</body>
</html>