<%-- 
    Document   : payment_delete
    Created on : 9 May 2023, 4:22:55 pm
    Author     : nixon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Delete Payment Record</title>
    </head>
    <body>
        <%
            String payment_method = request.getParameter("paymentMethod");
            String name_on_card = request.getParameter("name_on_card");
            String card_number = request.getParameter("card_number");
            String expiry_date = request.getParameter("expiry_date");
            String cvv = request.getParameter("cvv");
        %>
        
        <h1>View Payment Details</h1>
            <p>Payment Method: </p>
            <p>Cardholder Name:</p>
            <p>Card Number: </p>
            <p>Expiry Date: </p>
            <p>CVV: </p>
        
        <p align="right"><a class="button" href="payment_details.jsp">Back</a></p>
    </body>
</html>
