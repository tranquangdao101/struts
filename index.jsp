<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<h1>Login Admin</h1>
	<form action="login" method="post" >
	
	<label>Username</label>
	<input type="text" name="username"/>
	<s:fielderror fieldName="username" style="color:red;text-decoration:none;"/>
	<label>Password</label>
	<input type="password" name="password"/>
	<s:fielderror fieldName="password" style="color:red;text-decoration:none;"/>
<button type="submit"> login</button>
</form>

</body>
</html>