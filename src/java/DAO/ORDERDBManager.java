package DAO;

import Model.Order;
import java.sql.*;
import java.util.ArrayList;
/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
*/

public class ORDERDBManager {

private Statement st;
   
public ORDERDBManager(Connection conn) throws SQLException {       
   st = conn.createStatement();   
}

//Find user by email and password in the database   
public Order findOrder(int ORDERID) throws SQLException {  
    String fetch = "select * from JB.ORDERS where ORDERID = '" + ORDERID +"'";
    ResultSet rs = st.executeQuery(fetch);
    
    while (rs.next()) {
        int newORDERID = rs.getInt(1);
        if(newORDERID == ORDERID){
            
            String PRODUCTNAME = rs.getString(2);
            int PRODUCT_ID = rs.getInt(3);
            
            double PRICE = rs.getDouble(2);
            return new Order(ORDERID ,PRODUCTNAME, PRODUCT_ID, PRICE);
        }
    }
      return null;   
}

//Add a user-data into the database   
public void addOrder(int ORDERID, String PRODUCTNAME, int PRODUCT_ID, double PRICE) throws SQLException {                   //code for add-operation       
  st.executeUpdate("INSERT INTO JB.ORDERS" + "VALUES ('"+ORDERID+"','"+PRODUCT_ID+"','"+PRICE+"')");   

}
   

//delete a user from the database   
public void deleteOrder(int newORDERID) throws SQLException{       
   //code for delete-operation   
st.executeUpdate("DELETE FROM JB.ORDERS WHERE ORDERID='"+newORDERID+"'");
}
public void updateOrder(int ORDERID,String PRODUCTNAME, int PRODUCT_ID, double PRICE) throws SQLException {       
       //code for update-operation 
       st.executeUpdate("UPDATE JB.Orders SET NAME ='" + ORDERID + "', '" + PRODUCTNAME + "', '" + PRODUCT_ID + "','" + PRICE + "')");  

    }

public ArrayList<Order> fetchOrders() throws SQLException{
    String fetch = "select * from JB.ORDERS ORDER BY ORDERID";
        ResultSet rs = st.executeQuery(fetch);
        ArrayList<Order> orders = new ArrayList();
        while (rs.next()){
        
            int ORDERID = rs.getInt(1);
            String PRODUCTNAME = rs.getString(2); 
            int PRODUCT_ID = rs.getInt(3);
            double PRICE = rs.getDouble(4);
            orders.add(new Order(ORDERID, PRODUCTNAME, PRODUCT_ID,PRICE));
        }
        return orders;
}
public boolean checkORDERID(int ORDERID) 
            throws SQLException {
        String query = "SELECT * FROM JB.ORDERS WHERE (ORDERID) = "+ ORDERID;
        ResultSet rs = st.executeQuery(query);
        
        while (rs.next()) {
            int ID = rs.getInt(1);
            if (ID == ORDERID){
                return true;
            }
        }
        return false;
    }

}
