<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color: lavender">
	<h1>
		<center>Form Validation</center>
	</h1>
	<form:form action="submitUser" method="POST" modelAttribute="user">
		<table align="center">
			<tr>
				<td><form:label path="name">UserName:</form:label></td>
				<td><form:input type="text" name="name" path="name"
						id="userName" /></td>
				<td><form:errors path="name"></form:errors>
			</tr>
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input type="text" name="age"
						path="age" id="age" /></td>
				<td><form:errors path="age"></form:errors>
			</tr>
		<tr>
				<td><form:label path="gender">Gender</form:label></td>
				<td><form:select name="gender" items="${genderList}"
						path="gender" id="gender" />
						
						</td>
			
			</tr>
			
			<tr>
				<td><input type="submit" name="submit" id="submit"
					value="Register"></td>
				<td><input type="reset" name="clear" value="Cancel" id="clear" /></td>
			</tr>
		</table>
	</form:form>


</body>
</html>
