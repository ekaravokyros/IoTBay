//package Controller.*;

 

  import java.io.IOException;

     import java.sql.SQLException;

     import java.util.logging.Level;

     import java.util.logging.Logger;

     import javax.servlet.ServletException;

     import javax.servlet.http.HttpServlet;

     import javax.servlet.http.HttpServletRequest;

     import javax.servlet.http.HttpServletResponse;

     import javax.servlet.http.HttpSession;

     import Model.Order;

     import DAO.ORDERDBManager;

 

     public class SearchServlet extends HttpServlet {
   

     @Override   

     protected void doPost(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {
         HttpSession session = request.getSession();
         int ORDERID = Integer.parseInt(request.getParameter("ORDERID"));
         ORDERDBManager manager = (ORDERDBManager) session.getAttribute("manager");
         Order order = null;
         
         
         try {
             if(!manager.checkORDERID(ORDERID)){
                 session.setAttribute("Error", order);
                 request.getRequestDispatcher("order_history.jsp");
             }else if(manager.checkORDERID(ORDERID)){
                 session.setAttribute("order", order);
                 request.getRequestDispatcher("order_search.jsp");
             }
         } catch (SQLException | NullPointerException ex) {
             System.out.println(ex.getMessage() == null ? "OrderID does not exist" : "Welcome");
         }
     }       

         

      }