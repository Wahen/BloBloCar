<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
var liste = [{
	<c:forEach items="${ sessionScope.users }" var="mapUsers"
		varStatus="boucle">{
		nom: ${ mapUsers.firstName},
		prenom: ${ mapUsers.lastName},
		perimetre: ${ mapUsers.mobilityDriver},
		mail: ${ mapUsers.mail},
		adresse: ${ "mapUsers.address_ville"+", "+"mapUsers.address_nbrue"+", "+"mapUsers.address_rue"}
		}
	</c:forEach>
];
</script>
</body>
</html>