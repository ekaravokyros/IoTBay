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
    
//START OF CODE AUTHORED BY NICHOLAS SMITH 11378054
    public void addProduct (int product_ID, String product_Name, String product_Description, String product_Model, String product_Type, String product_Manufacturer, String product_Features, String product_Powersource, String product_Dimensions, double product_Weight, String product_Warranty, String product_Image, double product_Price, int product_Stock, boolean product_Avail, String product_Category, double product_Discount, String last_Edited_By)
            throws SQLException {
        String query = "INSERT INTO JB.PRODUCTS VALUES ("+product_ID+","+product_Name+","+product_Description+","+product_Model+","+product_Type+","+product_Manufacturer+","+product_Features+","+product_Powersource+","+product_Dimensions+","+product_Weight+","+product_Warranty+","+product_Image+","+product_Price+","+product_Stock+","+product_Avail+","+product_Category+","+product_Discount+","+last_Edited_By+"')";
        st.executeUpdate(query);               
    }
    
    public void updateProduct (int product_ID, String product_Name, String product_Description, String product_Model, String product_Type, String product_Manufacturer, String product_Features, String product_Powersource, String product_Dimensions, double product_Weight, String product_Warranty, String product_Image, double product_Price, int product_Stock, boolean product_Avail, String product_Category, double product_Discount, String last_Edited_By)
            throws SQLException {
        st.executeUpdate("UPDATE JB.PRODUCTS SET PRODUCT_NAME = ("+product_Name+"), PRODUCT_DESCRIPTION  = ("+product_Description+"), PRODUCT_MODEL = ("+product_Model+"), PRODUCT_TYPE = ("+product_Type+"), PRODUCT_MANUFACTURER = ("+product_Manufacturer+"), PRODUCT_FEATURES = ("+product_Features+"), PRODUCT_POWERSOURCE = ("+product_Powersource+"), PRODUCT_DIMENSIONS = ("+product_Dimensions+"), PRODUCT_WEIGHT = ("+product_Weight+"), PRODUCT_WARRANTY = ("+product_Warranty+"), PRODUCT_IMAGE = ("+product_Image+"), PRODUCT_PRICE = ("+product_Price+"), PRODUCT_STOCK = ("+product_Stock+"), PRODUCT_AVAIL = ("+product_Avail+"), PRODUCT_CATEGORY = ("+product_Category+"), PRODUCT_DISCOUNT = ("+product_Discount+"), LAST_EDITED_BY = ("+last_Edited_By+") WHERE PRODUCT ID=("+product_ID+")");
    }
    
    public void deleteProduct(int product_ID)
            throws SQLException {
        st.executeUpdate("DELETE FROM JB.PRODUCTS WHERE (PRODUCT_ID) = '"+product_ID+"'");
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
            String product_Features = rs.getString(7);
            String product_Powersource = rs.getString(8);
            String product_Dimensions = rs.getString(9);
            double product_Weight = rs.getDouble(10);
            String product_Warranty = rs.getString(11);
            String product_Image = rs.getString(12);
            double product_Price = rs.getDouble(13);
            int product_Stock = rs.getInt(14);
            boolean product_Avail = rs.getBoolean(15);
            String product_Category = rs.getString(16);
            double product_Discount = rs.getDouble(17);
            String last_Edited_By = rs.getString(18);  
            
            products.add(new Product(product_ID, product_Name, product_Description, product_Model, product_Type, product_Manufacturer, product_Features, product_Powersource, product_Dimensions, product_Weight, product_Warranty, product_Image, product_Price, product_Stock, product_Avail, product_Category, product_Discount, last_Edited_By));
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
        String query = "SELECT * FROM JB.PRODUCTS WHERE (PRODUCT_ID) = '"+product_ID+"'";
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
            String product_Features = rs.getString(7);
            String product_Powersource = rs.getString(8);
            String product_Dimensions = rs.getString(9);
            double product_Weight = rs.getDouble(10);
            String product_Warranty = rs.getString(11);
            String product_Image = rs.getString(12);
            double product_Price = rs.getDouble(13);
            int product_Stock = rs.getInt(14);
            boolean product_Avail = rs.getBoolean(15);
            String product_Category = rs.getString(16);
            double product_Discount = rs.getDouble(17);
            String last_Edited_By = rs.getString(18);  
            
            return new Product(product_ID, product_Name, product_Description, product_Model, product_Type, product_Manufacturer, product_Features, product_Powersource, product_Dimensions, product_Weight, product_Warranty, product_Image, product_Price, product_Stock, product_Avail, product_Category, product_Discount, last_Edited_By);
        }
        return null; 
    }

//END OF CODE AUTHORED BY NICHOLAS SMITH 11378054
}
