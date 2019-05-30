<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="customer">
		<label>First Name</label>
		<form:input path="firstName" />
		<br>
		<label>Last Name *</label>
		<form:input path="lastName" />
		<form:errors path="lastName" />
		<br>
		<label>Passes *</label>
		<form:input path="freePasses" />
		<form:errors path="freePasses" />
		<br>
		<label>Postal Code</label>
		<form:input path="postalCode" />
		<form:errors path="postalCode" />
		<br>
		<label>Course Code</label>
		<form:input path="courseCode" />
		<form:errors path="courseCode" />
		<br>
		<form:button action="submit">Send</form:button>

	</form:form>

</body>
</html>