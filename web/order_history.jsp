<%-- 
    Document   : order_history
    Created on : 16/05/2023, 3:55:06 PM
    Author     : Dewan Laptop
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Order"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Order History</title>
    </head>
    <body action="SearchServlet">
        <%
            ArrayList<Order> orders = (ArrayList<Order>) session.getAttribute("orders");
            String display = (String) session.getAttribute("display");
        %>
        <h1>Order History</h1>
        <p align="left"><a class="button" href="order_management.jsp">Back</a>
        <table>
                <tr>
                    <th><b>Order ID</b></th>  
                    <th><b>Product Name</b></th>  
                    <th><b>Product ID</b></th>        
                    <th><b>Price</b></th>  
                </tr>
               <%
                   if (orders != null) {
                    for (Order o: orders){
               %>
                <tr>
                    <th><b><%=o.getORDERID()%></b></th>  
                    <th><b><%=o.getPRODUCTNAME()%></b></th>  
                    <th><b><%=o.getPRODUCT_ID()%></b></th>        
                    <th><b><%=o.getPRICE()%></b></th>  
                </tr>
                <% } %>
        </table>
   
        <br>
        <% } else { %>
        <span><= (display != null ? display : "")%></span>
        <% } %>
        <form method="post" action="SearchServlet">
            <table>
                <td><input type="text" placeholder="Enter Order ID" name="ORDERID"><input class="button" type="submit" value="Search" required="true"></td>
            </table>
        </form>
         </body>    
            
        </html>