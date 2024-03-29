<%-- 
    Document   : product_update
    Created on : 08/05/2023, 8:23:11 PM
    Author     : NICHOLAS SMITH 11378054
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
            String outcome = (String) session.getAttribute("outcome");
            String Name_err = (String)session.getAttribute("Name_err");
            String Weight_err = (String)session.getAttribute("Weight_err");
            String Price_err = (String)session.getAttribute("Price_err");
            String Stock_err = (String)session.getAttribute("Stock_err");

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
                    <td>
                        <select id="product_Type" name="product_Type">
                            <option value=""  disabled <% if (product.getProduct_Type() == null) { %>selected<% } %>>--Please select--</option>
                            <option value="Camera"<% if ("Camera".equals(product.getProduct_Type())) { %>selected<% } %>>Camera</option>
                            <option value="Component"<% if ("Component".equals(product.getProduct_Type())) { %>selected<% } %>>Component</option>
                            <option value="Display"<% if ("Display".equals(product.getProduct_Type())) { %>selected<% } %>>Display</option>
                            <option value="Sensor"<% if ("Sensor".equals(product.getProduct_Type())) { %>selected<% } %>>Sensor</option>
                            <option value="Single Board Computer"<% if ("Single Board Computer".equals(product.getProduct_Type())) { %>selected<% } %>>Single Board Computer</option>
                        </select>   
                    </td>
                </tr>                
                <tr>
                    <td><label for="product_Manufacturer">Product Manufacturer: </td>
                    <td><%=product.getProduct_Manufacturer()%></td>
                    <td><input type="text" id="product_Manufacturer" name="product_Manufacturer" value="<%=product.getProduct_Manufacturer()%>"></td>
                </tr>                               
                <tr>
                    <td><label for="product_Powersource">Product Powersource: </td>
                    <td><%=product.getProduct_Powersource()%></td>
                    <td><input type="text" id="product_Powersource" name="product_Powersource" value="<%=product.getProduct_Powersource()%>"></td>
                </tr>                               
                <tr>
                    <td><label for="product_Weight">Product Weight (g): </td>
                    <td><%=product.getProduct_Weight()%></td>
                    <td><input type="text" id="product_Weight" name="product_Weight" value="<%=product.getProduct_Weight()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Warranty">Product Warranty: </td>
                    <td><%=product.getProduct_Warranty()%></td>
                    <td><input type="text" id="product_Warranty" name="product_Warranty" value="<%=product.getProduct_Warranty()%>"></td>
                </tr>                               
                <tr>
                    <td><label for="product_Price">Product Price: </td>
                    <td><%=product.getProduct_Price_formatted()%></td> 
                    <td><input type="text" id="product_Price" name="product_Price" value="<%=product.getProduct_Price()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Stock">Product Stock: </td>
                    <td><%=product.getProduct_Stock()%></td>
                    <td><input type="text" id="product_Stock" name="product_Stock" value="<%=product.getProduct_Stock()%>"></td>
                </tr>                
                <tr>
                    <td><label for="product_Avail">Product Availability: </td>
                    <td><label><input type="checkbox" id="product_Avail_current" name="product_Avail_current" value="true" disabled <%if (product.isProduct_Avail()) { %>checked<% } %>>Yes</label>
                    <input type="hidden" id="product_Avail_current" name="product_Avail_current" value="false"></td>
                    <td><label><input type="checkbox" id="product_Avail" name="product_Avail" value="true" <%if (product.isProduct_Avail()) { %>checked<% } %>>Yes</label>
                    <input type="hidden" id="product_Avail" name="product_Avail" value="false"></td>                   
                </tr>                      
                <tr>
                    <td><label for="last_Edited_By">Last Edited By: </td>
                    <td><%=product.getLast_Edited_By()%></td>
                    <td><input type="text" id="last_Edited_By" name="last_Edited_By" value="<%=product.getLast_Edited_By()%>"></td>
                </tr>  
            </table>
            <input class="button" type="submit" value="Update"><br>
        </form>
        <span><%= (outcome != null ? outcome : "")%></span><br>
        <span><%= (Name_err != null ? Name_err : "")%></span><br>
        <span><%= (Weight_err != null ? Weight_err : "")%></span><br>
        <span><%= (Price_err != null ? Price_err : "")%></span><br>
        <span><%= (Stock_err != null ? Stock_err : "")%></span><br>
        
        <p align="left">
        <a class="button" href="product_search.jsp">Product Search</a>
        <a class="button" href="product_manage.jsp">Product Management</a>
        </p>
    </body>
</html>
