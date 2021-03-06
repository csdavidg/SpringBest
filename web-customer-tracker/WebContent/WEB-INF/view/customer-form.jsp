<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Save Customer</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<form:form action="saveCustomer" modelAttribute="customer"
				method="POST">

				<form:hidden path="id" />

				<table>
					<tr>
						<td><label>First Name:</label></td>
						<td><form:input type="text" path="firstName" /></td>
					</tr>
					<tr>
						<td><label>Last Name:</label></td>
						<td><form:input type="text" path="lastName" /></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><form:input type="text" path="email" /></td>
					</tr>

				</table>

				<form:button action="submit" class="add-button save">Save</form:button>
			</form:form>

			<br /> <a href="${pageContext.request.contextPath}/customer/list">
				Back to List</a>
		</div>
	</div>
</body>
</html>