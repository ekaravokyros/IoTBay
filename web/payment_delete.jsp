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
        <select name="payment_records" id="payment_records">
            <!--dummy payment record-->
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
        </select>
        
        <!--select button onclick deleteSelectedOptions function--> 
        <input class="button" type="submit" value="Delete" onclick="deleteSelectedOption()">
        
        <!--back button-->
        <p align="right"><a class="button" href="payment_details.jsp">Back</a></p>
        
        <!--deleteSelectedOption function will remove the selected payment record from the dropdown list-->
        <script>
            function deleteSelectedOption() {
                var selectElement = document.getElementById("payment_records");
                var selectedOption = selectElement.options[selectElement.selectedIndex];
                selectedOption.remove();
            }
        </script>
    </body>
</html>
