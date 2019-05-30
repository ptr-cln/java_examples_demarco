<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>

	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="_menu.jsp"></jsp:include>

	<h3>Lista prodotti</h3>

	<p style="color: red;">${errorString}</p>

	<table border="1" cellpadding="5" cellspacing="1">
		<tr>
			<th>Codice</th>
			<th>Titolo</th>
			<th>Autore</th>
			<th>Prezzo</th>
			<th>Quantità</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>
				<td>${product.id}</td>
				<td>${product.title}</td>
				<td>${product.author}</td>
				<td>${product.price}</td>
				<td>${product.quantity}</td>
			</tr>
		</c:forEach>
	</table>

	<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>