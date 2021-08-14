<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Languages</title>
</head>
<body>
	<div>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${languages}" var="lang">
					<tr>
						<td><a href="/languages/${ lang.id }/detail"><c:out value="${lang.name}" /></a></td>
						<td><c:out value="${lang.creator}" /></td>
						<td><c:out value="${lang.version}" /></td>
						<td><a href="/languages/${lang.id}/edit">edit</a>
							<form action="/languages/${lang.id}" method="post">
								<input type="hidden" name="_method" value="delete"> 
								<input type="submit" value="Delete">
							</form></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<form:form action="/new/languages" method="post"
			modelAttribute="language">
			<p>
				<form:label path="name">Name</form:label>
				<form:errors style="color:red" path="name" />
				<form:input path="name" />
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
			<input type="submit" value="Submit" />
		</form:form>
	</div>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
</body>
</html>