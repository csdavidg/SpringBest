<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Java</h1>
	<br />

	<hr />

	<h4>
		User:
		<security:authentication property="principal.username" />
		<br /> Roles:
		<security:authentication property="principal.authorities" />
	</h4>

	<hr />

	<security:authorize access="hasRole('MANAGER')">

		<a href="${pageContext.request.contextPath}/leaders">LeaderShip
			Meeting</a> (Only for managers)
	<br />
		<hr />
	</security:authorize>
	<security:authorize access="hasRole('ADMIN')">
		<a href="${pageContext.request.contextPath}/systems">Systems
			Meeting</a> (Only for managers)
	<br />
		<hr />
	</security:authorize>

	<form:form action="logout" method="POST">
		<button action="submit">Logout</button>
	</form:form>
</body>
</html>