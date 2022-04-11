<!--Importaciones de biblioteca de etiquetas JSP, configuración, estilo externo -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formato (fechas) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- para errores de renderizado en rutas PUT -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

    <title>Show</title>
</head>
<body>
	<div class="container">
		<h1>
			<c:out value="${dojo.getName() }"></c:out>
		</h1>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ninja" items="${ninjas}">
					<tr>
						<td><c:out value="${ninja.getFirst_name() }" /></td>
						<td><c:out value="${ninja.getLast_name() }" /></td>
						<td><c:out value="${ninja.getAge() }" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/dojos/new" class="btn btn-primary">Agregar Dojo</a>
		<a href="/ninjas/new" class="btn btn-primary">Agregar NInja</a>
	</div>
</body>
</html>