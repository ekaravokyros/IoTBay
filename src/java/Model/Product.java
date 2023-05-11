/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;
import java.io.Serializable;

/**
 *
 * @author nrsmi
 */

public class Product implements Serializable {
    // product fields
    private int product_ID;
    private String product_Name;
    private String product_Description;
    private String product_Model;
    private String product_Type;
    private String product_Manufacturer;
    private String product_Powersource;
    private double product_Weight;
    private String product_Warranty;
    private double product_Price;
    private int product_Stock;
    private boolean product_Avail;
    private String last_Edited_By;
    
    public Product (){
    }

    public Product(int product_ID, String product_Name, String product_Description, String product_Model, String product_Type, String product_Manufacturer, String product_Powersource, double product_Weight, String product_Warranty, double product_Price, int product_Stock, boolean product_Avail,String last_Edited_By) {
        this.product_ID = product_ID;
        this.product_Name = product_Name;
        this.product_Description = product_Description;
        this.product_Model = product_Model;
        this.product_Type = product_Type;
        this.product_Manufacturer = product_Manufacturer;
        this.product_Powersource = product_Powersource;
        this.product_Weight = product_Weight;
        this.product_Warranty = product_Warranty;
        this.product_Price = product_Price;
        this.product_Stock = product_Stock;
        this.product_Avail = product_Avail;
        this.last_Edited_By = last_Edited_By;
    }

    public int getProduct_ID() {
        return product_ID;
    }

    public void setProduct_ID(int product_ID) {
        this.product_ID = product_ID;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public String getProduct_Description() {
        return product_Description;
    }

    public void setProduct_Description(String product_Description) {
        this.product_Description = product_Description;
    }

    public String getProduct_Model() {
        return product_Model;
    }

    public void setProduct_Model(String product_Model) {
        this.product_Model = product_Model;
    }

    public String getProduct_Type() {
        return product_Type;
    }

    public void setProduct_Type(String product_Type) {
        this.product_Type = product_Type;
    }

    public String getProduct_Manufacturer() {
        return product_Manufacturer;
    }

    public void setProduct_Manufacturer(String product_Manufacturer) {
        this.product_Manufacturer = product_Manufacturer;
    }

    public String getProduct_Powersource() {
        return product_Powersource;
    }

    public void setProduct_Powersource(String product_Powersource) {
        this.product_Powersource = product_Powersource;
    }

    public double getProduct_Weight() {
        return product_Weight;
    }

    public void setProduct_Weight(double product_Weight) {
        this.product_Weight = product_Weight;
    }

    public String getProduct_Warranty() {
        return product_Warranty;
    }

    public void setProduct_Warranty(String product_Warranty) {
        this.product_Warranty = product_Warranty;
    }

    public double getProduct_Price() {
        return product_Price;
    }

    public void setProduct_Price(double product_Price) {
        this.product_Price = product_Price;
    }

    public int getProduct_Stock() {
        return product_Stock;
    }

    public void setProduct_Stock(int product_Stock) {
        this.product_Stock = product_Stock;
    }

    public boolean isProduct_Avail() {
        return product_Avail;
    }

    public void setProduct_Avail(boolean product_Avail) {
        this.product_Avail = product_Avail;
    }

    public String getLast_Edited_By() {
        return last_Edited_By;
    }

    public void setLast_Edited_By(String last_Edited_By) {
        this.last_Edited_By = last_Edited_By;
    }
    
    
}

