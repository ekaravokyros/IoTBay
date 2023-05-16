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
        <h1>Delete Payment Record</h1>
        <form action="PaymentDeleteServlet" method="post">
            <select name="payment_records" id="payment_records">
                <option value="PaymentID1">PaymentID1</option>
                <option value="PaymentID2">PaymentID2</option>
                <option value="PaymentID3">PaymentID3</option>
            </select>
        
            <input class="button" type="submit" value="Delete">
        </form>
        
        <p align="right"><a class="button" href="payment_details.jsp">Back</a></p>
    </body>
</html>
