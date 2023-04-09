<%-- 
    Document   : welcome
    Created on : 30/03/2023, 10:26:19 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Customer"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Welcome</title>
    </head>
    <body>
        
       <%           
            String email = request.getParameter("email");
            String password = request.getParameter("password"); 
            
            if (email.equals("") || password.equals("")){
                %><h1>Error!</h1><%    
                out.println("Sorry, you must enter your email and password." + "<br>");
                out.println("Click below to go back."+ "<br>");               
                %><a class="button" href="login.jsp">Back</a><%            
            }
            else {
                %><h1>Welcome Back!</h1><%
                out.println("Your Email is " + email + "." + "<br>");
                out.println("Your password is " + password + "." + "<br>");  
                out.println("Click below to proceed to the main page." + "<br>");               
                %><a class="button" href="main.jsp">Main</a><%
            }
        %>
        <% 
            Customer customer = new Customer(email, password); 
            session.setAttribute("customer", customer);
        %>
        <p align="right"><a class="button" href="index.jsp">Home</a></p>
    </body>
</html>