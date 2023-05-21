<%-- 
    Document   : adminmenu
    Created on : 17/05/2023, 12:35:10 AM
    Author     : dsake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Admin Menu</title>
    </head>
    
    <!--------------LOGIN USERNAME 'admin112233' AND PASSWORD '!welcome!'-------------->
    
    <body>
        <%
            String username1 =  request.getParameter("username1");
            String password1 =  request.getParameter("password1");
            
            if (!username1.equals("admin112233") || !password1.equals("!welcome!")){
                %><h1>Error!</h1><%
                out.println("Sorry, the email and/or password do not match." + "<br>");
                out.println("Click below to go back and login once again." + "<br>");
                %><a class="button" href="adminlogin.jsp">Back</a><%
            }
            else {
                %><h1>Welcome Back!</h1>
                <table>
                    <td><a class="button" href="user_manage.jsp">Manage Users</a></td>
                    <td><a class="button" href="adminlogin.jsp">Back</a></td> 
              </table><%
            }
            %>
    </body>
</html>
