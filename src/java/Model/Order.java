/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.Serializable;
//import java.text.NumberFormat;
/**
 *
 * @author nrsmi
 */

public class Order implements Serializable {
    private int ORDERID;
    private String PRODUCTNAME;
    private int PRODUCT_ID;
    private double PRICE;

    public Order(int ORDERID, String PRODUCTNAME, int PRODUCT_ID, double PRICE) {
        this.ORDERID = ORDERID;
        this.PRODUCTNAME = PRODUCTNAME;
        this.PRODUCT_ID = PRODUCT_ID;
        this.PRICE = PRICE;
    }

    public int getORDERID() {
        return ORDERID;
    }

    public void setORDERID(int ORDERID) {
        this.ORDERID = ORDERID;
    }

    public String getPRODUCTNAME() {
        return PRODUCTNAME;
    }

    public void setPRODUCTNAME(String PRODUCTNAME) {
        this.PRODUCTNAME = PRODUCTNAME;
    }

    public int getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(int PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }


    public double getPRICE() {
        return PRICE;
    }

    public void setPRICE(double PRICE) {
        this.PRICE = PRICE;
    }
    
}
