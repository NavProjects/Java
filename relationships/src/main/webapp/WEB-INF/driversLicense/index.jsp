<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheets" type="text/css" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>New Person</h1>
		<form:form action="/person" method="post" modelAttribute="person">
			<p>
				<form:label path="firstName">First Name</form:label>
				<form:errors style="color:red" path="firstName" />
				<form:input path="firstName" />
			</p>
			<p>
				<form:label path="lastName">Last Name</form:label>
				<form:errors style="color:red" path="lastName" />
				<form:textarea path="lastName" />
			</p>
			<input type="submit" value="Create" />
		</form:form>
	</div>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
</body>
</html>