<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
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
		<h1>Edit Language</h1>
		<form:form action="/languages/${language.id}" method="post" modelAttribute="language">
		    <input type="hidden" name="_method" value="put">
		    <p>
		        <form:label path="name">Name</form:label>
		        <form:errors style="color:red" path="name"/>
		        <form:input path="name"/>
		    </p>
		    <p>
				<form:label path="creator">Creator</form:label>
				<form:errors style="color:red" path="creator" />
				<form:input path="creator" />
			</p>
			<p>
				<form:label path="version">Version</form:label>
				<form:errors style="color:red" path="version" />
				<form:input path="version" />
			</p>
		    <input type="submit" value="Submit"/>
		</form:form>
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