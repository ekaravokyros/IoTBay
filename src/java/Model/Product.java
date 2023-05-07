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
    private String product_Features;
    private String product_Powersource;
    private String product_Dimensions;
    private double product_Weight;
    private String product_Warranty;
    private String product_Image; 
    private double product_Price;
    private int product_Stock;
    private boolean product_Avail;
    private String product_Category;
    private double product_Discount;
    private String last_Edited_By;
    
    public Product (){
    }

    public Product(int product_ID, String product_Name, String product_Description, String product_Model, String product_Type, String product_Manufacturer, String product_Features, String product_Powersource, String product_Dimensions, double product_Weight, String product_Warranty, String product_Image, double product_Price, int product_Stock, boolean product_Avail, String product_Category, double product_Discount, String last_Edited_By) {
        this.product_ID = product_ID;
        this.product_Name = product_Name;
        this.product_Description = product_Description;
        this.product_Model = product_Model;
        this.product_Type = product_Type;
        this.product_Manufacturer = product_Manufacturer;
        this.product_Features = product_Features;
        this.product_Powersource = product_Powersource;
        this.product_Dimensions = product_Dimensions;
        this.product_Weight = product_Weight;
        this.product_Warranty = product_Warranty;
        this.product_Image = product_Image;
        this.product_Price = product_Price;
        this.product_Stock = product_Stock;
        this.product_Avail = product_Avail;
        this.product_Category = product_Category;
        this.product_Discount = product_Discount;
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

    public String getProduct_Features() {
        return product_Features;
    }

    public void setProduct_Features(String product_Features) {
        this.product_Features = product_Features;
    }

    public String getProduct_Powersource() {
        return product_Powersource;
    }

    public void setProduct_Powersource(String product_Powersource) {
        this.product_Powersource = product_Powersource;
    }

    public String getProduct_Dimensions() {
        return product_Dimensions;
    }

    public void setProduct_Dimensions(String product_Dimensions) {
        this.product_Dimensions = product_Dimensions;
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

    public String getProduct_Image() {
        return product_Image;
    }

    public void setProduct_Image(String product_Image) {
        this.product_Image = product_Image;
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

    public String getProduct_Category() {
        return product_Category;
    }

    public void setProduct_Category(String product_Category) {
        this.product_Category = product_Category;
    }

    public double getProduct_Discount() {
        return product_Discount;
    }

    public void setProduct_Discount(double product_Discount) {
        this.product_Discount = product_Discount;
    }

    public String getLast_Edited_By() {
        return last_Edited_By;
    }

    public void setLast_Edited_By(String last_Edited_By) {
        this.last_Edited_By = last_Edited_By;
    }
    
    
}

