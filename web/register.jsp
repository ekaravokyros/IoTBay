<%-- 
    Document   : register
    Created on : 30/03/2023, 10:22:46 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Registration</h1>
        <form action="welcome.jsp" method="post">
            <table>
                <tr>
                    <td><label for="email">Email</label></td>
                    <td><input type="text" id="email" name="email"></td>
                </tr>

                <tr>
                    <td><label for ="password">Password</label></td>
                    <td><input type="password" id="password" name="password"></td>
                </tr>
                <tr>
                    <td><label for="fname">First Name</label></td>
                    <td><input type="text" id="fname" name="fname"></td>
                </tr>
                <tr>
                    <td><label for="lname">Last Name</label></td>
                    <td><input type="text" id="lname" name="lname"></td>
                </tr>
                <tr>
                    <td><label for="address">Address</label></td>
                    <td><input type="text" id="address" name="address"></td>
                </tr>
                <tr>
                    <td><label for="city">City</label></td>
                    <td><input type="text" id="city" name="city"></td>
                </tr>
                <tr>
                    <td><label for="state">State</label></td>
                    <td><input type="text" id="state" name="state"></td>
                </tr>
                <tr>
                    <td><label for="pcode">Post Code</label></td>
                    <td><input type="integer" id="pcode" name="pcode"></td>
                </tr>
                <tr>
                    <td><label for="pnumber">Phone Number</label></td>
                    <td><input type="integer" id="pnumber" name="pnumber"></td>
                </tr>
                <tr>
                    <td><label for="tos">Do you agree to the terms of service</label></td>
                    <td><input type="checkbox" name="tos" value="ON" /></td>
                </tr>
            </table>
            <input type="submit" value="Register">
        </form>
    </body>
</html>
