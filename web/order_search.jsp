<%-- 
    Document   : order_search
    Created on : 16/05/2023, 3:54:34 PM
    Author     : Dewan Laptop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Order"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <%
                
                Order order = (Order) session.getAttribute("order");
        %>
    <body>
        <h1>Order Page</h1>
        
        
        <!--<form action="SearchServlet" method="post">-->
            <table>
            <tr>
                <td><label for="PRODUCTNAME">Product Name: </td>
                <td><%=order.getPRODUCTNAME()%></td>
                <td></td>
            </tr>
            </table>
        <!--</form>-->
    </body>
</html>
