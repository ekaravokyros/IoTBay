<%-- 
    Document   : product_show
    Created on : 07/05/2023, 1:41:21 PM
    Author     : NICHOLAS SMITH 11378054
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Product"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Products</title>
    </head>
    <body action="ShowProductsServlet">
        
        <%
            ArrayList<Product> products = (ArrayList<Product>) session.getAttribute("products");
            String display = (String) session.getAttribute("display");
        %>
        <h1>IoTBay Products</h1>
        <p align="left"><a class="button" href="product_manage.jsp">Product Management</a></p>       
        <table>
            <tr>
                <th><b>Product ID</b></th>  
                <th><b>Product Name</b></th>  
                <th><b>Product Description</b></th>                  
                <th><b>Product Model</b></th>                  
                <th><b>Product Type</b></th>                  
                <th><b>Product Manufacturer</b></th>                                
                <th><b>Product Powersource</b></th>                                 
                <th><b>Product Weight (g)</b></th>                  
                <th><b>Product Warranty</b></th>                                  
                <th><b>Product Price</b></th>  
                <th><b>Product Stock</b></th>                 
                <th><b>Product Availability</b></th>                  
                <th><b>Last Edited By</b></th>
            </tr>
            <%
                if (products != null) {
                    for (Product p: products){
            %>            
            <tr>
                <td><p><%=p.getProduct_ID()%></p></td>
                <td><p><%=p.getProduct_Name()%></p></td>
                <td><p><%=p.getProduct_Description()%></p></td>
                <td><p><%=p.getProduct_Model()%></p></td>        
                <td><p><%=p.getProduct_Type()%></p></td>
                <td><p><%=p.getProduct_Manufacturer()%></p></td>
                <td><p><%=p.getProduct_Powersource()%></p></td>
                <td><p><%=p.getProduct_Weight()%></p></td>
                <td><p><%=p.getProduct_Warranty()%></p></td>
                <td><p><%=p.getProduct_Price_formatted()%></p></td>
                <td><p><%=p.getProduct_Stock()%></p></td>
                <td><p><%=p.isProduct_Avail()%></p></td>
                <td><p><%=p.getLast_Edited_By()%></p></td>
            </tr>
                
            <% } %>
        </table>
        <br>
            <% } else { %>
            <span><= (display != null ? display : "")%></span>
            <% } %>
    </body>
</html>
