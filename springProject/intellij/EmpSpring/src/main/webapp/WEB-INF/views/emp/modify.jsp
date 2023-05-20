<%--
  Created by IntelliJ IDEA.
  User: whtkd
  Date: 2023-05-20
  Time: 오전 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>EMP Modify</title>
</head>
<body>
<h1>EMP Modify</h1>
<hr>
<form method="post">
	<table>
		<tbody>
		<tr>
			<th>사원번호</th>
			<td>
				<input type="hidden" name="empno" value="${emp.empno}">
				${emp.empno}
			</td>
		</tr>
		<tr>
			<th>사원이름</th>
			<td><input type="text" name="ename" value="${emp.ename}"></td>
		</tr>
		<tr>
			<th>부서명</th>
			<td><input type="text" name="job" value="${emp.job}"></td>
		</tr>
		<tr>
			<th>사수번호</th>
			<td><input type="text" name="mgr" value="${emp.mgr}"></td>
		</tr>
		<tr>
			<th>입사일</th>
			<td><input type="date" name="hiredate" value="${emp.hiredate}"></td>
		</tr>
		<tr>
			<th>급여</th>
			<td><input type="text" name="sal" value="${emp.sal}"></td>
		</tr>
		<tr>
			<th>상여금</th>
			<td><input type="text" name="comm" value="${emp.comm}"></td>
		</tr>
		<tr>
			<th>부서번호</th>
			<td><input type="text" name="deptno" value="${emp.deptno}"></td>
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
