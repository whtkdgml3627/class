<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=request.getAttribute("title") %></title>
</head>


<body>
<div id="form">
   <!-- 
      action : form내부에서 작성한 input 파라미터 데이터를 처리하는 경로
            : 생략 가능 -> 생략하면 자기 자신의 현재 url로 보내진다.!
   -->
   <h1><%=request.getAttribute("title") %></h1>
   <form method="post">
      ID<input type="text" name="num1">
      <BR>
      PASSWORD<input type="text" name="num2">
      <input type="submit">
   </form>
</div>
</body>
</html>