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
            String ID_err = (String)session.getAttribute("ID_err");
            String Name_err = (String)session.getAttribute("Name_err");
            String Descr_err = (String)session.getAttribute("Descr_err");
            String Model_err = (String)session.getAttribute("Model_err");
            String Type_err = (String)session.getAttribute("Type_err");
            String Manu_err = (String)session.getAttribute("Manu_err");
            String Feat_err = (String)session.getAttribute("Feat_err");
            String Pow_err = (String)session.getAttribute("Pow_err");
            String Dims_err = (String)session.getAttribute("Dims_err");
            String Weight_err = (String)session.getAttribute("Weight_err");
            String Warr_err = (String)session.getAttribute("Warr_err");
            String Img_err = (String)session.getAttribute("Img_err");
            String Price_err = (String)session.getAttribute("Price_err");
            String Stock_err = (String)session.getAttribute("Stock_err");
            String Avail_err = (String)session.getAttribute("Avail_err");
            String Category_err = (String)session.getAttribute("Category_err");
            String Discount_err = (String)session.getAttribute("Discount_err");
            String EditedBy_err = (String)session.getAttribute("EditedBy_err");
        %>
        <h1>Add Product to Store</h1>
        
        <form action="ProductAddServlet" method="post" autocomplete="off">
            <table>
                <tr>
                    <td><label for="product_ID">Product ID: </td>
                    <td><input type="text" id="product_ID" name="product_ID" placeholder="<%=(ID_err != null ? ID_err : "Enter ID")%>"></td>                               
                </tr>
                <tr>
                    <td><label for="product_Name">Product Name: </td>
                    <td><input type="text" id="product_Name" name="product_Name" placeholder="<%=(Name_err != null ? Name_err : "Enter Name")%>" ></td>
                    <td></td>
                </tr>
                <tr>
                    <td><label for="product_Description">Product Description: </td>
                    <td><input type="text" id="product_Description" name="product_Description" placeholder="<%=(Descr_err != null ? Descr_err : "Enter Description")%>" ></td>
                    <td></td>
                </tr>
                <tr>
                    <td><label for="product_Model">Product Model: </td>
                    <td><input type="text" id="product_Model" name="product_Model" placeholder="<%=(Model_err != null ? Model_err : "Enter Model")%>" ></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Type">Product Type: </td> 
                    <td><input type="text" id="product_Type" name="product_Type" placeholder="<%=(Type_err != null ? Type_err : "Enter Type")%>" ></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Manufacturer">Product Manufacturer: </td>
                    <td><input type="text" id="product_Manufacturer" name="product_Manufacturer" placeholder="<%=(Manu_err != null ? Manu_err : "Enter Manufacturer")%>" ></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Features">Product Features: </td>
                    <td><input type="text" id="product_Features" name="product_Features" placeholder="<%=(Feat_err != null ? Feat_err : "Enter Features")%>" ></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Powersource">Product Powersource: </td>
                    <td><input type="text" id="product_Powersource" name="product_Powersource" placeholder="<%=(Pow_err != null ? Pow_err : "Enter Powersource")%>"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Dimensions">Product Dimensions: </td>
                    <td><input type="text" id="product_Dimensions" name="product_Dimensions" placeholder="<%=(Dims_err != null ? Dims_err : "Enter Dimensions")%>"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Weight">Product Weight: </td>
                    <td><input type="text" id="product_Weight" name="product_Weight" placeholder="<%=(Weight_err != null ? Weight_err : "Enter Weight")%>"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Warranty">Product Warranty: </td>
                    <td><input type="text" id="product_Warranty" name="product_Warranty" placeholder="<%=(Warr_err != null ? Warr_err : "Enter Warranty")%>"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Image">Product Image: </td>
                    <td><input type="text" id="product_Image" name="product_Image" placeholder="<%=(Img_err != null ? Img_err : "Enter Image")%>"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Price">Product Price: </td>
                    <td><input type="text" id="product_Price" name="product_Price" placeholder="<%=(Price_err != null ? Price_err : "Enter Price")%>"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Stock">Product Stock: </td>
                    <td><input type="text" id="product_Stock" name="product_Stock" placeholder="<%=(Stock_err != null ? Stock_err : "Enter Stock")%>"></td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Avail">Product Available? </td>
                    <td>
                        <label><input type="checkbox" id="product_Avail" name="product_Avail" value="true">Yes</label>
                        <input type="hidden" id="product_Avail" name="product_Avail" value="false">
                    </td>
                    <td></td>
                </tr>                
                <tr>
                    <td><label for="product_Category">Product Category: </td>
                    <td><input type="text" id="product_Category" name="product_Category" placeholder="<%=(Category_err != null ? Category_err : "Enter Category")%>"></td>
                    <td></td>
                </tr>   
                <tr>
                    <td><label for="product_Discount">Product Discount: </td>
                    <td><input type="text" id="product_Discount" name="product_Discount" placeholder="<%=(Discount_err != null ? Discount_err : "Enter Discount")%>"></td>
                    <td></td>
                </tr>      
                <tr>
                    <td><label for="last_Edited_By">Last Edited By: </td>
                    <td><input type="text" id="last_Edited_By" name="last_Edited_By" placeholder="<%=(EditedBy_err != null ? ID_err : "")%>"></td>
                    <td></td>
                </tr>      
            </table>
            <input class="button" type="submit" value="Add Product">
        </form>
        <p align="left"><a class="button" href="product_manage.jsp">Product Management</a></p>
        <span><%= (outcome != null ? outcome : "")%></span>
    </body>
</html>
