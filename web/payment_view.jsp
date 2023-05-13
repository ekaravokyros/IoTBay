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
        <title>View Payment Record</title>
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
        <h3>Order (id)</h3>
        <h3>Total Amount $(amount)</h3>
        <form action="payment_details.jsp" method="post">
            <p>Payment Method: </p>
            <p>Cardholder Name:</p>
            <p>Card Number: </p>
            <p>Expiry Date: </p>
            <p>CVV: </p>
            <input class="button" type="submit" value="Confirm">
        </form>
        <p align="right"><a class="button" href="payment_details.jsp">Back</a></p>
    </body>
</html>
