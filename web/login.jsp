<%-- 
    Document   : login
    Created on : 30/03/2023, 10:25:57 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Login</title>
    </head>
    <%
            String Exist_err = (String) session.getAttribute("Exist_err"); 
        %>
    <body>
        <h1>Login</h1>
        
        <!--<form action="welcome_1.jsp" method="post">-->
        <form action="LoginCustomerServlet" method="post">
            <table>
                <tr>
                    <td><label for="email">Email</label></td>
                    <td><input type="text" id="email" name="email"></td>
                </tr>

                <tr>
                    <td><label for ="password">Password</label></td>
                    <td><input type="password" id="password" name="password"></td>
                </tr>
            </table>
            <input class="button" type="submit" value="Login">
        </form>
        <form action="register.jsp" method="post">
            <table>
                <tr>
                    <td><label for="email">Don't have an account register here</label></td>
                    <td><input class="button" type="submit" value="Register"></td>
                </tr>
            </table>          
        </form>
        <span><%= (Exist_err != null ? Exist_err : "")%></span><br>
        <p align="right"><a class="button" href="index.jsp">Home</a></p>
    </body>
</html>
