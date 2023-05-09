/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DAO.*;
import Model.Product;

/**
 *
 * @author nrsmi
 */

public class ProductSearchServlet extends HttpServlet {
    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            HttpSession session = request.getSession();
            DBManager manager = (DBManager) session.getAttribute("manager"); 
            
            session.setAttribute("product", null);
            session.setAttribute("result", null);
            
            String product_Name = request.getParameter("product_name");
            try {
                boolean check = manager.checkProduct_Name(product_Name);
                if (check){
                    Product product = manager.getProduct(product_Name);
                    session.setAttribute("product",product);
                    
                    request.getRequestDispatcher("product_search.jsp").include(request, response);
                    response.sendRedirect("product_options.jsp");
                } else {
                    session.setAttribute("result", "Product does NOT exist");
                    request.getRequestDispatcher("product_search.jsp").include(request, response);
                    response.sendRedirect("product_search.jsp");
                }
            } catch (SQLException ex){
                Logger.getLogger(ProductSearchServlet.class.getName()).log(Level.SEVERE, null, ex); 
            }
        }
    }
