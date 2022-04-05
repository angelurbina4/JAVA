<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>omikuji</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<div class="container d-flex justify-content-center text-center">
        <div class="col-6">
            <h2>Send an Omikuji!</h2>
            <div class="container col-6 justify-content-center text-center">
                <form action="/fortune" method="post" enctype="multipart/form-data">
                    <div class="form-group mb-3">
                        <label for="number">Pick any number from 5 to 25</label>
                        <input type="number" name="number" placeholder="5" step="1" min="5" max="25">
                    </div>
                    
                    <div class="form-group mb-3">
                        <label for="city_name">Enter the name of any city</label>
                        <input type="text" name="city_name" id="city_name" class="form-control">
                    </div>
                    
                    <div class="form-group mb-3">
                        <label for="real_person">Enter the name of any real person</label>
                        <input type="text" name="real_person" id="real_person" class="form-control">
                    </div>
                    
                    <div class="form-group mb-3">
                        <label for="endeavor_hobby">Enter professional endeavor or hobby</label>
                        <input type="text" name="endeavor_hobby" id="endeavor_hobby" class="form-control">
                    </div>
                    
                    <div class="form-group mb-3">
                        <label for="living_thing">Enter any type of living thing.</label>
                        <input type="text" name="living_thing" id="living_thing" class="form-control">
                    </div>
                    <div class="form-group mb-3">
                        <label for="nice_someone">Say something nice to someone</label>
                        <input type="text" name="nice_someone" id="nice_someone" class="form-control">
                    </div>
                    <br>
                    <h5>Send and show a friend</h5>
                    
                    <input type="submit" value="Send" class="btn btn-primary mb-3">
                </form>
            </div>
        </div>
    </div>
	</div>
</body>
</html>