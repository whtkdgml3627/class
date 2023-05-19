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
	<title>게시글 수정</title>
	<style>
        table {border:1px solid black;}
        th, td {padding:15px;border:1px solid black;}
        img {max-width:300px;}
	</style>
</head>
<body>
<div class="wrap">
	<h1>게시글 수정</h1>
	<hr>
	<%--
		새로운 파일을 업로드 할 수 있다!!!
		이전에 업로드한 파일이 있을 수 있다
	--%>
	<form method="post" enctype="multipart/form-data">
		<input type="hidden" name="bno" value="${board.bno}">
		<table>
			<tbody>
				<tr>
					<th>제목 : </th>
					<td><input type="text" name="title" value="${board.title}"></td>
				</tr>
				<tr>
					<th>내용 : </th>
					<td><textarea name="content" cols="22" rows="5" style="resize:none;">${board.content}</textarea></td>
				</tr>
				<tr>
					<th>작성자 : </th>
					<td><input type="text" name="writer" value="${board.writer}"></td>
				</tr>
				<tr>
					<th>첨부된 파일 : </th>
					<td>
						<c:if test="${board.file ne null}">
							<input type="hidden" name="oldfile" value="${board.file}">
							${board.file}
						</c:if>
					</td>
				</tr>
				<tr>
					<th>첨부파일 : </th>
					<td><input type="file" name="file"></td>
				</tr>
				<tr>
					<th></th>
					<td>
						<input type="reset">
						<input type="submit" value="수정">
					</td>
				</tr>
			</tbody>
		</table>
	</form>

</div>
</body>
</html>
