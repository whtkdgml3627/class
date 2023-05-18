<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-16
  Time: 오후 3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>부서 리스트</title>
	<style>
		table {border:1px solid black;}
		th,
		td {padding:10px;text-align:center;border:1px solid black;}
		.searchBox {width:400px;margin:15px;padding:15px;border:1px solid gray;}
	</style>
</head>
<body>

<h1>부서 리스트</h1>
<hr>

<div class="searchBox">
	<form method="get">
		검색 :
		<select name="searchType">
			<option value="dname">부서이름</option>
			<option value="loc">부서위치</option>
			<option value="both">이름+위치</option>
		</select>
		<input type="text" name="keyword">
		<input type="submit" value="검색">
	</form>
</div>

<table>
	<thead>
		<tr>
			<th>부서 번호</th>
			<th>부서 이름</th>
			<th>부서 위치</th>
			<th>관리</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dept" items="${list}">
		<tr>
			<td>${dept.deptno}</td>
			<td>${dept.dname}</td>
			<td>${dept.loc}</td>
			<td>
				<a href="/dept/modify?no=${dept.deptno}">수정</a>
				<a href="/dept/delete?no=${dept.deptno}">삭제</a>
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table>

<a href="/dept/regist">부서 등록</a>

</body>
</html>