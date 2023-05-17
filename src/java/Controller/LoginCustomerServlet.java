/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Customer;
import DAO.DBManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.servlet.http.HttpSession;
import DAO.*;

/**
 *
 * @author evelynkaravokyros
 */


public class LoginCustomerServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        
        HttpSession session = request.getSession();  //Step1 - Retrieve current session
         
        Validator validator = new Validator();     //Step2 - create instance of validator class
         
        String email = request.getParameter("email");   //Step3 - Capture email
         
        String password = request.getParameter("password");     //Step4 - Capture password
        
        DBManager manager = (DBManager) session.getAttribute("manager");   //Step5 - Retrive manager from session
         
        Customer customer = null;
        validator.clear(session);
        
         if (!validator.validateEmail(email)) {
                session.setAttribute("Email_err", "Error: Email format incorrect");
                request.getRequestDispatcher("login.jsp").include(request, response);
            } else if (!validator.validatePassword(password)){
                session.setAttribute("Pass_err", "Error: Password format incorrect");
                request.getRequestDispatcher("login.jsp").include(request, response);                
            } else {
            
                try {       
                       customer = manager.findCustomer(email, password);
                       if (customer != null) {
                           session.setAttribute("customer", customer);
                           request.getRequestDispatcher("main.jsp").include(request, response); 
                           response.sendRedirect("main.jsp");
                       } else {
                           session.setAttribute("Exist_err", "Customer does not exist in the Database!");
                           request.getRequestDispatcher("login.jsp").include(request, response);
                           response.sendRedirect("login.jsp"); //sends redirect
                          
                       }
                       
                } catch (SQLException | NullPointerException ex) {           
                      Logger.getLogger(LoginCustomerServlet.class.getName()).log(Level.SEVERE, null, ex); 
                 //     System.out.println(ex.getMessage() == null ? "Customer does not exist" : "welcome"); 
                }  
                
            }
        
        
        
    }
}
