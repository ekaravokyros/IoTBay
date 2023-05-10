<%-- 
    Document   : product_delconfirm
    Created on : 10/05/2023, 12:41:11 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Delete</title>
    </head>
        <%
            String msg_delete = (String) session.getAttribute("msg_delete"); 
        %>
    <body>
        <h1>Delete Results</h1>
        <span><%= (msg_delete)%></span><br>
        <a class="button" href="product_manage.jsp">Product Management</a>
    </body>
</html>
