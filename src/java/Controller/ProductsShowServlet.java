/**
 *
 * @author NICHOLAS SMITH 11378054
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
import java.util.ArrayList;

public class ProductsShowServlet extends HttpServlet{
       
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            HttpSession session = request.getSession();
            DBManager manager = (DBManager) session.getAttribute("manager");
            
            try {
                ArrayList<Product> products = manager.showProducts();
                if (products != null) {
                    session.setAttribute("products", products);
                    request.getRequestDispatcher("product_show.jsp").include(request, response);
                    session.setAttribute("display", "IoTBay Products");
                    response.sendRedirect("product_show.jsp");
                } else {
                    request.getRequestDispatcher("product_show.jsp").include(request, response);
                    session.setAttribute("display", "Products do not exist");
                    response.sendRedirect("product_manage.jsp");
                }
            } catch (SQLException ex){
                Logger.getLogger(ProductsShowServlet.class.getName()).log(Level.SEVERE, null, ex); 
                
            }
       }
}
