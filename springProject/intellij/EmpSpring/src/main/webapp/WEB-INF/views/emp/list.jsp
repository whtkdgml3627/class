<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-16
  Time: 오후 7:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<title>EMP LIST</title>
	<style>
        table {border:1px solid black;}
        th,
        td {padding:5px;text-align:center;border:1px solid black;}
	</style>
</head>
<body>
<h1>EMP 리스트</h1>
<hr>
<table>
	<thead>
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>부서명</th>
			<th>사수번호</th>
			<th>입사일</th>
			<th>급여</th>
			<th>상여금</th>
			<th>부서번호</th>
			<th>관리</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="emplist" items="${list}">
		<tr>
			<td>${emplist.empno}</td>
			<td>${emplist.ename}</td>
			<td>${emplist.job}</td>
			<td>${emplist.mgr}</td>
			<td>${emplist.hiredate}</td>
			<td><fmt:formatNumber value="${emplist.sal}" pattern="#,###"/></td>
			<td><fmt:formatNumber value="${emplist.comm}" pattern="#,###"/></td>
			<td>${emplist.deptno}</td>
			<td>
				<a href="/emp/modify?empno=${emplist.empno}">수정</a>
				<a href="/emp/delete?empno=${emplist.empno}">삭제</a>
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table><br>
<a href="/emp/register">등록</a>
</body>
</html>
