<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Form Test</h1>
<form action="<%=request.getContextPath() %>/form/input.jsp" method="post">

	내용 입력<br>
	<textarea name="content" rows="5" cols="20">안녕하세요!</textarea>
	<br>
	성별 : 
	<input type="radio" name="gender" value="male" id="male"><label for="male">남성</label>
	<input type="radio" name="gender" value="female" id="female" checked><label for="female">여성</label>
	<br>
	관심사 :
	<input type="checkbox" name="lang" value="java" id="java"><label for="java">java</label>
	<input type="checkbox" name="lang" value="jsp" id="jsp"><label for="jsp">jsp</label>
	<input type="checkbox" name="lang" value="sql" id="sql"><label for="sql">sql</label>
	<input type="checkbox" name="lang" value="html" id="html"><label for="html">html</label>
	<br>
	태어난 년도
	<select name="birthyear">
		<option value="2002">2002</option>
		<option value="2001">2001</option>
		<option value="2000">2000</option>
		<option value="1999">1999</option>
		<option value="1998">1998</option>
	</select>
	<br>
	나이 : <input type="number" name="age" min="0" max="100">
	<br>
	생일 : <input type="date" name="birth">
	<br><br>
	<button type="submit">제출</button>
	
</form>

</body>
</html>