<%-- 
    Document   : order_management
    Created on : 16/05/2023, 2:15:39 PM
    Author     : Dewan Laptop
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Order"%>
<!--
<%@page contentType="text/html" pageEncoding="UTF-8"%>
--><!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>ORDER</title>
    </head>
    <body onload="startTime(); resetSearch();">
        <div>
            
            <%
                Order order = (Order) session.getAttribute("order");
            %>
        </div>
        <h1> Order Management</h1>
        <table>
            <td><p align="left"><a class="button" href="order_history.jsp">Order History</a></td>
            <td><p align="left"><a class="button" href="main.jsp">Back</a></td>
            
        </table>
        
    </body>
</html>
