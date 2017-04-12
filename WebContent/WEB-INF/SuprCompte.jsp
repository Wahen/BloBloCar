<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Suppr mon compte :(</title>
</head>
<body>
<form method="post" action="SuprCompte">
    <fieldset>
        <legend>Supr</legend>
        <p>Entrer votre mail et mdp pour delete votre compte</p>

        <label for="nom">Adresse email <span class="requis">*</span></label>
        <input type="email" name="mail" value="${form.mail}" size="20" maxlength="60"/>
        <span class="erreur">${error['email']}</span>
        <br/>

        <label for="motdepasse">Mot de passe <span class="requis">*</span></label>
        <input type="password" name="pwd" value="" size="20" maxlength="20"/>
        <span class="erreur">${error['motdepasse']}</span>
        <br/>

        <input type="submit" value="Nonnnnnnnnnnn stp" class="sansLabel"/>
        <br/>
        
        <p class="${statusOK ? 'succes' : 'erreur'}">${statusMessage}</p>
    </fieldset>
</form>
</body>
</html>