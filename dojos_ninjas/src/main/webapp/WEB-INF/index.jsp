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

    <title>Index</title>
</head>
<body>
	<div class="container">
		<h1>Bienvenido!</h1>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Dojo</th>
				</tr>
			</thead>
			<tbody>
				
				<c:forEach var="dojo" items="${lista_dojos}">
					<tr>
						<td><a href="/dojos/${dojo.getId()}"><c:out value="${dojo.getName()}" /></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/dojos/new" class="btn btn-primary">Agregar Dojo</a>
		<a href="/ninjas/new" class="btn btn-primary">Agregar NInja</a>
	 </div>
</body>
</html>