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
public class User implements Serializable {
    protected List<List<String>> customers_list;

    public User() {
        customers_list = new ArrayList<>();
    }
    public List<List<String>> getCustomers() {
        return customers_list;
    }
}
