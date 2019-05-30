<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>The Student is confirmed: ${student.firstName}
		${student.lastName}, Country: ${student.country}</h1>
	<br>
	<h2>The favorite languaje from the student is:
		${student.favoriteLanguage}</h2>
	<br>
	<h3>The Operating systems choosen are:</h3>

	<ul>
		<c:forEach var="os" items="${student.operatingSystemsList}">
			<li>${os}</li>
		</c:forEach>
	</ul>


</body>
</html>