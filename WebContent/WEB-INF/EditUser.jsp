<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Edit</title>
</head>
<body>
<h2>Update User</h2>

<form action="EditUser" method="post">
<p>First name : <input type="text" name="firstname" value="${user.getFirstName()}"></p>
<p>Last name : <input type="text" name="lastname" value="${user.getLastName()}"></p>
<p>Email : <input type="email" name="email" value="${user.getEmail()}"></p>
<p>pwd : <input type="password" name="pwd" placeholder="pwd"> </p>
<p>Address: <input type="text" name="address" value= "${user.getAddress()}"> </p>

<p><input type="submit" value="Save User"/></p>


</form>

</body>
</html>