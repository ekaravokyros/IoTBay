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

public class ProductDeleteServlet extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            HttpSession session = request.getSession();
            DBManager manager = (DBManager) session.getAttribute("manager");
            
            int product_ID = Integer.parseInt(request.getParameter("product_ID"));
            System.out.println(product_ID);
            
            try {
                Boolean check = manager.checkProduct_ID(product_ID);
                
                if (check) {
                    manager.deleteProduct(product_ID);                        
                    session.setAttribute("msg_delete", "Product has been deleted");                    
                    request.getRequestDispatcher("product_delete.jsp").include(request, response);
                    
                } else {  
                    session.setAttribute("msg_delete", "Product has NOT been deleted");                   
                    request.getRequestDispatcher("product_delete.jsp").include(request, response);
                            
                }
            } catch (SQLException ex){
                Logger.getLogger(ProductDeleteServlet.class.getName()).log(Level.SEVERE, null, ex); 
            }
        response.sendRedirect("product_delconfirm.jsp");    
        }
}

    