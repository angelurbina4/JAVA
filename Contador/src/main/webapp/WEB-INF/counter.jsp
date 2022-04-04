<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Contador: <c:out value="${ counter }"/> </h1>
	<a href="/restart">Reiniciar Contador</a><br>
	<a href="/">Volver al home</a><br>
	<a href="/doublecounter">ver contador doble</a>
</body>
</html>