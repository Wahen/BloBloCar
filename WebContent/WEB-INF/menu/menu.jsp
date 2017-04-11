<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="menu">

	<c:if test="${login==null}">
	<p><a href="<c:url value="/Register"/>">Créer son profil</a></p>
	<p><a href="<c:url value="/login"/>">Se connecter</a></p>
	<p><a href="<c:url value="/MemberList.jsp"/>">Afficher les utilisateurs</a></p>
    <p><a href="<c:url value="/"/>">Accueil</a></p>
    <c:import url="/GoogleMap.html"/>
    </c:if>
    
    <c:if test="${login!=null}">
    <%-- <script type="text/javascript">var  userLogin=${login}</script>--%>
    <p><a href="<c:url value="/MemberList.jsp"/>">Afficher les utilisateurs</a></p>
    <p><a href="<c:url value="/"/>">Accueil</a></p>
    <c:import url="/GoogleMapUserConnected.html"/>
    </c:if>	
    <%-- <c:if test="${ statusUserConnected }"> --%>
       <%-- <c:import url="/GoogleMapUserConnected.html"/> --%>
</div>
<br/>