<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오후 4:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Order</title>
</head>
<body>

	<h1>주문내역</h1>

	<ul>
		<c:forEach var="orderItem" items="${order.orderItems}" varStatus="stat">
			<li>
				<h3>상품${stat.count}</h3>
				ID - ${orderItem.itemId}<br>
				개수 - ${orderItem.number}<br>
				주의사항 - ${orderItem.remark}
			</li>
		</c:forEach>
	</ul>

</body>
</html>
