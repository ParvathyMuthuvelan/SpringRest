<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lavender">
<center>
<h1>Login Page</h1>
</center>
<form action="/submitlogin" method="post" >


UserName<sf:input path="login.userName" type="text" name="userName" /> <br>
Password<sf:input path="login.password" name="password" type="password" />


<br>

<input type="submit" value="Login" name="submit" />
<input type="reset" value="cancel" />

</form>

</body>
</html>