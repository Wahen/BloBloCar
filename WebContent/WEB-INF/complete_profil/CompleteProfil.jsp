<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire Conducteur/Passag�</title>
</head>
<body>
<h2>Formulaire Conducteur/Passag�</h2>
<form action="Register" method="post">
<p><input type="radio" name="gender" value="Homme">Homme  <input type="radio" name="gender" value="Femme">Femme  <input type="radio" name="gender" value="Autre">Autre  </p>
<p><input type="radio" name="smoker" value="Fumeur">Fumeur  <input type="radio" name="smoker" value="NonFumeur">Non Fumeur</p>
<p>Num�ro de t�l�phone : <input type="text" name="phone" value="phone"></p>
<h2>Formulaire Conducteur</h2>
<p>Nombre de places du v�hicule : <input type="number" name="nbPlace" min="1" max="10"></p>
<p>D�tour maximum : <input type="number" name="mobilityDriver" min="1" max="5">km</p>
<p>Accepte les fumeurs : <input type="radio" name="acceptSmokerDriver" value="Oui">Oui  <input type="radio" name="acceptSmokerDriver" value="Non">Non  <input type="radio" name="acceptSmokerDriver" value="Indiff�rant">Indiff�rent</p>
<h2>Formulaire Passag�</h2>
<p>D�tour maximum : <input type="number" name="mobilityPassenger" min="1" max="5">km</p>
<p>Voiture fumeurs : <input type="radio" name="acceptSmokerPassenger" value="Oui">Oui  <input type="radio" name="acceptSmokerPassenger" value="Non">Non  <input type="radio" name="acceptSmokerPassenger" value="Indiff�rant">Indiff�rent</p>


<p><input type="submit" value="Save User"/></p>
</form>

</body>
</html>