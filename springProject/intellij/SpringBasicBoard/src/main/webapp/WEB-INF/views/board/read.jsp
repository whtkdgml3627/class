<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-19
  Time: 오전 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>게시글 상세</title>
	<style>
        table {border:1px solid black;}
        th, td {padding:15px;border:1px solid black;}
        img {max-width:300px;}
	</style>
</head>
<body>
<div class="wrap">
	<h1>게시글 상세</h1>
	<hr>
	<table>
		<tbody>
			<tr>
				<th>게시글 번호 : </th>
				<td>${article.bno}</td>
			</tr>
			<tr>
				<th>제목 : </th>
				<td>${article.title}</td>
			</tr>
			<tr>
				<th>내용 : </th>
				<td>${article.content}</td>
			</tr>
			<tr>
				<th>작성자 : </th>
				<td>${article.writer}</td>
			</tr>
			<c:if test="${article.file ne null}">
			<tr>
				<th>첨부파일<br>(이미지) : </th>
				<td><img src="/uploadfile/board/${article.file}" alt="${article.file}"></td>
			</tr>
			</c:if>
			<tr>
				<th>등록일 : </th>
				<td>${article.regdate}</td>
			</tr>
			<tr>
				<th>수정일 : </th>
				<td>${article.updatedate}</td>
			</tr>
		</tbody>
	</table>
	<br>
	<a href="/board/list">리스트</a>
	<a href="/board/modify?bno=${article.bno}">수정</a>
	<a href="/board/delete?bno=${article.bno}">삭제</a>

</div>
</body>
</html>
