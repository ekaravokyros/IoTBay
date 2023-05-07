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

//END OF CODE AUTHORED BY NICHOLAS SMITH 11378054
}
