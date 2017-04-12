<%@ page language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*, model.*"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Users List</title>
	</head>
	<body>
	
		<ul>
		
		<c:forEach var="user" items="${users}" varStatus="stat">
			<li>First name : ${user.value.getFirstName()} 
				Last name : ${user.value.getLastName()} 


		</c:forEach>
		</ul>	
	   
		
	</body>
	
</html>