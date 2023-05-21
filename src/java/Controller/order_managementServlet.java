package Controller;

    import java.io.IOException;
    import java.sql.SQLException;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import javax.servlet.http.HttpSession;
    import DAO.DBManager;
    import Model.Order;
    import java.util.ArrayList;

public class order_managementServlet extends HttpServlet{
       
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            HttpSession session = request.getSession();
            DBManager manager = (DBManager) session.getAttribute("manager");
//            
            try {
                ArrayList<Order> orders = manager.fetchOrders();
                if (orders != null) {
                    session.setAttribute("orders", orders);
                    request.getRequestDispatcher("order_history.jsp").include(request, response);
                    session.setAttribute("display", "Orders");
                    response.sendRedirect("order_history.jsp");
                } 
            } catch (SQLException ex){
                Logger.getLogger(order_managementServlet.class.getName()).log(Level.SEVERE, null, ex); 
//                
            }
       }
}