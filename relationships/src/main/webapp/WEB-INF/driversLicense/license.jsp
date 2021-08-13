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
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>New License</h1>
		<form:form action="/license" method="post" modelAttribute="license">	
			<select name="person">
                <c:forEach items="${persons}" var="person">
                    <option value="${person.id}"><c:out value="${person.firstName}"/><c:out value="${person.lastName}"/></option>
                </c:forEach>
            </select>
			<p>
				<form:label path="state">State:</form:label>
				<form:errors style="color:red" path="state" />
				<form:input path="state" />
			</p>
			<p>
				<form:label path="expirationDate">Expiration Date (mm/dd/yyyy)</form:label>
				<form:errors style="color:red" path="expirationDate" />
				<form:input path="expirationDate" />
			</p>
			<input type="submit" value="Create" />
		</form:form>
	</div>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
</body>
</html>