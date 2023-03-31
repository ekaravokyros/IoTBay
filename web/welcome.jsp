<%-- 
    Document   : welcome
    Created on : 30/03/2023, 10:26:19 PM
    Author     : nrsmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Customer"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome</h1>
       <%
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String pcode = request.getParameter("pcode");
            String pnumber = request.getParameter("pnumber");
            String tos = request.getParameter("tos");

            if (tos == null) {
                out.println("Sorry, you must agree to the Terms of Service." + "<br>");
                out.println("Click ");               
                %><a href="register.jsp">here</a><%
                out.println(" to go back" + "<br>");
            }     
            
            else if (tos.equals("ON")){
                out.println("Welcome " + fname + "!" + "<br>");
                out.println("Your Email is " + email + "." + "<br>");
                out.println("Your password is " + password + "." + "<br>");
                out.println("Address is " + address + " " + city + ", " + state + " " + pcode + "<br>");
                out.println("Your best contact number is " + pnumber + "." + "<br>");  
                out.println("Click ");               
                %><a href="main.jsp">here</a><%
                out.println(" proceed to the main page." + "<br>");
            }
        %>
        <% 
            Customer customer = new Customer(email, password, fname, lname, address, city, state, pcode, pnumber);
            session.setAttribute("Customer", customer);
        %>
    </body>
</html>