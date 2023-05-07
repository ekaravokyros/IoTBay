<%-- 
    Document   : product_addItem
    Created on : 07/05/2023, 1:40:46 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Product"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Add Produce</title>
    </head>
    <body>
        <%
            String outcome = (String)session.getAttribute("outcome");
        %>
        <h1>Add Product to Store</h1>
        
        <form action="AddItemServlet" method="post" autocomplete="off">
            <table>
                <tr>
                    <td><label for="product_ID">Product ID: </td>
                    <td><input type="text" id="product_ID" name="product_ID"></td>                               
                </tr>
                <tr>
                    <td><label for="product_Name">Product Name: </td>
                    <td><input type="text" id="product_Name" name="product_Name"></td>
                    <td></td>
                </tr>
                <tr>
                    <td><label for="product_Description">Product Description: </td>
                    <td><input type="text" id="product_Description" name="product_Description"></td>
                    <td></td>
                </tr>
                <tr>
                    <td><label for="product_Model">Product Model: </td>
                    <td><input type="text" id="product_Model" name="product_Model"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Type">Product Type: </td> 
                    <td><input type="text" id="product_Type" name="product_Type"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Manufacturer">Product Manufacturer: </td>
                    <td><input type="text" id="product_Manufacturer" name="product_Manufacturer"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Features">Product Features: </td>
                    <td><input type="text" id="product_Features" name="product_Features"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Powersource">Product Powersource: </td>
                    <td><input type="text" id="product_Powersource" name="product_Powersource"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Dimensions">Product Dimensions: </td>
                    <td><input type="text" id="product_Dimensions" name="product_Dimensionse"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Weight">Product Weight: </td>
                    <td><input type="text" id="product_Weight" name="product_Weight"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Warranty">Product Warranty: </td>
                    <td><input type="text" id="product_Warranty" name="product_Warranty"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Image">Product Image: </td>
                    <td><input type="text" id="product_Image" name="product_Image"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Price">Product Price: </td>
                    <td><input type="text" id="product_Price" name="product_Price"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Stock">Product Stock: </td>
                    <td><input type="text" id="product_Stock" name="product_Stock"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Avail">Product Availability: </td>
                    <td><input type="text" id="product_Avail" name="product_Avail"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Category">Product Category: </td>
                    <td><input type="text" id="product_Category" name="product_Category"></td>
                    <td></td>
                </tr>   
                <tr>
                    <td><label for="product_Discount">Product Discount: </td>
                    <td><input type="text" id="product_Discount" name="product_Discount"></td>
                    <td></td>
                </tr>      
                <tr>
                    <td><label for="last_Edited_By">Last Edited By: </td>
                    <td><input type="text" id="last_Edited_By" name="last_Edited_By"></td>
                    <td></td>
                </tr>      
            </table>
            <input class="button" type="submit" value="Add Product">
        </form>
        <p align="left"><a class="button" href="product_manage.jsp">Product Management</a></p>
        <span><%= (outcome != null ? outcome : "")%></span>
    </body>
</html>
