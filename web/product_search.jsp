<%-- 
    Document   : product_search
    Created on : 07/05/2023, 1:41:30 PM
    Author     : NICHOLAS SMITH 11378054
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Search Products</title>
    </head>
        <%
            String result = (String) session.getAttribute("result");
        %>
    <body>
        <h1>Search Products</h1>
        <form action ="ProductSearchServlet" method="post">
                <label for="product_name">Product Name: </td>
                <input type="text" id="product_name" name="product_name"></td> 
                <input type="submit" value="Search Product">
        </form>
        <span class ="message"><%=(result != null ? result : "")%></span>
        <p align="left"><a class="button" href="product_manage.jsp">Product Management</a></p>
    </body>
</html>

