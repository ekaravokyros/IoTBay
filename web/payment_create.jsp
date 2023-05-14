<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Create Payment</title>
    </head>
    <body>
        <h1>Create Payment Details</h1>
        <h3>Order <span style="font-weight: normal;">(ID)</span></h3>
        <h3>Total Amount $<span style="font-weight: normal;">(ORDER_AMOUNT)</span></h3>


        <form action="payment_confirm.jsp" method="post">
            <table>
                <tr>
                    <td><h3>Payment Information:</h3></td>
                <tr>
                
                <tr>
                    <td><label for="payment_method">Payment Method:</label></td>
                    <td><select id="payment_method" name="payment_method">
                        <option value="credit_card">Credit Card</option>
                        <option value="debit_card">Debit Card</option>
                        </select>
                    </td>
                </tr>
                
                <tr>
                    <td><label for="name_on_card">Cardholder Name:</label></td>
                    <td><input type="text" id="name_on_card" name="name_on_card" required></td>
                </tr>
                
                <tr>
                    <td><label for="card_number">Card Number:</label></td>
                    <td><input type="text" id="card_number" name="card_number" required></td>
                </tr>
                
                <tr>
                    <td><label for="expiry_date">Expiry Date:</label></td>
                    <td><input type="month" id="expiry_date" name="expiry_date" required></td>
                </tr>
                
                <tr>
                    <td><label for="cvv">CVV:</label></td>
                    <td><input type="password" id="cvv" name="cvv" required></td>
                </tr>
                
                <tr>
                    <td><label for name="datePaid"><h4>Date Paid: </h4></label></td>
                    <td><input type="date" id="date_paid" name="date_paid" required/></td>
                </tr>
            </table>
            <input class="button" type="submit" value="Create">
        </form>
        <p align="right"><a class="button" href="payment_details.jsp">Back</a></p>
    </body>
</html>
