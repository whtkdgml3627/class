<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-16
  Time: 오후 4:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>부서 등록</title>
</head>
<body>

<h1>부서 등록</h1>
<hr>
<form method="post">
	<table>
		<tbody>
			<tr>
				<th>부서 이름 : </th>
				<td><input type="text" name="dname" required></td>
			</tr>
			<tr>
				<th>부서 위치 : </th>
				<td><input type="text" name="loc" required></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit"></td>
			</tr>
		</tbody>
	</table>
</form>

</body>
</html>
