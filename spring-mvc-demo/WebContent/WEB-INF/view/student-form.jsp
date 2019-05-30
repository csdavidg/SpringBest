<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		<label>First Name:</label>
		<form:input path="lastName" />
		<br>
		<br>

		<label>Last Name:</label>
		<form:input path="firstName" />
		<br>
		<br>

		<label>Country</label>
		<form:select path="country">
			<form:options items="${student.countries}" />
		</form:select>
		<br>
		<br>

		<form:radiobuttons items="${student.languages}"
			path="favoriteLanguage" />

		<br>
		<br>

		<form:checkboxes items="${student.operatingSystemsHash}"
			path="operatingSystemsList" />

		<br>
		<br>

		<form:button action="submit">Send</form:button>
	</form:form>
</body>
</html>