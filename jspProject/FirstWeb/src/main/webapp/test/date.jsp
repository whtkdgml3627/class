<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	Date now = new Date();

	request.getParameter("age");
	
	out.println(111);

	java.time.LocalDateTime time = java.time.LocalDateTime.now();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>안녕하세요!!!!</h1>
	<h3><%=now %></h3>
	<h3><%=time %></h3>
	<h3><%= "time" %></h3>
	
</body>
</html>