<%-- 
    Document   : payment_delete
    Created on : 9 May 2023, 4:22:55 pm
    Author     : nixon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Payment"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>View Payment Details</title>
    </head>
    <body>
        <% 
            Payment payment = (Payment)session.getAttribute("payment");
            if (payment == null) { // incase user hasnt added payment information, inputs empty values 
                payment = new Payment("", "", "", "", "", "");
                session.setAttribute("payment", payment);
            }
        %>
        
        <h1>View Payment Details</h1>
        
        <!--payment session values are outputted-->
        <table>
            <tr>
                <td><h3>Payment Information:</h3></td>
            <tr>

            <tr>
                <td><b>Payment Method: </b></td>
                <td><%=payment.getPayment_method()%></td>
            </tr>

            <tr>
                <td><b>Cardholder Name: </b></td>
                <td><%=payment.getName_on_card()%></td>
            </tr>

            <tr>
                <td><b>Card Number: </b></td>
                <td><%=payment.getCard_number()%></td>
            </tr>

            <tr>
                <td><b>Expiry Date: </b></td>
                <td><%=payment.getExpiry_date()%></td>
            </tr>

            <tr>
                <td><b>CVV: </b></td> 
                <td><%=payment.getCvv()%></td>
            </tr>

        </table>
        
        <!--back button-->
        <a class="button" href="payment_details.jsp">Back</a><p>
    </body>
</html>
