<%-- 
    Document   : product_options
    Created on : 08/05/2023, 6:13:08 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Product"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Product Admin</title>
    </head>
        <%
            Product product = (Product) session.getAttribute("product");
        %>
    <body>
        <h1>Product Management Options</h1>
        <p align="left">
        <a class="button" href="product_update.jsp">Update Product</a>
        <a class="button" href="product_delete.jsp">Delete Product</a>
        </p>
        <table>
            <tr>
                <td><label for="product_ID">Product ID: </td>
                <td><%=product.getProduct_ID()%></td>                               
            </tr>
            <tr>
                <td><label for="product_Name">Product Name: </td>
                <td><%=product.getProduct_Name()%></td>
                <td></td>
            </tr>
            <tr>
                <td><label for="product_Description">Product Description: </td>
                <td><%=product.getProduct_Description()%></td>
                <td></td>
            </tr>
            <tr>
                <td><label for="product_Model">Product Model: </td>
                <td><%=product.getProduct_Model()%></td>
                <td></td>
            </tr>                
            <tr>
                <td><label for="product_Type">Product Type: </td> 
                <td><%=product.getProduct_Type()%></td>
                <td></td>
            </tr>                
            <tr>
                <td><label for="product_Manufacturer">Product Manufacturer: </td>
                <td><%=product.getProduct_Manufacturer()%></td>
                <td></td>
            </tr>                
            <tr>
                <td><label for="product_Features">Product Features: </td>
                <td><%=product.getProduct_Features()%></td>
                <td></td>
            </tr>                
            <tr>
                <td><label for="product_Powersource">Product Powersource: </td>
                <td><%=product.getProduct_Powersource()%></td>
                <td></td>
            </tr>                
            <tr>
                <td><label for="product_Dimensions">Product Dimensions: </td>
                <td><%=product.getProduct_Dimensions()%></td>
                <td></td>
            </tr>                
            <tr>
                <td><label for="product_Weight">Product Weight: </td>
                <td><%=product.getProduct_Weight()%></td>
                <td></td>
            </tr>                
            <tr>
                <td><label for="product_Warranty">Product Warranty: </td>
                <td><%=product.getProduct_Warranty()%></td>
                <td></td>
            </tr>                
            <tr>
                <td><label for="product_Image">Product Image: </td>
                <td><%=product.getProduct_Image()%></td>
                <td></td>
            </tr>                
            <tr>
                <td><label for="product_Price">Product Price: </td>
                <td><%=product.getProduct_Price()%></td>
                <td></td>
            </tr>                
            <tr>
                <td><label for="product_Stock">Product Stock: </td>
                <td><%=product.getProduct_Stock()%></td>
                <td></td>
            </tr>                
            <tr>
                <td><label for="product_Avail">Product Availability: </td>
                <td><%=product.isProduct_Avail()%></td>
                <td></td>
            </tr>                
            <tr>
                <td><label for="product_Category">Product Category: </td>
                <td><%=product.getProduct_Category()%></td>
                <td></td>
            </tr>   
            <tr>
                <td><label for="product_Discount">Product Discount: </td>
                <td><%=product.getProduct_Discount()%></td>
                <td></td>
            </tr>      
            <tr>
                <td><label for="last_Edited_By">Last Edited By: </td>
                <td><%=product.getLast_Edited_By()%></td>
                <td></td>
            </tr>      
        </table>
        <p align="left">
        <a class="button" href="product_search.jsp">Search Products</a>
        <a class="button" href="product_manage.jsp">Product Management</a>
        </p>
    </body>
</html>
