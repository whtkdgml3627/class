<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setAttribute("year", 2001);
	request.setAttribute("gender", "F");
	request.setAttribute("userid", "cool");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL c:if</title>
</head>
<body>

	<label for="userid">ID : </label><input type="text" name="userid" value="${userid}" id="userid"><br>
	
	<input type="radio" name="gender" value="M" id="male" ${gender eq 'M' ? 'checked' : ''}><label for="male">남성</label>
	<input type="radio" name="gender" value="F" id="female" ${gender eq 'F' ? 'checked' : ''}><label for="female">여성</label><br>
	
	<select>
		<option ${year eq 1999 ? 'selected':''}>1999</option>
		<option ${year eq 2000 ? 'selected':''}>2000</option>
		<option ${year eq 2001 ? 'selected':''}>2001</option>
	</select>
	
	<c:choose>
		<c:when test="${param.sel eq 'a'}">
			<h3>a 를 선택했습니다.</h3>
		</c:when>
		<c:when test="${param.sel eq 'b'}">
			<h3>b 를 선택했습니다.</h3>
		</c:when>
		<c:when test="${param.sel eq 'c'}">
			<h3>c 를 선택했습니다.</h3>
		</c:when>
		<c:otherwise>
			<h3>잘못된 데이터가 선택되었습니다.</h3>
		</c:otherwise>
	</c:choose>

</body>
</html>