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
        <title>Confirm Payment Details</title>
    </head>
    <body>
        <%
            String payment_method = request.getParameter("payment_method");
            String name_on_card = request.getParameter("name_on_card");
            String card_number = request.getParameter("card_number");
            String expiry_date = request.getParameter("expiry_date");
            String cvv = request.getParameter("cvv");
            String date_paid = request.getParameter("date_paid");
        %>
        
        <h1>Confirm Payment Information</h1>
        <!--order id text-->
        <h3>Order <span style="font-weight: normal;">(ID)</span></h3>
        <!--order amount text-->
        <h3>Total Amount $<span style="font-weight: normal;">(ORDER_AMOUNT)</span></h3>
        
       <!--payment information text fields-->
        <form action="payment_details.jsp" method="post">
            <table>
                <tr>
                    <td><h3>Payment Information:</h3></td>
                <tr>
                
                <tr>
                    <td><b>Payment Method: </b></td>
                    <td><%=payment_method%></td>
                </tr>
                
                <tr>
                    <td><b>Cardholder Name: </b></td>
                    <td><%=name_on_card%></td>
                </tr>
                
                <tr>
                    <td><b>Card Number: </b></td>
                    <td><%=card_number%></td>
                </tr>
                
                <tr>
                    <td><b>Expiry Date: </b></td>
                    <td><%=expiry_date%></td>
                </tr>
                
                <tr>
                    <td><b>CVV: </b></td>
                    <td><%=cvv%></td>
                </tr>
                
                <tr>
                    <td><b>Date Paid: </b></td>
                    <td><%=date_paid%></td>
                </tr>
            </table>
            
            <!--confirm button-->
            <input class="button" type="submit" value="Confirm">
            
            <!--user input fields are stored into payment session--> 
            <% 
                Payment payment = new Payment(payment_method, name_on_card, card_number, expiry_date, cvv, date_paid); 
                session.setAttribute("payment", payment);
            %>
        </form>
        <!--back button-->
        <a class="button" href="payment_create.jsp">Back</a><p>
    </body>
</html>
