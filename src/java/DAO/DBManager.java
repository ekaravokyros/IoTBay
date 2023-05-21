/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.*;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author nrsmi
 */
public class DBManager {
    private Statement st;

    public DBManager(Connection conn) throws SQLException {       
       st = conn.createStatement();   
    }
    
//--------------------START OF CODE AUTHORED BY NICHOLAS SMITH 11378054 --------------------
    public void addProduct (String product_Name, String product_Description, String product_Model, String product_Type, String product_Manufacturer, String product_Powersource, double product_Weight, String product_Warranty, double product_Price, int product_Stock, boolean product_Avail, String last_Edited_By)
            throws SQLException {
        String query = "INSERT INTO JB.PRODUCTS VALUES ((SELECT COALESCE(MAX(PRODUCT_ID), 0) + 1 FROM JB.PRODUCTS),'"+product_Name+"','"+product_Description+"','"+product_Model+"','"+product_Type+"','"+product_Manufacturer+"','"+product_Powersource+"',"+product_Weight+",'"+product_Warranty+"',"+product_Price+","+product_Stock+","+product_Avail+",'"+last_Edited_By+"')";
        st.executeUpdate(query);    
    }
    
    public void updateProduct (int product_ID, String product_Name, String product_Description, String product_Model, String product_Type, String product_Manufacturer, String product_Powersource, double product_Weight, String product_Warranty, double product_Price, int product_Stock, boolean product_Avail, String last_Edited_By)
            throws SQLException {
        st.executeUpdate("UPDATE JB.PRODUCTS SET PRODUCT_NAME = '"+product_Name+"', PRODUCT_DESCRIPTION  = '"+product_Description+"', PRODUCT_MODEL = '"+product_Model+"', PRODUCT_TYPE = '"+product_Type+"', PRODUCT_MANUFACTURER = '"+product_Manufacturer+"', PRODUCT_POWERSOURCE = '"+product_Powersource+"', PRODUCT_WEIGHT = "+product_Weight+", PRODUCT_WARRANTY = '"+product_Warranty+"', PRODUCT_PRICE = "+product_Price+", PRODUCT_STOCK = "+product_Stock+", PRODUCT_AVAIL = "+product_Avail+", LAST_EDITED_BY = '"+last_Edited_By+"' WHERE PRODUCT_ID="+product_ID+"");
    }
    
    public void deleteProduct(int product_ID)
            throws SQLException {
        st.executeUpdate("DELETE FROM JB.PRODUCTS WHERE PRODUCT_ID = "+product_ID);
    } 
    
    public ArrayList<Product> showProducts() 
            throws SQLException {
        String query = "SELECT * FROM JB.PRODUCTS ORDER BY PRODUCT_ID";
        ResultSet rs = st.executeQuery(query);
        ArrayList<Product> products = new ArrayList();
        while (rs.next()) {
            int product_ID = rs.getInt(1);
            String product_Name = rs.getString(2);
            String product_Description = rs.getString(3);
            String product_Model = rs.getString(4);
            String product_Type = rs.getString(5); 
            String product_Manufacturer = rs.getString(6);
            String product_Powersource = rs.getString(7);
            double product_Weight = rs.getDouble(8);
            String product_Warranty = rs.getString(9);
            double product_Price = rs.getDouble(10);
            int product_Stock = rs.getInt(11);
            boolean product_Avail = rs.getBoolean(12);
            String last_Edited_By = rs.getString(13);  
            
            products.add(new Product(product_ID, product_Name, product_Description, product_Model, product_Type, product_Manufacturer, product_Powersource, product_Weight, product_Warranty, product_Price, product_Stock, product_Avail, last_Edited_By));
        }
        return products; 
    }
    public boolean checkProduct_Name(String product_search) 
            throws SQLException {
        String query = "SELECT * FROM JB.PRODUCTS WHERE (PRODUCT_NAME) = '"+product_search+"'";
        ResultSet rs = st.executeQuery(query);
        
        while (rs.next()) {
            String product_Name = rs.getString(2);
            
            if (product_Name.equals(product_search)){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkProduct_ID(int product_ID) 
            throws SQLException {
        String query = "SELECT * FROM JB.PRODUCTS WHERE (PRODUCT_ID) = "+ product_ID;
        ResultSet rs = st.executeQuery(query);
        
        while (rs.next()) {
            int ID = rs.getInt(1);
            if (ID == product_ID){
                return true;
            }
        }
        return false;
    }
    
    public Product getProduct (String product_search)
            throws SQLException {
        String query = "SELECT * FROM JB.PRODUCTS WHERE (PRODUCT_NAME) = '"+product_search+"'";
        ResultSet rs = st.executeQuery(query);      
        while (rs.next()) {
            int product_ID = rs.getInt(1);
            String product_Name = rs.getString(2);
            String product_Description = rs.getString(3);
            String product_Model = rs.getString(4);
            String product_Type = rs.getString(5); 
            String product_Manufacturer = rs.getString(6);
            String product_Powersource = rs.getString(7);
            double product_Weight = rs.getDouble(8);
            String product_Warranty = rs.getString(9);
            double product_Price = rs.getDouble(10);
            int product_Stock = rs.getInt(11);
            boolean product_Avail = rs.getBoolean(12);
            String last_Edited_By = rs.getString(13);  
            
            return new Product(product_ID, product_Name, product_Description, product_Model, product_Type, product_Manufacturer, product_Powersource, product_Weight, product_Warranty, product_Price, product_Stock, product_Avail, last_Edited_By);
        }
        return null; 
    }

//--------------------END OF CODE AUTHORED BY NICHOLAS SMITH 11378054 --------------------
    
//--------------------START OF CODE AUTHORED BY EVELYN KARAVOKYROS 14244608 --------------------

    //Finding customer via the email & password provided in the database
    
    public Customer findCustomer(String email, String password) throws SQLException {   
        
        //Setting up select sql query string 
        String fetch = "select * from JB.CUSTOMER where CUSTOMER_EMAIL = '" + email + "' and CUSTOMER_PASSWORD = '" + password + "'"; 
        
        //Execute query using statement field and add results to a ResultSet
        ResultSet rs = st.executeQuery(fetch);
        
        //Search ResultSet for customer using following parameters
        while (rs.next()){
           String CUSTOMER_EMAIL = rs.getString(3);
           String CUSTOMER_PASSWORD = rs.getString(4);
           if (CUSTOMER_EMAIL.equals(email) && CUSTOMER_PASSWORD.equals(password)){
               String CUSTOMER_FIRSTNAME = rs.getString(1);
               String CUSTOMER_LASTNAME = rs.getString(2);
               String CUSTOMER_NUMBER = rs.getString(5);
               return new Customer (CUSTOMER_FIRSTNAME, CUSTOMER_LASTNAME, CUSTOMER_EMAIL, CUSTOMER_PASSWORD, CUSTOMER_NUMBER);
           }
        }              
        return null;   
    }
        
        //Add a customer details into  database   
        public void addCustomer(String firstname, String lastname, String email, String password) throws SQLException {  
            st.executeUpdate("INSERT INTO JB.CUSTOMER " + "VALUES ('" + firstname + "', '" + lastname + "', '" + email +  "', '" + password +"')" );   
        }
        
        //Update customer details in  database   
        public void updateCustomer(String firstname, String lastname, String email, String password) throws SQLException {       
            st.executeUpdate("UPDATE JB.CUSTOMER SET CUSTOMER_FIRSTNAME='"+ firstname + "', CUSTOMER_LASTNAME='" + lastname + "', CUSTOMER_EMAIL='" + email + "', CUSTOMER_PASSWORD='" + password +  "'" );
        }     
        
        //Delete customer from  database   
        public void deleteCustomer(String email) throws SQLException{       
            st.executeUpdate("DELETE FROM JB.CUSTOMER WHERE CUSTOMER_EMAIL ='" + email + "'");
        }
        
        //Checking if customer exists
        public boolean checkCustomer(String email, String password) throws SQLException {
            String fetch = "SELECT * FROM JB.CUSTOMER where CUSTOMER_EMAIL ='" + email + "'AND CUSTOMER_PASSWORD='" + password + "'";
            ResultSet rs = st.executeQuery(fetch);

            while (rs.next()) {
               String CUSTOMER_EMAIL = rs.getString(3);
               String CUSTOMER_PASSWORD = rs.getString(4);
               if (CUSTOMER_EMAIL.equals(email) && CUSTOMER_PASSWORD.equals(password)){
                   return true;
               }
            }
            return false;
        }
           
        public ArrayList<Customer> fetchCustomers() throws SQLException {
        String fetch = "SELECT *  FROM JB.CUSTOMER";
        ResultSet rs = st.executeQuery(fetch);
        ArrayList<Customer>  temp = new ArrayList();
        
        while (rs.next()) {
            String CUSTOMER_FIRSTNAME = rs.getString(1);
            String CUSTOMER_LASTNAME = rs.getString(2);
            String CUSTOMER_EMAIL = rs.getString(3);
            String CUSTOMER_PASSWORD = rs.getString(4);
            String CUSTOMER_NUMBER = rs.getString(5);
            temp.add(new Customer (CUSTOMER_FIRSTNAME, CUSTOMER_LASTNAME, CUSTOMER_EMAIL, CUSTOMER_PASSWORD, CUSTOMER_NUMBER));
        }
        return temp;
    }
        
     // makes sure the order actually exists
    public Order findOrder(int ORDERID) throws SQLException {  
    String fetch = "select * from JB.ORDERS where (ORDERID) = '" + ORDERID +"'";
    ResultSet rs = st.executeQuery(fetch);
    
    while (rs.next()) {
        int newORDERID = rs.getInt(1);
        if(newORDERID == ORDERID){
            ORDERID = rs.getInt(1);
            String PRODUCTNAME = rs.getString(2);
            int PRODUCT_ID = rs.getInt(3);
            
            double PRICE = rs.getDouble(2);
            return new Order(ORDERID ,PRODUCTNAME, PRODUCT_ID, PRICE);
        }
    }
      return null;   
}


//Add an order to the database   
public void addOrder(int ORDERID, String PRODUCTNAME, int PRODUCT_ID, double PRICE) throws SQLException {                   //code for add-operation       
  st.executeUpdate("INSERT INTO JB.ORDERS" + "VALUES ('"+ORDERID+"','"+PRODUCT_ID+"','"+PRICE+"')");   

}
   

//deletes an order from the database   
public void deleteOrder(int newORDERID) throws SQLException{       
   //code for delete-operation   
    st.executeUpdate("DELETE FROM JB.ORDERS WHERE ORDERID = "+newORDERID); 
}

        


//this is the function used to update the database 
public void updateOrder(int ORDERID, String PRODUCTNAME, int PRODUCT_ID, double PRICE) throws SQLException {       
       //code for update-operation 
       st.executeUpdate("UPDATE JB.Orders SET NAME ='" + ORDERID + "', '" + PRODUCTNAME + "', '" + PRODUCT_ID + "','" + PRICE + "')");  
    }

//this is what is used to print out the database information
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
public boolean checkORDERID(int ORDERID)  //funtion that checks that the order id is in the database
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
