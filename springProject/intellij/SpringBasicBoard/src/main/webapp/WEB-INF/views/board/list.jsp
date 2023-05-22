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
		td:nth-child(3) {text-align:left;}
	</style>
</head>
<body>
<div class="wrap">
	<h1>게시판 리스트</h1>
	<hr>
	<div>
		로그인 정보 : ${loginInfo}<br>
		<c:if test="${loginInfo ne null}"><a href="/logout">logout</a></c:if>
	</div>
	<hr>
	<div class="searchArea">
		<form method="get">
			<select name="searchType">
				<option value="title">제목</option>
				<option value="content">내용</option>
				<option value="writer">작성자</option>
			</select>
			<input type="text" name="keyword">
			<input type="submit" value="검색">
		</form>
	</div>
	<table>
		<thead>
			<tr>
				<%--<th>NO</th>--%>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${page.list}">
			<tr>
				<%--<td>${stat.count}</td>--%>
				<td>${board.bno}</td>
				<td><a href="/board/read?bno=${board.bno}">${board.title}</a></td>
				<td>${board.writer}</td>
				<td>${board.regdate}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="paging">
		<c:if test="${page.prev}">
			<a href="/board/list?p=${page.startNum-1}<c:if test="${param.searchType ne null and param.keyword ne null}">&searchType=${param.searchType}&keyword=${param.keyword}</c:if>">이전</a>
		</c:if>
		<c:forEach begin="${page.startNum}" end="${page.endNum}" var="num">
			<a href="/board/list?p=${num}<c:if test="${param.searchType ne null and param.keyword ne null}">&searchType=${param.searchType}&keyword=${param.keyword}</c:if>">[ ${num} ]</a>
		</c:forEach>
		<c:if test="${page.next}">
			<a href="/board/list?p=${page.endNum+1}<c:if test="${param.searchType ne null and param.keyword ne null}">&searchType=${param.searchType}&keyword=${param.keyword}</c:if>">다음</a>
		</c:if>
	</div>
	<br>
	<a href="/board/write">글쓰기</a>
</div>
</body>
</html>
