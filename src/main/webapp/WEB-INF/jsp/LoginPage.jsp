<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="lavender">

	<form:form action="loginValidate" method="POST" modelAttribute="user">
		<table >
			<tr>
				<td><form:label path="userName">UserName:</form:label></td>
				<td><form:input type="text" name="userName" path="userName"/></td>
				
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input type="password" name="password" 	path="password"  /></td>
				
			</tr>
			</table>
			<input type="submit" value="Login" name="submit" />
			</form:form>
</body>
</html>