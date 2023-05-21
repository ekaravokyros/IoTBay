<%-- 
    Document   : user_search
    Created on : 17/05/2023, 7:55:17 AM
    Author     : dsake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Search Users</title>
    </head>
    <%String result = (String)session.getAttribute("result");%>
    <body>
        <h1>Search Users</h1>
        <form action="UserSearchServlet" method="post"> 
            <label for="customer_firstname">Username: </td> 
            <input type="text" id="customer_firstname" name="customer_firstname"></td> 
            <input type="submit" value="Search User">
        </form>
        <span class ="message"><%=(result != null ? result : "")%></span>
        <p align="left"><a class="button" href="user_manage.jsp">User Management</a></p>
    </body>
</html>
