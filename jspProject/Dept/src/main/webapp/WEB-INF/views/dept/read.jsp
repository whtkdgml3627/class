<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>READ Page</title>
</head>
<body>

<h1>Company 상세 페이지</h1>

<input type="text" name="deptno" value="" readonly /><br>
<input type="text" name="empno" value="" readonly /><br>
<input type="text" name="ename" value="" readonly /><br>
<input type="text" name="job" value="" readonly /><br>
<input type="text" name="hiredate" value="" readonly /><br>
<a href="${pageContext.request.contextPath}/modify">수정</a>

</body>
</html>