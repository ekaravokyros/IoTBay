/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.DBManager;
import Model.Customer;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dsake
 */
public class UserSearchServlet extends HttpServlet {
    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            HttpSession session = request.getSession();
            DBManager manager = (DBManager) session.getAttribute("manager"); 
            
            session.setAttribute("customer", null);
            session.setAttribute("result", null);
            
            String customer_firstname = request.getParameter("customer_firstname");
            try {
                boolean check = manager.checkCustomer_firstname(customer_firstname);
                if (check){
                    Customer customer = manager.getCustomer(customer_firstname);
                    session.setAttribute("customer", customer);
                    
                    request.getRequestDispatcher("user_search.jsp").include(request, response);
                    response.sendRedirect("user_options.jsp");
                } else {
                    session.setAttribute("result", "User does NOT exist");
                    request.getRequestDispatcher("user_search.jsp").include(request, response);
                    response.sendRedirect("user_search.jsp");
                }
            } catch (SQLException ex){
                Logger.getLogger(UserSearchServlet.class.getName()).log(Level.SEVERE, null, ex); 
            }
        }
    }
