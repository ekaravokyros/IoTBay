<%-- 
    Document   : product_delconfirm
    Created on : 10/05/2023, 12:41:11 PM
    Author     : NICHOLAS SMITH 11378054
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Result</title>
    </head>
        <%
            String confirm_msg = (String) session.getAttribute("confirm_msg"); 
        %>
    <body>
        <h1>Result</h1>
        <span><%= (confirm_msg)%></span><br>
    <form action="ProductManageServlet" method="post">
        <input type="hidden" name="action" value="Product Management">
        <p align="left"><button class="button" type="submit">Product Management</button></p>
    </form>
    </body>
</html>
