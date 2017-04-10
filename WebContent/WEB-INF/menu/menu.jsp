<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="menu">
	<p><a href="<c:url value="/Register"/>">Créer son profil</a></p>
	<p><a href="<c:url value="/login"/>">Se connecter</a></p>
	<p><a href="<c:url value="/MemberList.jsp"/>">Afficher les utilisateurs</a></p>
    <p><a href="<c:url value="/"/>">Accueil</a></p>
    
    <%-- <c:if test="${ statusUserDisconnected }"> --%>
    	<c:import url="/GoogleMap.html"/>
    <%-- <c:if test="${ statusUserConnected }"> --%>
       <%-- <c:import url="/GoogleMapUserConnected.html"/> --%>
</div>
<br/>