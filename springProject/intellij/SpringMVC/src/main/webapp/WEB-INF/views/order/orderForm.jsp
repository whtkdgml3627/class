<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오후 3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Order Form</title>
</head>
<body>

	<h1>주문</h1>
	<hr>
	<form method="post">
		<h3>상품 1</h3>
		ID - <input type="text" name="orderItems[0].itemId"><br> <%-- setItemId(사용자 입력 파라미터 데이터) --%>
		개수 - <input type="number" name="orderItems[0].number"><br> <%-- setNumber(사용자 입력 파라미터 데이터) --%>
		주의 - <input type="text" name="orderItems[0].remark"><br> <%-- setRemark(사용자 입력 파라미터 데이터) --%>

		<h3>상품 2</h3>
		ID - <input type="text" name="orderItems[1].itemId"><br> <%-- setItemId(사용자 입력 파라미터 데이터) --%>
		개수 - <input type="number" name="orderItems[1].number"><br> <%-- setNumber(사용자 입력 파라미터 데이터) --%>
		주의 - <input type="text" name="orderItems[1].remark"><br> <%-- setRemark(사용자 입력 파라미터 데이터) --%>

		<h3>상품 3</h3>
		ID - <input type="text" name="orderItems[2].itemId"><br> <%-- setItemId(사용자 입력 파라미터 데이터) --%>
		개수 - <input type="number" name="orderItems[2].number"><br> <%-- setNumber(사용자 입력 파라미터 데이터) --%>
		주의 - <input type="text" name="orderItems[2].remark"><br> <%-- setRemark(사용자 입력 파라미터 데이터) --%>

		<h3>배송지 주소</h3>
		우편번호 : <input type="text" name="address.zipcode"><br> <%--setZipcode(사용자 입력 파라미터 데이터--%>
		기본주소 : <input type="text" name="address.address1"><br> <%--setAddress1(사용자 입력 파라미터 데이터--%>
		상세주소 : <input type="text" name="address.address2"><br> <%--setAddress2(사용자 입력 파라미터 데이터--%>
		<br>
		<input type="submit" value="전송">

	</form>

</body>
</html>
