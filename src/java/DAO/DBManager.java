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
    public int countProducts ()
            throws SQLException {
        String query = "SELECT COUNT(*) FROM JB.PRODUCTS";
        ResultSet rs = st.executeQuery(query);
        int count = 0;
        while (rs.next()) {
                count = rs.getInt(1);           
        }
        return count;
    }
//--------------------END OF CODE AUTHORED BY NICHOLAS SMITH 11378054 --------------------
}
