<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<div class="container">
		<h1>Fruit Store</h1>
		<table class="table">
			<tbody>
				<tr>
					<th>Name</th>
					<th>Price</th>
				</tr>
				<c:forEach var ="fruit" items="${ fruits }">
				<tr>
					<th><c:out value="${ fruit.getName() }"/><th>
					<th><c:out value="${ fruit.getName() }"/></th>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>