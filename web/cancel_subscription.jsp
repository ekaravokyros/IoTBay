<%-- 
    Document   : cancel_subscription
    Created on : 17/05/2023, 8:45:18 AM
    Author     : evelynkaravokyros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

       
    <head>
        <title>Cancel Page</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
     <body>
        <h1>Your subscription has been cancelled.</h1>
        <h2>Thank you for using our service.</h2>
        
          <p><a class="button" href="index.jsp">Home</a></p>
        <% session.invalidate(); %>
        
    </body>
</html>
