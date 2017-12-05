<%-- 
    Document   : index
    Created on : 5 déc. 2017, 15:35:06
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
        <h3>${message.message!=null?message.message:""}</h3>
        <table border="1">
            <thead>
            <td>Nom</td>
            <td>Prenom</td>
            <td>Age</td>
            <td>Login</td>

        </thead>
        <tbody>

            <c:forEach items="${user.allUsers()}" var="userLis">
                <tr>
                    <td>${userLis.nom}</td>
                    <td>${userLis.prenom}</td>
                    <td>${userLis.age}</td>
                    <td>${userLis.login}</td>
                </tr>
            </c:forEach>

        </tbody>
    </table>
    <a href="<c:url value="/profil" />">profile</a>


</body>
</html>
