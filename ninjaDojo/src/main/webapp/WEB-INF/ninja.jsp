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
	<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Create Ninja</title>
</head>
<body>
	<div class="container">
		<a href="/">Dashboard</a>
		<h1>New Ninja</h1>
		
		<form:form action="/ninjas" method="post" modelAttribute="ninja">
			<p>
				<form:label path="dojo">Select your dojo</form:label>
				<form:errors path="dojo"/>
				<form:select path="dojo">
					<option value="" disabled selected>
					
					<c:forEach items="${doa}" var="doj" >
						<form:option value="${doj.id }">
							${doj.name }
						</form:option>
					</c:forEach>
				</form:select>
			</p>
			<p>
				First Name:
				<form:errors path="firstName"/>
				<form:input path="firstName"/>
			</p>
			<p>
				Last Name:
				<form:errors path="lastName"/>
				<form:input path="lastName"/>
			</p>
			<p>
				Age:
				<form:errors path="age"/>
				<form:input type="number" path="age"/>
			</p>
			<input type="submit" value="Create"/>
			
		</form:form>

	</div>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
</body>
</html>