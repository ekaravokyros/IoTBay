<%-- 
    Document   : main
    Created on : 30/03/2023, 10:21:06 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Customer"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Main Page</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            Customer customer = (Customer)session.getAttribute("customer");
        %>
        <h1>Main Page</h1>
        <%
            if (customer == null) {
            %><a class="button" href="register.jsp">Register</a><br><%
            }
            
            else if (customer != null) {
                %> 
                <p align="right">You are logged in as ${customer.fname} ${customer.lname} (${customer.email}) <br>
                <p align="right"><a class="button" href="logout.jsp">Logout</a><br>
                <p align="right"><a class="button" href="index.jsp">Home</a></p>
                <p align="left"><a class="button" href="account.jsp">My Account</a><br>
                <% 
            }
        %>        
        </p>
    </body>
</html>