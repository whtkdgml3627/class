<%@page import="member.Member"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<Member> members = new ArrayList<Member>();
	
	members.add(new Member("cool00", "0000", "COOL00"));
	members.add(new Member("cool01", "1111", null));
	members.add(new Member("cool02", "2222", "COOL02"));
	members.add(new Member("cool03", "3333", "COOL03"));
	members.add(new Member("cool04", "4444", null));
	members.add(new Member("cool05", "5555", null));
	members.add(new Member("cool06", "6666", "COOL06"));
	members.add(new Member("cool07", "7777", null));
	members.add(new Member("cool08", "8888", "COOL08"));
	members.add(new Member("cool09", "9999", "COOL09"));
	
	session.setAttribute("members", members);
%>
</body>
</html>