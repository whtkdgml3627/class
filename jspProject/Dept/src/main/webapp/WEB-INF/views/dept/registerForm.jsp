<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REGISTER Page</title>
</head>
<body>

<h1>Todo 등록 페이지</h1>

<form method="post">
	<input type="text" name="deptno" placeholder="부서번호" /><br>
	<input type="text" name="empno" placeholder="사원번호" /><br>
	<input type="text" name="ename" placeholder="사원이름" /><br>
	<input type="text" name="job" placeholder="부서명" /><br>
	<input type="text" name="hiredate" placeholder="입사일" /><br>
	<input type="reset" /> <input type="submit" value="register" />
</form>

</body>
</html>