/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nrsmi
 */

public class Customer implements Serializable {
    private String email;
    private String password;
    private String fname;
    private String lname;
    private String address;
    private String city;
    private String state;
    private String pcode;
    private String number;

    public Customer(){
        
    }
    
    public Customer(String fname, String lname, String email, String password, String number) {
        this.email = email;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
//        this.address = address;
//        this.city = city;
//        this.state = state;
//        this.pcode = pcode;
        this.number = number;
        }
    
   public Customer(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
//    public void addCustomer (List<String> customer){
//        customers_list.add(customer);
//    }
//    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getnumber() {
        return number;
    }

    public void setnumber(String pnumber) {
        this.number = pnumber;
    }
    
    
}