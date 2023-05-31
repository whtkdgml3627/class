<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-22
  Time: 오후 2:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
	<script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU=" crossorigin="anonymous"></script>
	<script>
		$(function(){
			$('#regForm').submit(function(){
                if(!$('#idChk').prop('checked')){
                    alert('아이디 중복 체크는 필수 입니다.');
                    //$('#uid').focus()
                    // 입력 폼 초기화
                    $('#uid').val('')
                    // checkbox => checked => false
                    $('#idchk').prop('checked', false)
                    // 메시지 초기화
                    $('#chkMsg').text('').removeClass('check_not').removeClass('check_ok')
                    return false;
                }
			});

            $('#uid').on('focusout',function(){
                // 공백 여부 체크
                if($(this).val().trim().length < 1){
                    $('#chkMsg').text('아이디는 필수 항목입니다.').addClass('check_not');
                    return false;
                }

                // 비동기 통신
                $.ajax({
	                url: 'idcheck', // /member/idcheck
	                data: {
                        uid : $(this).val()
	                },
	                success: function(data){
                        // alert(data);
		                if(data == 'Y'){
                            $('#chkMsg').text('사용 가능한 아이디 입니다.').addClass('check_ok').removeClass('check_not');
                            $('#idChk').prop('checked',true);
		                }else {
                            $('#chkMsg').text('사용 불가능 아이디 입니다.').addClass('check_not').removeClass('check_ok');
                            $('#idChk').prop('checked',false);
		                }
	                }
                });
            });

            $('#uid').on('focusin',function(){
                // 입력 폼 초기화
                $(this).val('');
                // checkbox -> checked -> false
	            $('#idChk').prop('checked',false);
                // 메시지 초기화
	            $('#chkMsg').text('').removeClass('check_not').removeClass('check_ok');
            });
		});
	</script>
	<style>
		.check_not {color:red;}
		.check_ok {color:blue;}
		#idChk {display:none;}
	</style>
</head>
<body>
<h1>회원 가입</h1>
<hr>
<form id="regForm" method="post" enctype="multipart/form-data">
	<table border="1">
		<tbody>
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" name="uid" id="uid" required>
					<span id="chkMsg"></span>
					<input type="checkbox" id="idChk">
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pw" id="pw"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="uname" id="uname"></td>
			</tr>
			<tr>
				<th>사진</th>
				<td>
					<input type="file" name="uphoto">
				</td>
			</tr>
			<tr>
				<th></th>
				<td>
					<input type="reset">
					<input type="submit" value="가입">
				</td>
			</tr>
		</tbody>
	</table>
</form>


</body>
</html>
