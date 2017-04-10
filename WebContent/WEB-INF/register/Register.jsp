<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>

	<h2>Register</h2>

	<form action="Register" method="post">

		<p>First name : <input type="text" name="firstName"placeholder="first name" maxlength="30"></p>
		
		<p>Last name : <input type="text" name="lastName" placeholder="last name" maxlength="30"></p>
		
		<p>Email : <input type="email" name="email" placeholder="email" maxlength="60"></p>
		
		<p>Password: <input type="password" id="pwd1" name="pwd1" placeholder="pwd" maxlength="20"></p>
		
		<p>PwdConfirm : <input type="password" id="pwdConfirm" name="pwdConfirm" placeholder="pwd" maxlength="20"></p>
	
		<p>Address : <input type="text" name="address" placeholder="address"></p>

		<p><input type="submit" value="Save new User" /></p>

	</form>

</body>
</html>