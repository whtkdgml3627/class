<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-18
  Time: 오후 5:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>게시판 작성</title>
</head>
<body>
<div class="wrap">
	<h1>게시글 작성</h1>
	<hr>
	<form method="post">
		<table>
			<tbody>
				<tr>
					<th>작성자 : </th>
					<td><input type="text" name="writer" required></td>
				</tr>
				<tr>
					<th>제목 : </th>
					<td><input type="text" name="title" required></td>
				</tr>
				<tr>
					<th>내용 : </th>
					<td><textarea name="content" cols="22" rows="5" required style="resize:none;"></textarea></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="reset">
						<input type="submit" value="등록">
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</div>
</body>
</html>
