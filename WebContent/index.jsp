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

	<%-- <a href="Register"> Inscription </a> --%>

	<p>
		<%=new java.util.Date()%></p>


	<c:if test="${login==null}">
		<form action="AllUsers" method="post">
			<p>
				<input type="submit" value="Create random" />
			</p>
		</form>
	</c:if>


</body>
</html>