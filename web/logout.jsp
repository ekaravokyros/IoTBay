<%-- 
    Document   : logout
    Created on : 30/03/2023, 10:22:37 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Customer"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Logout</title>
    </head>
    <body>
        <p1>You have been logged out. Click <a href="index.jsp">here</a> to return to the home page.</p1>
        <% session.invalidate(); %>
    </body>
</html>
