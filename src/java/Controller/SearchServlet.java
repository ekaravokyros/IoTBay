//this servlet is supposed to display the information found in the actual database     
 
     package Controller;

     import java.io.IOException;
     import java.sql.SQLException;
     import javax.servlet.ServletException;
     import javax.servlet.http.HttpServlet;
     import javax.servlet.http.HttpServletRequest;
     import javax.servlet.http.HttpServletResponse;
     import javax.servlet.http.HttpSession;
     import Model.Order;
     import DAO.DBManager;
import java.util.logging.Level;
import java.util.logging.Logger;

 

     public class SearchServlet extends HttpServlet {
   

     @Override   
     protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {
         HttpSession session = request.getSession();
         DBManager manager = (DBManager) session.getAttribute("manager");
         session.setAttribute("order", null);
         session.setAttribute("search", null);
         String a = request.getParameter("ORDERID");
         int ORDERID = Integer.parseInt(a);
         
         
         try {
             Order order = manager.findOrder(ORDERID);
             if(manager.checkORDERID(ORDERID)){
                 session.setAttribute("orders", order);
                    request.getRequestDispatcher("order_search.jsp").include(request, response);
                    session.setAttribute("display", "Order");
                    response.sendRedirect("order_search.jsp");
             
                 
             }else {session.setAttribute("search", "Order does NOT exist");
                    request.getRequestDispatcher("order_history.jsp").include(request, response);
                    response.sendRedirect("order_history.jsp");}

               
         } catch (SQLException | NullPointerException ex) {
             Logger.getLogger(ProductSearchServlet.class.getName()).log(Level.SEVERE, null, ex); 
         }
     }       

         

      }