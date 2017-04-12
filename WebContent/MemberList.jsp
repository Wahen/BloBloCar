<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tous les membres</title>
</head>
<body>
	<fieldset>
		<c:choose>
			<%-- Si aucun client n'existe en session, affichage d'un message par défaut. --%>
			<c:when test="${ empty sessionScope.users }">
				<p class="erreur">Aucun utilisateur enregistré</p>
			</c:when>
			<%-- Sinon, affichage du tableau. --%>
			<c:otherwise>
				<table>

					<c:forEach items="${ sessionScope.users }" var="Users"
						varStatus="boucle">

						<td>	Nom: ${ Users.firstName} 
								Prenom: ${ Users.lastName}
								mail: ${ Users.mail} 
								mdp : ${Users.pwd }
								adresse: ${ Users.address_ville} ${ Users.address_nbrue} ${ Users.address_rue}
								id : ${Users.getId() }

						</td>

						<a href="EditUser">Edit</a>

					</c:forEach>
				</table>
			</c:otherwise>
		</c:choose>
	</fieldset>
</body>
</html>