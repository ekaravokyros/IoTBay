<%-- 
    Document   : adminlogin
    Created on : 16/05/2023, 11:11:51 PM
    Author     : dsake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Admin Sign In</title>
    </head>
    <body>
        <h1>Admin Sign In</h1>
        <form action="adminmenu.jsp" method="post">
            <table>
                <tr>
                    <td><label for="username1">Username</label></td>
                    <td><input type="text" id="username1" name="username1"></td>
                </tr>
                
                <tr>
                    <td><label for ="password1">Password</label></td>
                    <td><input type="password" id="password1" name="password1"></td>
                </tr>
            </table>
             <input class="button" type="submit" value="Sign In">
             <a class="button" href="index.jsp">Back</a>
        </form>
    </body>
</html>
