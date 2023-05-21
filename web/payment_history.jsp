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

            // declaring dummy data string values
            String paymentID = request.getParameter("paymentID_filter");
            String orderID = "";
            String paymentMethod = "";
            String cardholderName = "";
            String cardNumber = "";
            String expiryDate = "";
            String cvv = "";
            String datePaid = "";
            
            // dummy data based on payment ID
            if (searched != null && paymentID != null) {
                if (paymentID.equals("1")) {
                    orderID = "1001";
                    paymentMethod = "Credit Card";
                    cardholderName = "John Doe";
                    cardNumber = "7579830289842898";
                    expiryDate = "2025-12";
                    cvv = "123";
                    datePaid = "2023-05-01";
                } else if (paymentID.equals("2")) {
                    orderID = "1002";
                    paymentMethod = "Debit Card";
                    cardholderName = "Jane Smith";
                    cardNumber = "6496378372599010";
                    expiryDate = "2024-06";
                    cvv = "456";
                    datePaid = "2023-05-02";
                } else if (paymentID.equals("3")) {
                    orderID = "1003";
                    paymentMethod = "Credit Card";
                    cardholderName = "David Johnson";
                    cardNumber = "757611884332 652";
                    expiryDate = "2024-09";
                    cvv = "789";
                    datePaid = "2023-05-03";
                }
            }
        %>
        <h1>Payment History</h1>
        <h3>Search Payment Details by Payment ID and/or Date Paid</h3>
        
        <!--paymentId/datePaid filter inputs-->
        <form action="payment_history.jsp" method="post">
            <table>
                <tr>
                    <td><label for="filter">Payment ID:</label></td>
                    <td><input type="text" id="paymentID_filter" name="paymentID_filter"></td>
                </tr>

                <td><label for="filter">Date Paid:</label></td>
                <td><input type="date" id="date_filter" name="date_filter"></td>
            </table>
            
            <!--search button-->
            <input class="button" type="submit" value="Search">
            <input type="hidden" name="searched" value="searched">
        </form>
        
        
        <% if (searched != null && (paymentID.equals("1") || paymentID.equals("2") || paymentID.equals("3"))) { // if dummy paymentID is inputted, gives payment record information%>
            <h2>Search Results</h2>
            <p><b>Payment ID:</b> <%= paymentID %></p>
            <p><b>Order ID:</b> <%= orderID %></p>
            <p><b>Payment Method:</b> <%= paymentMethod %></p>
            <p><b>Cardholder Name:</b> <%= cardholderName %></p>
            <p><b>Card Number:</b> <%= cardNumber %></p>
            <p><b>Expiry Date:</b> <%= expiryDate %></p>
            <p><b>CVV:</b> <%= cvv %></p>
            <p><b>Date Paid:</b> <%= datePaid %></p>
        <% } else if (searched != null) { // paymentID does not exist %> 
            <h2>No Results Found</h2>
        <% } %>

        <p align="right"><a class="button" href="main.jsp">Back</a></p>
    </body>
</html>
