<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-16
  Time: 오후 7:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>EMP Register</title>
</head>
<body>
<h1>EMP Register</h1>
<hr>
<form method="post">
	<table>
		<tbody>
			<tr>
				<th>사원이름</th>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<th>부서명</th>
				<td><input type="text" name="job"></td>
			</tr>
			<tr>
				<th>사수번호</th>
				<td><input type="text" name="mgr"></td>
			</tr>
			<tr>
				<th>입사일</th>
				<td><input type="date" name="hiredate"></td>
			</tr>
			<tr>
				<th>급여</th>
				<td><input type="text" name="sal"></td>
			</tr>
			<tr>
				<th>상여금</th>
				<td><input type="text" name="comm"></td>
			</tr>
			<tr>
				<th>부서번호</th>
				<td><input type="text" name="deptno"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="등록"></td>
			</tr>
		</tbody>
	</table>
</form>
</body>
</html>
