<%-- 
    Document   : user_options
    Created on : 17/05/2023, 12:43:41 PM
    Author     : dsake
--%>
<%@page import="Model.Customer"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            Customer customer = (Customer) session.getAttribute("customer");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>User Options</title>
    </head>
    <body>
        <h1>User Management Options</h1>
        <p align="left">
        <a class="button" href="user_update.jsp">Update User</a>
        <a class="button" href="user_delete.jsp">Delete User</a>
        </p>
        
        <table>
            <td><label for="customer_firstname">Customer First Name: </td>
            <td> <%=customer.getFname()%> </td>
            <td></td>
        </table>
        <table>
            <td><label for="customer_lastname">Customer Last Name: </td>
            <td> <%=customer.getLname()%> </td>
            <td></td>
        </table>
        <table>
            <td><label for="customer_email">Customer Email: </td>
            <td> <%=customer.getEmail()%> </td>
            <td></td>
        </table>
        <table>
            <td><label for="customer_password">Customer Password: </td>
            <td> <%=customer.getPassword()%> </td>
            <td></td>
        </table>
        <table>
            <td><label for="customer_number">Customer Phone Number: </td>
            <td> <%=customer.getnumber()%> </td>
            <td></td>
        </table>
        
        
        <p align="left">
        <a class="button" href="user_search.jsp">Search Users</a>
        <a class="button" href="user_manage.jsp">User Management</a>
        </p>
        
    </body>
</html>
