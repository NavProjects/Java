<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Java</title>
</head>
<body>
	<div>
		<h1><c:out value="${language.name}"/></h1>
		<p>Description: <c:out value="${language.name}"/></p>
		<p>Language: <c:out value="${language.creator}"/></p>
		<p>Number of pages: <c:out value="${language.version}"/></p>
		<a href="/languages/${language.id}/edit">Edit Book</a>
		<form action="/languages/${language.id}" method="post">
		    <input type="hidden" name="_method" value="delete">
		    <input type="submit" value="Delete">
		</form>	
		<a href="/languages">Dashboard</a>
	</div>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
</body>
</html>