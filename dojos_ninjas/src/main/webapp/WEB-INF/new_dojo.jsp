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

    <title>Tacos</title>
</head>
<body>
	<div class="container">
		<h1>Nuevo Dojo</h1>
		
		<form:form action="/dojos/create" method="post" modelAttribute="dojo">
			
			<div class="form-group">
				<form:label path="name">Name: </form:label>
				<form:input path="name" class="form-control"/>
				<form:errors path="name" class="text text-danger"/>
			</div>
			<input type="submit" value="Guardar" class="btn btn-success">
		</form:form>
	</div>
</body>
</html>