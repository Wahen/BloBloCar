<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="menu">

	<c:if test="${login==null}">
	<p>Bienvenue sur BloBloCar</p>
	<p><a href="<c:url value="/login"/>">Se connecter</a></p>
	<p><a href="<c:url value="/Register"/>">S'inscrire</a></p>
	<p><a href="<c:url value="/MemberList.jsp"/>">Afficher les utilisateurs</a></p>
    <p><a href="<c:url value="/"/>">Accueil</a></p>
    <c:import url="/GoogleMap.html"/>
    </c:if>
    
    <c:if test="${login!= null}">
    <p>ReBonjour sur BloBloCar</p>
    <%-- <script type="text/javascript">var  userLogin=${login}</script>--%>
    <p><a href="<c:url value="/MemberList.jsp"/>">Afficher les utilisateurs</a></p>
    <p><a href="<c:url value="/"/>">Accueil</a></p>
    <p><a href="<c:url value="/CompleteProfil"/>">Mon profil</a></p>
    <p><a href="<c:url value="/Logout"/>">Déconnexion</a></p>
    <c:import url="/GoogleMapUserConnected.html"/>
    </c:if>	
    <%-- <c:if test="${ statusUserConnected }"> --%>
       <%-- <c:import url="/GoogleMapUserConnected.html"/> --%>
</div>
<br/>