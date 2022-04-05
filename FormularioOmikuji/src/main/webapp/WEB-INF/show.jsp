<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Omikuji</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container text-center">
		<h1>Here's your Omikuji!</h1>
		<div class="col-2 text-center container" style="background-color: lightblue; border: 2px solid black; border-radius: 4px;">
			<p class="content">
				In <span><c:out value="${ number_session }"/></span> years, you will
				live in <span><c:out value="${ city_name_session }"/></span> with 
				<span><c:out value="${ real_person_session }"/></span> as your
				roommate, <span><c:out value="${ endeavor_hobby_session }"/></span> for a living.
				The next time you 
				see a <span><c:out value="${ living_thing_session }"/></span>, you will
				have good luck. Also, <span><c:out value="${ nice_someone_session }"/></span>
			</p>
		</div>
	</div>
</body>
</html>