<%-- 
    Document   : payment_history
    Created on : 14/05/2023, 3:26:08 PM
    Author     : nixon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Payment History</title>
    </head>
    <body>
        <%
            String searched = request.getParameter("searched");
        %>
        <h1>Payment History</h1>
        <h3>Search Payment Details by Payment ID and/or Date Paid</h3>
        
         <form action="payment_history.jsp" method="post">
            <table>
                <tr>
                    <td><label for="filter">Payment ID:</label></td>
                    <td><input type="text" id="paymentID_filter" name="paymentID_filter"></td>
                </tr>

                <td><label for="filter">Date Paid:</label></td>
                <td><input type="date" id="date_filter" name="date_filter"></td>
            </table>

            <input class="button" type="submit" value="Search">
            <input type="hidden" name="searched" value="searched">
        </form>
        
        <h3> <%= (searched != null) ? "Search Results":"" %> </h3>
        <p> <%= (searched != null) ? "Payment ID:":"" %> </p>
        <p> <%= (searched != null) ? "Order ID:":"" %> </p>
        <p> <%= (searched != null) ? "Payment Method:":"" %> </p>
        <p> <%= (searched != null) ? "Cardholder Name:":"" %> </p>
        <p> <%= (searched != null) ? "Expiry Date:":"" %> </p>
        <p> <%= (searched != null) ? "CVV:":"" %> </p>
        <p> <%= (searched != null) ? "Date Paid:":"" %> </p>

        <p align="right"><a class="button" href="main.jsp">Back</a></p>
    </body>
</html>
