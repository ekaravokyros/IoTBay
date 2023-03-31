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
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            Customer customer = (Customer)session.getAttribute("customer");
        %>
        <h1>Main Page</h1>
        <%
            if (customer == null) {
            out.println("Customer is " + customer + "!" + "<br>");
            %><a href="register.jsp">Register</a><br><%
            }
            
            else if (customer != null) {
               %>
                <p align="right">You are logged in as ${customer.fname} ${customer.lname} <${customer.email}><br>
                <p align="right">To logout please click <a href="logout.jsp">here</a><br>    
                <% 
            }
        %>        
        </p>
    </body>
</html>