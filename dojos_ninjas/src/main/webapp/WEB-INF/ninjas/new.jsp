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

    <title>New Ninja</title>
</head>
<body>
	<div class="container">
		<h1>Nuevo Ninja</h1>
		<form:form action="/ninjas/create" method="POST" modelAttribute="ninja">
		
			<div class="form-group">
				<form:label path="dojo">Dojo</form:label>
				<form:select path="dojo" class="form-control">
					<c:forEach var="s" items="${lista_dojos}">
						<form:option value="${s.getId()}">${s.getName()}</form:option>
					</c:forEach>
				</form:select>
				
			</div>
			
			
			<div class="form-group">
				<form:label path="first_name">First name: </form:label>
				<form:input path="first_name" class="form-control form-control-sm"/>
				<form:errors path="first_name"/>
			</div>
			
			<div class="form-group">
				<form:label path="last_name">Last name: </form:label>
				<form:input path="last_name" class="form-control form-control-sm"/>
				<form:errors path="last_name"/>
			</div>
			<div class="form-group">
				<form:label path="age">Age</form:label>
				<form:input path="age" cssClass="form-control"/>
				<form:errors path="age"/>
			</div>
			
			
			
			<input type="submit" value="Enviar" class="btn btn-success">
			
		</form:form>
	</div>
</body>
</html>