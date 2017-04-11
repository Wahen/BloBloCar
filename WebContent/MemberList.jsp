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
                <tr>
                    <th>Nom</th>
                </tr>
                <c:forEach items="${ sessionScope.users }" var="mapUsers" varStatus="boucle">
                    <td>${ mapUsers.firstName } 
                    <p>   ......  </p> 
                 	<a href="EditUser">Edit</a>
                    
                     
                </c:forEach>
            </table>
            
            </c:otherwise>
        </c:choose>
</fieldset>
</body>
</html>