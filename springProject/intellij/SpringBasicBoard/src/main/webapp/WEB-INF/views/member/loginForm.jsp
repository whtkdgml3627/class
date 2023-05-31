<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-22
  Time: 오후 4:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<h1>로그인</h1>
<hr>
<form method="post">
	<table>
		<tbody>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="uid"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<th></th>
				<td>
					<input type="submit" value="로그인">
					<a href="/member/regist">회원가입</a>
				</td>
			</tr>
		</tbody>
	</table>
</form>
</body>
</html>
