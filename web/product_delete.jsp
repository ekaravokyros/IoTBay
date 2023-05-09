<%-- 
    Document   : product_delete
    Created on : 08/05/2023, 8:23:23 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Product"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Delete Product</title>
    </head>
    <body>
        <%
            Product product = (Product) session.getAttribute("product");
            String msg_delete = (String) session.getAttribute("msg_delete"); 
        %>
        <h1>Delete Product</h1>
        <form action="ProductDeleteServlet" method="post">    
            <table>
                <input type="hidden" id="product_ID" name="product_ID" value="${product.getProduct_ID()}">
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
            <p>Click the below button to delete</p>
            <input class="button" type="submit" value="Delete"><br>
        </form>
        <span><%= (msg_delete != null ? msg_delete : "")%></span><br>
        
        <p align="left">
        <a class="button" href="product_search.jsp">Product Search</a>
        <a class="button" href="product_manage.jsp">Product Management</a>
        </p>
    </body>
</html>
