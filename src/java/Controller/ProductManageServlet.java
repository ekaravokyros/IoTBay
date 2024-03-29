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
 * @author NICHOLAS SMITH 11378054
 */

public class ProductManageServlet extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            HttpSession session = request.getSession();
            DBManager manager = (DBManager) session.getAttribute("manager");

            session.setAttribute("result", null);
            session.setAttribute("confirm_msg", null);
            try {
                request.getRequestDispatcher("product_manage.jsp").include(request, response);
                response.sendRedirect("product_manage.jsp");
            } catch (IOException ex){
                Logger.getLogger(ProductManageServlet.class.getName()).log(Level.SEVERE, null, ex); 
            }
    }
}
