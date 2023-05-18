<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-18
  Time: 오후 5:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>게시판 리스트</title>
	<style>
		table {border:1px solid black;}
		th, td {padding:15px;text-align:center;border:1px solid black;}
		td:nth-child(2) {text-align:left;}
	</style>
</head>
<body>
<div class="wrap">
	<h1>게시판 리스트</h1>
	<hr>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${list}">
			<tr>
				<td>${board.bno}</td>
				<td><a href="/board/read?bno=${board.bno}">${board.title}</a></td>
				<td>${board.writer}</td>
				<td>${board.regdate}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<a href="/board/write">글쓰기</a>
</div>
</body>
</html>
