<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show book</title>
</head>
<body>
	<div class="container">
		<h1> <c:out value="${book.title}"/></h1>
		<p>
			description: <c:out value="${book.description}"/>
		</p>
		<p>
			language: <c:out value="${book.language}"/>
		</p>
		<p>
			numberOfPages: <c:out value="${book.numberOfPages}"/>
		</p>
	</div>
</body>
</html>