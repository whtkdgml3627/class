<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL c:out</title>
<style>
.red {color:red;}
</style>
</head>
<body>
	
	<c:forEach var="member" items="${members}">
		<c:out value="${member.name}" escapeXml="false" default="<span class='red'>noname</span>"/><br>
	</c:forEach>
	
	<hr>
	${members[0]}<br>
	${members[1]} / ${members[1].name}<br>
	<c:out value="${members[0].name}" /><br>
	
	<!-- 값이 null값일 때 안에 들어간 내용 출력 -->
	<c:out value="${members[1].name}" escapeXml="false">
		<span class="red">이름 입력값 없음</span>
	</c:out><br>
	
	<c:out value="${members[2].name}" escapeXml="false">
		<span class="red">이름 입력값 없음</span>
	</c:out><br>
	
	<ul>
	<c:forEach var="member" items="${members}">
		<li>
			${member.id} / ${member.pw} / ${member.name}
		</li>
	</c:forEach>
	</ul>
	
	<hr>
	${members}
	<c:out value=""></c:out>

</body>
</html>