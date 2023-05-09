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

public class ProductUpdateServlet extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            HttpSession session = request.getSession();
            DBManager manager = (DBManager) session.getAttribute("manager"); 
            
            int product_ID = Integer.parseInt(request.getParameter("product_ID"));
            String product_Name = request.getParameter("product_Name");
            String product_Description = request.getParameter("product_Description");
            String product_Model = request.getParameter("product_Model");
            String product_Type = request.getParameter("product_Type");
            String product_Manufacturer = request.getParameter("product_Manufacturer");
            String product_Features = request.getParameter("product_Features");
            String product_Powersource = request.getParameter("product_Powersource");
            String product_Dimensions = request.getParameter("product_Dimensions");
            double product_Weight = Double.parseDouble(request.getParameter("product_Weight"));
            String product_Warranty = request.getParameter("product_Warranty");
            String product_Image = request.getParameter("product_Image"); 
            double product_Price = Double.parseDouble(request.getParameter("product_Price"));
            int product_Stock = Integer.parseInt(request.getParameter("product_Stock"));
            boolean product_Avail = Boolean.parseBoolean(request.getParameter("product_Avail"));
            String product_Category = request.getParameter("product_Category");
            double product_Discount = Double.parseDouble(request.getParameter("product_Discount"));
            String last_Edited_By = request.getParameter("last_Edited_By"); 
            
            session.setAttribute("product", null);
            session.setAttribute("updated", null);
            
            try {
                Boolean check = manager.checkProduct_ID(product_ID);
                if (check) {
                    manager.updateProduct(product_ID, product_Name, product_Description, product_Model, product_Type, product_Manufacturer, product_Features, product_Powersource, product_Dimensions, product_Weight, product_Warranty, product_Image, product_Price, product_Stock, product_Avail, product_Category, product_Discount, last_Edited_By);
                           
                    Product product = manager.getProduct(product_Name);
                    session.setAttribute("product", product);
                    session.setAttribute("updated", "Product has been updated");
                    
                    request.getRequestDispatcher("product_update.jsp").include(request, response);
                    response.sendRedirect("product_update.jsp");
                } else {  
                    Product product = manager.getProduct(product_Name);
                    session.setAttribute("product",product);
                    session.setAttribute("updated", "Product has NOT been updated");
                    
                    request.getRequestDispatcher("product_update.jsp").include(request, response);
                    response.sendRedirect("product_update.jsp");           
                }
            } catch (SQLException ex){
                Logger.getLogger(ProductUpdateServlet.class.getName()).log(Level.SEVERE, null, ex); 
            }
        }
}
