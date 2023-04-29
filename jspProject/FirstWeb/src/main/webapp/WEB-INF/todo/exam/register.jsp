<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록 페이지</title>
<style>
* {margin:0;padding:0;}
.register {width:200px;height:100vh;padding:0 0 0 10px;}
.register ul li {margin:5px 0;list-style:none;}
input {width:100%;height:30px;}
button {width:calc(100%/2 - 3px);height:30px;}
</style>

<script>
function reset(){
	document.querySelector('input').value=null;
}
</script>

</head>
<body>
<form action="list" method="post">
	<div class="register">
		<ul>
			<li><input type="text" name="title" placeholder="Title" /></li>
			<li><input type="date" name="date" /></li>
			<li>
				<button type="button" onclick="reset();">RESET</button>
				<button type="submit">REGISTER</button>
			</li>
		</ul>
	</div>
</form>
</body>
</html>