<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Update Payment Details</title>
    </head>
    <body>
        <h1>Update Payment Details</h1>
        
        <%
            String payment_method = request.getParameter("paymentMethod");
            String card_number = request.getParameter("card_number");
            String expiry_date = request.getParameter("expiry_date");
            String cvv = request.getParameter("cvv");
        %>
        
        <form action="payment_details.jsp" method="post">
            <table>
                <tr>
                    <td><label for="payment_method">Payment Method:</label></td>
                    <td><select id="payment_method" name="payment_method">
                        <option value="credit_card">Credit Card</option>
                        <option value="debit_card">Debit Card</option>
                    </td>
                </tr>
                
                <tr>
                    <td><label for="card_number">Card Number:</label></td>
                    <td><input type="text" id="card_number" name="card_number"></td>
                </tr>
                
                <tr>
                    <td><label for="expiry_date">Expiry Date:</label></td>
                    <td><input type="month" id="expiry_date" name="expiry_date"></td>
                </tr>
                
                <tr>
                    <td><label for="cvv">CVV:</label></td>
                    <td><input type="password" id="cvv" name="cvv"></td>
                </tr>
            </table>
            <input class="button" type="submit" value="Update">
        </form>
    </body>
</html>
