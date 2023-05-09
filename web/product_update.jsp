<%-- 
    Document   : product_update
    Created on : 08/05/2023, 8:23:11 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Product"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Update Product</title>
    </head>
    <body>
        <h1>Update Product Details</h1>
        
        <%
            Product product = (Product) session.getAttribute("product");
            String updated = (String) session.getAttribute("updated");
        %>
        <form action="ProductUpdateServlet" method="post">
            <table>
                <input type="hidden" id="product_ID" name="product_ID" value="${product.getProduct_ID()}">
                <tr>
                    <th></th>
                    <th>Current</th>
                    <th>Revised</th>
                </tr>
                <tr>
                    <td><label for="product_ID">Product ID: </td>
                    <td><%=product.getProduct_ID()%></td>                               
                </tr>
                <tr>
                    <td><label for="product_Name">Product Name: </td>
                    <td><%=product.getProduct_Name()%></td>
                    <td><input type="text" id="product_Name" name="product_Name" value="<%=product.getProduct_Name()%>"></td>
                </tr>
                <tr>
                    <td><label for="product_Description">Product Description: </td>
                    <td><%=product.getProduct_Description()%></td>
                    <td><input type="text" id="product_Description" name="product_Description" value="<%=product.getProduct_Description()%>"></td>
                </tr>
                <tr>
                    <td><label for="product_Model">Product Model: </td>
                    <td><%=product.getProduct_Model()%></td>
                    <td><input type="text" id="product_Model" name="product_Model" value="<%=product.getProduct_Model()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Type">Product Type: </td> 
                    <td><%=product.getProduct_Type()%></td>
                    <td><input type="text" id="product_Type" name="product_Type" value="<%=product.getProduct_Type()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Manufacturer">Product Manufacturer: </td>
                    <td><%=product.getProduct_Manufacturer()%></td>
                    <td><input type="text" id="product_Manufacturer" name="product_Manufacturer" value="<%=product.getProduct_Manufacturer()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Features">Product Features: </td>
                    <td><%=product.getProduct_Features()%></td>
                    <td><input type="text" id="product_Features" name="product_Features" value="<%=product.getProduct_Features()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Powersource">Product Powersource: </td>
                    <td><%=product.getProduct_Powersource()%></td>
                    <td><input type="text" id="product_Powersource" name="product_Powersource" value="<%=product.getProduct_Powersource()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Dimensions">Product Dimensions: </td>
                    <td><%=product.getProduct_Dimensions()%></td>
                    <td><input type="text" id="product_Dimensions" name="product_Dimensions" value="<%=product.getProduct_Dimensions()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Weight">Product Weight: </td>
                    <td><%=product.getProduct_Weight()%></td>
                    <td><input type="text" id="product_Weight" name="product_Weight" value="<%=product.getProduct_Weight()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Warranty">Product Warranty: </td>
                    <td><%=product.getProduct_Warranty()%></td>
                    <td><input type="text" id="product_Warranty" name="product_Warranty" value="<%=product.getProduct_Warranty()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Image">Product Image: </td>
                    <td><%=product.getProduct_Image()%></td>
                    <td><input type="text" id="product_Image" name="product_Image" value="<%=product.getProduct_Image()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Price">Product Price: </td>
                    <td><%=product.getProduct_Price()%></td>
                    <td><input type="text" id="product_Price" name="product_Price" value="<%=product.getProduct_Price()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Stock">Product Stock: </td>
                    <td><%=product.getProduct_Stock()%></td>
                    <td><input type="text" id="product_Stock" name="product_Stock" value="<%=product.getProduct_Stock()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Avail">Product Availability: </td>
                    <td><%=product.isProduct_Avail()%></td>
                    <td><input type="text" id="product_Avail" name="product_Avail" value="<%=product.isProduct_Avail()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Category">Product Category: </td>
                    <td><%=product.getProduct_Category()%></td>
                    <td><input type="text" id="product_Category" name="product_Category" value="<%=product.getProduct_Category()%>"></td>
                </tr>   
                <tr>
                    <td><label for="product_Discount">Product Discount: </td>
                    <td><%=product.getProduct_Discount()%></td>
                    <td><input type="text" id="product_Discount" name="product_Discount" value="<%=product.getProduct_Discount()%>"></td>
                </tr>      
                <tr>
                    <td><label for="last_Edited_By">Last Edited By: </td>
                    <td><%=product.getLast_Edited_By()%></td>
                    <td><input type="text" id="last_Edited_By" name="last_Edited_By" value="<%=product.getLast_Edited_By()%>"></td>
                </tr>  
            </table>
            <input class="button" type="submit" value="Update"><br>
        </form>
        <span><%= (updated != null ? updated : "")%></span><br>
        
        <p align="left">
        <a class="button" href="product_search.jsp">Product Search</a>
        <a class="button" href="product_manage.jsp">Product Management</a>
        </p>
    </body>
</html>
