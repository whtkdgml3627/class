<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
<style>
* {text-align:center;}
table {width:100%;table-layout:fixed;}
</style>
</head>
<body>

	<h1>include를 이용한 페이지 모듈화</h1>
	<hr>
	<%@ include file="menu.jsp" %>
	
	<table style="width:100%;">
		<colgroup>
			<col width="50%">
		</colgroup>
		<tbody>
			<tr>
				<td><%@ include file="news.jsp" %></td>
				<td><%@ include file="shopping.jsp" %></td>
			</tr>
		</tbody>
	</table>

</body>
</html>