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
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <h1>Registration</h1>
        <form action="welcome.jsp" method="post">
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
            <input type="submit" value="Login">
        </form>
        <form action="register.jsp" method="post">
            <table>
                <tr>
                    <td><label for="email">Don't have an account register here</label></td>
                    <td><input type="submit" value="Register"></td>
                </tr>
            </table>          
        </form>
    </body>
</html>
