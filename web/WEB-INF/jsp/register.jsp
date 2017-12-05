<%-- 
    Document   : register
    Created on : 5 déc. 2017, 15:35:28
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
        <h1>Formulaire d'enregistrement</h1>
        <h3>${message.message!=null?message.message:""}</h3>
        <form method="POST" action="<c:url value="/register" />">
            <input type="text" placeholder="nom" name="nom"><br>
            <input type="text" placeholder="prenom" name="prenom"><br>
            <input type="text" placeholder="age" name="age"><br>
            <input type="text" placeholder="login" name="login"><br>
            <input type="password" placeholder="mot de passe" name="pass"><br>
            <input type="submit" value="s'inscrire" name="btn_register">
        </form>
            
            <a href="<c:url value="/login" />">connexion</a>
    </body>
</html>
