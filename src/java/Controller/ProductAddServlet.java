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

/**
 *
 * @author nrsmi
 */
public class ProductAddServlet extends HttpServlet{
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            HttpSession session = request.getSession();
            DBManager manager = (DBManager) session.getAttribute("manager");
            
            Validator validator = new Validator();
            validator.clear(session);
            session.setAttribute("confirm_msg", null);
            
            String str_Weight = request.getParameter("product_Weight");
            String str_Price = request.getParameter("product_Price");
            String str_Stock = request.getParameter("product_Stock");
            String product_Name = request.getParameter("product_Name");
            //Validation of input parameters name, weight, price and stock
            if (validator.val_isStringEmpty(product_Name)) {
                session.setAttribute("Name_err", "Error: Cannot be blank");
                request.getRequestDispatcher("product_addItem.jsp").include(request, response);
            } else if (!validator.validateDouble(str_Weight)) {
                session.setAttribute("Weight_err", "Error: Weight format incorrect");
                request.getRequestDispatcher("product_addItem.jsp").include(request, response);
            } else if (!validator.validateDouble(str_Price)) {
                session.setAttribute("Price_err", "Error: Price format incorrect");
                request.getRequestDispatcher("product_addItem.jsp").include(request, response);                
            } else if (!validator.validateInt(str_Stock)) {
                session.setAttribute("Stock_err", "Error: Stock format incorrect");
                request.getRequestDispatcher("product_addItem.jsp").include(request, response);

            } else if (!validator.val_greater_zero(str_Weight)) {
                session.setAttribute("Weight_err", "Error: Weight must be greater than zero");
                request.getRequestDispatcher("product_update.jsp").include(request, response);    
            } else if (!validator.val_greater_zero(str_Price)) {
                session.setAttribute("Price_err", "Error: Price must be greater than zero)");
                request.getRequestDispatcher("product_update.jsp").include(request, response);       
            } else if (!validator.val_greater_equal_zero(str_Stock)) {
                session.setAttribute("Stock_err", "Error: Stock must be greater than or equal to zero");
                request.getRequestDispatcher("product_update.jsp").include(request, response);  

            } else {
            //Get new product info from product_addItem.jsp
                String product_Description = request.getParameter("product_Description");
                String product_Model = request.getParameter("product_Model");
                String product_Type = request.getParameter("product_Type");
                String product_Manufacturer = request.getParameter("product_Manufacturer");
                String product_Powersource = request.getParameter("product_Powersource");
                double product_Weight = Double.parseDouble(request.getParameter("product_Weight"));
                String product_Warranty = request.getParameter("product_Warranty");
                double product_Price = Double.parseDouble(request.getParameter("product_Price"));
                int product_Stock = Integer.parseInt(request.getParameter("product_Stock"));
                boolean product_Avail = Boolean.parseBoolean(request.getParameter("product_Avail"));
                String last_Edited_By = request.getParameter("last_Edited_By");                    

                
                try {
                    //Check if name already exists in database. If it doesn't, add product otherwise return error message
                    Boolean check = manager.checkProduct_Name(product_Name);
                    if (!check ) {
                        manager.addProduct(product_Name, product_Description, product_Model, product_Type, product_Manufacturer, product_Powersource, product_Weight, product_Warranty, product_Price, product_Stock, product_Avail, last_Edited_By);
                        session.setAttribute("confirm_msg", "Product has been added to the Store");
                        request.getRequestDispatcher("product_addItem.jsp").include(request, response);
                        response.sendRedirect("product_result.jsp");
                    } else {
                        session.setAttribute("confirm_msg", "Error! Product Name already exists, it has NOT been added to the Store");
                        request.getRequestDispatcher("product_addItem.jsp").include(request, response);
                        response.sendRedirect("product_addItem.jsp");
                    }
                } catch (SQLException ex){
                    Logger.getLogger(ProductAddServlet.class.getName()).log(Level.SEVERE, null, ex); 
                }
            } 
        }
}
