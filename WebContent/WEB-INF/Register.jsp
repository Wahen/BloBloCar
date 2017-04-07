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

		<p>
			First name : <input type="text" name="firstName"
				placeholder="first name">
		</p>
		<p>
			Last name : <input type="text" name="lastName"
				placeholder="last name">
		</p>
		<p>
			Email : <input type="email" name="email" placeholder="email">
		</p>
		<p>
			Pwd : <input type="password" name="pwd" placeholder="pwd">
		</p>
		
		<p>
			PwdConfirm : <input type="password" name="pwdConfirm" placeholder="pwd">
		</p>
		
		
		<p>
			Address :<input type="text" names="address" placeholder="address">
		</p>




		<p>
			<input type="submit" value="Save new User" />
		</p>

		

	</form>
	

</body>
</html>