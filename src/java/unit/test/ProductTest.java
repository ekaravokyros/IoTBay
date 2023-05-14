/**
 *
 * @author NICHOLAS SMITH 11378054
 */
package unit.test;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import DAO.*;
import Model.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ProductTest {   
    private DBConnector connector;
    private Connection conn;
    private DBManager db;    
    
    public ProductTest(){
        try {
            connector = new DBConnector();
            conn = connector.openConnection();
            db = new DBManager(conn);
        } catch (ClassNotFoundException | SQLException ex) {       
            Logger.getLogger(ProductTest.class.getName()).log(Level.SEVERE, null, ex);          
        }
    }
    
    @Test
    public void A_testCreateProduct(){
        String product_Name =  "Soil Moisture Sensor"; 
        try {
            db.addProduct("Soil Moisture Sensor","A sensor to measure the moisture content in soil","YL-69","Sensor","Keyestudio","3.3V - 5V",5,"1 year",1.99,150,true,"");
            Boolean check = db.checkProduct_Name(product_Name);
            assertTrue(check);
        } catch (SQLException ex) {
            Logger.getLogger(ProductTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void B_testReadProduct () {
        String product_Name =  "Soil Moisture Sensor"; 
        try {
            Product product = db.getProduct(product_Name);
            assertNotNull(product);
        } catch (SQLException ex) {
            Logger.getLogger(ProductTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Test
    public void C_testUpdateProduct(){
        String product_Name =  "Soil Moisture Sensor"; 
        //Stock value to be updated, all other values remain the same
        int updated_stock = 100;
        try {
            Product product = db.getProduct(product_Name);
            int product_ID = product.getProduct_ID();
            db.updateProduct(product_ID,"Soil Moisture Sensor","A sensor to measure the moisture content in soil","YL-69","Sensor","Keyestudio","3.3V - 5V",5,"1 year",1.99,updated_stock,true,"");
            product = db.getProduct(product_Name);
            assertEquals(updated_stock , product.getProduct_Stock());
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Boolean check = db.checkProduct_Name(product_Name);
            assertTrue(check);
        } catch (SQLException ex) {
            Logger.getLogger(ProductTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void D_testDeleteProduct() {
        String product_Name =  "Soil Moisture Sensor"; 
        try {
            Product product = db.getProduct(product_Name);
            db.deleteProduct(product.getProduct_ID()); 
            Boolean check = db.checkProduct_Name(product_Name);
            assertFalse(check);
        } catch (SQLException ex) {
            Logger.getLogger(ProductTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
