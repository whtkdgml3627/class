<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-19
  Time: 오전 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>게시글 상세</title>
	<script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU=" crossorigin="anonymous"></script>
	<style>
        table {border:1px solid black;}
        th, td {padding:15px;border:1px solid black;}
        img {max-width:300px;}
	</style>
	<script>
		$(function(){
			$('#replyRegForm').on('submit',function(){

                if($('#reply').val().trim().length<1){
	                alert('댓글 내용을 입력해주세요.');
                    return false;
                }

                // 서버로 보낼 객체 -> JSON
                const payload = {
                    bno : $('#bno').val(),
	                memidx : $('#midx').val(),
	                reply : $('#reply').val()
                }

                // 비동기 통신
				$.ajax({
					url: 'reply', // /board/read
					type: 'post',
					contentType: 'application/json',
					data: JSON.stringify(payload),
					dataType: 'json',
					success: function(data){
						//console.log(data);

                        const reply = data;
                        // 화면에 동적으로 HTML 생성 추가
						let html = '';
							html += '<td>'+reply.memidx+'</td>';
							html += '<td>'+reply.reply+'</td>';
							html += '<td>'+reply.replyDate+'</td>';
                            html += '<td><a href="javascript:delTr('+reply.rno+')">삭제</a></td>';

						const newTr = $('<tr></tr>').attr('tr-index', reply.rno).html(html);
                        // List 영역에 tr 추가
                        $('#replyList').append(newTr);
                        $('#reply').val('');
					}
				});

                return false;
			});
		});

        function delTr(index){
            // 비동기 요청 처리
            $.ajax({
		        url: 'reply/'+index,
		        type: 'delete',
		        success: function(data){
                    // tr 삭제
                    $('tr[tr-index="'+index+'"]').remove();
		        }
	        });

            /*let idx = $('#replyList tr').attr('tr-index');
            if(index == idx){
                $('tr[tr-index="'+index+'"]').remove();
            }*/
        }
	</script>
</head>
<body>
<div class="wrap">
	<h1>게시글 상세</h1>
	<hr>
	<div>
		${loginInfo}
	</div>
	<hr>
	<table>
		<tbody>
			<tr>
				<th>게시글 번호 : </th>
				<td>${article.bno}</td>
			</tr>
			<tr>
				<th>제목 : </th>
				<td>${article.title}</td>
			</tr>
			<tr>
				<th>내용 : </th>
				<td>${article.content}</td>
			</tr>
			<tr>
				<th>작성자 : </th>
				<td>${article.writer}</td>
			</tr>
			<c:if test="${article.file ne null}">
			<tr>
				<th>첨부파일<br>(이미지) : </th>
				<td><img src="/uploadfile/board/${article.file}" alt="${article.file}"></td>
			</tr>
			</c:if>
			<tr>
				<th>등록일 : </th>
				<td>${article.regdate}</td>
			</tr>
			<tr>
				<th>수정일 : </th>
				<td>${article.updatedate}</td>
			</tr>
		</tbody>
	</table>

	<hr>
	<div id="replyArea">
		<h3>댓글</h3>
		<hr>
		<div>
			<form id="replyRegForm">
				<input type="text" id="bno" value="${article.bno}">
				<input type="text" id="midx" value="${loginInfo.idx}">
				<input type="text" id="reply" required>
				<input type="submit">
			</form>
		</div>

		<%-- 댓글의 리스트 --%>
		<table>
			<tbody id="replyList"></tbody>
		</table>
	</div>
	<hr>

	<br>
	<a href="/board/list">리스트</a>
	<a href="/board/modify?bno=${article.bno}">수정</a>
	<a href="/board/delete?bno=${article.bno}">삭제</a>

</div>
</body>
</html>
