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
		<p>Your Gold:</p>
		<p style="border: 1px solid black" name="myGold" >
		<c:out value="${myGold}"></c:out>
		</p>
		<div>
			<form method="POST" action="/farm">
				<h3>Farm</h3>
				<p>(earns 10-20 gold)</p>
				<button>Find Gold!</button>
			</form>
			<form method="POST" action="/cave">
				<h3>Cave</h3>
				<p>(earns 5-10 gold)</p>
				<button>Find Gold!</button>
			</form>
				<form method="POST" action="/house">
				<h3>House</h3>
				<p>(earns 2-5 gold)</p>
				<button>Find Gold!</button>
			</form>
			<form method="POST" action="/casino">
				<h3>Casino!</h3>
				<p>(earns/takes 0-50 gold)</p>
				<button>Find Gold!</button>
			</form>
		</div>
		<h3>Activities:</h3>
		<div class="contain">
			<c:forEach  var="activity" items="${activity}">
				<c:out value="${activity}" />
				<br/>
			</c:forEach>
		</div>
		<a href="/reset">RESET GOLD</a>
		
	</div>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
</body>
</html>