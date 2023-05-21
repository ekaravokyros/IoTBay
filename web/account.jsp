<%-- 
    Document   : account
    Created on : 01/04/2023, 8:00:19 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Customer"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Account</h1>
       <%
            Customer customer = (Customer)session.getAttribute("customer"); 
            String updated = request.getParameter("updated");
            if (updated != null) {
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
               // String address = request.getParameter("address");
//                String city = request.getParameter("city");
//                String state = request.getParameter("state");
//                String pcode = request.getParameter("pcode");
                String number = request.getParameter("number");
                customer = new Customer(fname, lname, email, password, number); 
                session.setAttribute("customer", customer);
           }
        %>



       
       <h2><span> <%= (updated != null) ? "Update was successful":"" %> </span></h2>
        <form action="account.jsp" method="post">
            <table>
                <tr>
                    <td><label for="email">Email</label></td>
                    <td><input type="text" id="email" name="email" value="${customer.email}"></td>
                </tr>

                <tr>
                    <td><label for ="password">Password</label></td>
                    <td><input type="password" id="password" name="password" value="${customer.password}"></td>
                </tr>
                <tr>
                    <td><label for="fname">First Name</label></td>
                    <td><input type="text" id="fname" name="fname" value="${customer.fname}"></td>
                </tr>
                <tr>
                    <td><label for="lname">Last Name</label></td>
                    <td><input type="text" id="lname" name="lname" value="${customer.lname}"></td>
                </tr>
<!--                <tr>
                    <td><label for="address">Address</label></td>
                    <td><input type="text" id="address" name="address" value="${customer.address}"></td>
                </tr>
                <tr>
                    <td><label for="city">City</label></td>
                    <td><input type="text" id="city" name="city" value="${customer.city}"></td>
                </tr>
                <tr>
                    <td><label for="state">State</label></td>
                    <td><input type="text" id="state" name="state" value="${customer.state}"></td>
                </tr>
                <tr>
                    <td><label for="pcode">Post Code</label></td>
                    <td><input type="integer" id="pcode" name="pcode" value="${customer.pcode}"></td>
                </tr>
                <tr>-->
                    <td><label for="pnumber">Phone Number</label></td>
                    <td><input type="integer" id="number" name="number" value="${customer.number}"></td>
                </tr>
                <tr><td></td>
                    <td>
                        <input class="button" type="submit" value="Update">
                        <input type="hidden" name="updated" value="updated">
                    </td>
                </tr>
                <tr><br></tr>
                    <td>
<!--                        <button type="button" onclick="">Cancel Subscription </button>-->
                        <td><a class="button" href="cancel_subscription.jsp">Cancel Subscription</a></td>
                    </td>
                <tr>
                    <td><a class="button" href="main.jsp">Main</a></td>
                </tr>
            </table>
        </form>
                
          

    </body>
</html>

