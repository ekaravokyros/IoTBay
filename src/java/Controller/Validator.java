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
    
    //Following patterns are equalivent to each string type.
    private String emailPattern = "([a-zA-Z0-9]+)(([._-])([a-zA-Z0-9]+))*(@)([a-z]+)(.)([a-z]{3})((([.])[a-z]{0,2})*)";      
    private String namePattern = "([A-Z][a-z]+[\\s])+[A-Z][a-z]*";       
    private String passwordPattern = "[a-z0-9]{4,}";       
    
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
//        session.setAttribute("OrderID_error", null);

        session.setAttribute("Email_err", "Enter email");
        session.setAttribute("Pass_err", "Enter password");
        session.setAttribute("Exist_err", "");
    }
    
//--------------------END OF CODE AUTHORED BY NICHOLAS SMITH 11378054 --------------------
    
    
    
//--------------------START OF CODE AUTHORED BY EVELYN KARAVOKYROS 14244608 --------------------
    
    //Validator for login 
    
    public boolean validate(String pattern, String input){       
        Pattern regEx = Pattern.compile(pattern);       
        Matcher match = regEx.matcher(input);       
        return match.matches(); 
    }       
 
    public boolean checkEmpty(String email, String password){       
        return  email.isEmpty() || password.isEmpty();   
    }
   
    public boolean validateEmail(String email){                       
        return validate(emailPattern, email);   
    }
       
    public boolean validateName(String name){
        return validate(namePattern, name); 
    }       
   
    public boolean validatePassword(String password){
        return validate(passwordPattern, password); 
    }          
    
    
  
    
}
