<%-- 
    Document   : login
    Created on : 5 déc. 2017, 15:34:51
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
        <h1>Formulaire de connexion</h1>
        
        <form method="POST" action="<c:url value="/login" />">
            <input type="text" placeholder="Login" name="login">
            <input type="password" placeholder="mot de passe" name="pass"><br>
            <input type="submit" value="se connecter" name="btn_login">
        </form>
            
        <a href="<c:url value="/register" />">inscription</a>
    </body>
</html>
