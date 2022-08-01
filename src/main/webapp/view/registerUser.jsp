<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<style>
.error {
	color: red
}
</style>
</head>
<header>User Form</header>
<form:form action="saveUser" modelAttribute="user" method="Post">
	<table style="border: thick;">
		<tr>
			<td>Name</td>
			<td><form:input path="uname" /></td>
			<td><form:errors path="uname" Class="error"></form:errors>
		<tr>
		<tr>
			<td>Password</td>
			<td><form:password path="pass" /></td>
			<td><form:errors path="pass" Class="error"></form:errors>
		<tr>
		<tr>
			<td>Email</td>
			<td><form:input path="email" /></td>
			<td><form:errors path="email" Class="error"></form:errors>
		<tr>
		<tr>
			<td>Phone No</td>
			<td><form:input path="phoneNo" /></td>
			<td><form:errors path="phoneNo" Class="error"></form:errors>
		<tr>
			<td><input type="submit" value="Register"></td>
			
			<tr>
	</table>
</form:form>
<body>
</body>
</html>