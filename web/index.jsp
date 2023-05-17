<%-- 
    Document   : interface
    Created on : 30/03/2023, 10:25:46 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>IoTBay</title>
    </head>
    <body>
        <h1>Welcome to IoTBay</h1>
        <h2>The one-stop-shop for all your IoT Device Needs</h2>
        <table>
            <td><a class="button" href="login.jsp">Login</a></td>
            <td><a class="button" href="register.jsp">Register</a></td>
            <td><a class="button" href="store.jsp">Store</a></td>
            <td><a class="button" href="adminlogin.jsp">Admin</a></td>
        </table>
        <jsp:include page="/ConnServlet" flush="true" />
    </body>
</html>
