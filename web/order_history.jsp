<%-- 
    Document   : order_history
    Created on : 16/05/2023, 3:55:06 PM
    Author     : Dewan Laptop
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Order"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order History</title>
    </head>
    <body>

        <h1>Order History</h1>
        
            <table>
                <td><input type="text" placeholder="Enter Order ID" name="ORDERID"><input class="button" type="submit" value="Search" required="true"></td>
            </table
        </form>
        <br />
        <form method="post" >
            
            <!--/**/action will be once chilled on specific will take you to the order-->
            <table>
                <tr>
                    <th><b>Order ID</b></th>  
                    <th><b>Product Name</b></th>  
                    <th><b>Product ID</b></th>        
                    <th><b>Price</b></th>  
                </tr>

                <tr>

                </tr>
                
            </table>
        </form>
            </body>
        </html>
    

