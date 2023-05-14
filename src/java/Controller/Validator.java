/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.io.Serializable;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpSession;
import java.lang.NumberFormatException;

public class Validator implements Serializable{ 
    
    public Validator() {    
    }

//--------------------START OF CODE AUTHORED BY NICHOLAS SMITH 11378054 --------------------
    public static boolean validateInt (String input) {
        try {
            Integer.parseInt(input);
            return true;            
        } catch (NumberFormatException e){
            return false;
        }
    }
    
    public static boolean validateDouble (String input) {
        try {
            Double.parseDouble(input);
            return true;            
        } catch (NumberFormatException e){
            return false;
        }
    }
    
    public static boolean val_greater_zero (String input) {
        return Double.parseDouble(input) > 0;
    }
    
    public static boolean val_greater_equal_zero (String input) {
        return Integer.parseInt(input) >= 0;
    }
    
    public static boolean val_isStringEmpty(String input) {
        return input.trim().isEmpty();
    }
    public void clear(HttpSession session) {
        session.setAttribute("Name_err", null);
        session.setAttribute("Weight_err", null);
        session.setAttribute("Price_err", null);
        session.setAttribute("Stock_err", null);
    }
//--------------------END OF CODE AUTHORED BY NICHOLAS SMITH 11378054 --------------------
    
}
