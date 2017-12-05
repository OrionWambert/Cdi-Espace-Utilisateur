<%-- 
    Document   : profil
    Created on : 5 déc. 2017, 15:35:14
    Author     : HP Notebook
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mon Profile</h1>
        Nom: ${sessionUser.utilisateur.nom}<br>
        Prenom: ${sessionUser.utilisateur.prenom}<br>
        Age:${sessionUser.utilisateur.age}<br>
        Login:${sessionUser.utilisateur.login}<br>
       
    </body>
    
    <a href="<c:url value="/index" />">accueil</a>
</html>
