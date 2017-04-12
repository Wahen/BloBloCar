<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BloBlocar</title>
</head>
<body>
	
	<c:import url="/WEB-INF/menu/menu.jsp" />
	
	<p> Create ramdom user </p>
<%-- <a href="Register"> Inscription </a> --%>

<p> <%= new java.util.Date()%></p>
<a href="AllUsers"> Random  </a>

</body>
</html>