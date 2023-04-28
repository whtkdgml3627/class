<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setAttribute("totalPageNum", 5);
	request.setAttribute("msg", "1|손흥민|010-9999-7777|런던");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL c:foreach</title>
</head>
<body>
	<!-- 1|손흥민|010-9999-7777|런던 -->
	<c:forTokens var="str" items="${msg}" delims="|" varStatus="stat">
		<c:if test="${stat.index eq 1}">이름 : ${str}</c:if>
	</c:forTokens>
	
	<hr>
	
	<h2>1 ~ 5 까지 반복 (페이징 넘버)</h2>
	<c:forEach var="num" begin="1" end="${totalPageNum }" step="1">
		[${num}]
	</c:forEach>
	
	<hr>

	<table border="1" style="width:50%;">
		<colgroup>
			<col style="width:calc(100%/5);" />
		</colgroup>
		<thead>
			<tr>
				<th>index</th>
				<th>count</th>
				<th>아이디</th>
				<th>이름</th>
				<th>비밀번호</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="member" items="${members}" varStatus="stat">
			<tr>
				<td>${stat.index}</td>
				<td>${stat.count}</td>
				<td>${member.id}</td>
				<td>
					<c:out value="${member.name}" escapeXml="false" default="noname" />
				</td>
				<td>${member.pw}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>

</body>
</html>