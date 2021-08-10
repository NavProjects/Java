<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form method="POST" action="/login">
		<label>Your Name: <input type="text" name="name"></label>
		<label> Dojo Location:
			<select name="location">
				<option selected value="Los Angeles">Los Angeles</option>
				<option value="San Jose">San Jose</option>
			</select>
		</label>
		<label> Favorite Language:
			<select name="favlang">
				<option selected value="Python">Python</option>
				<option  value="Java">Java</option>
			</select>
		</label>
		<label>Comment: <textarea name="comment" rows="2" cols="30"></textarea></label>
		<button>Button</button>
		</form>
	</div>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
</body>
</html>