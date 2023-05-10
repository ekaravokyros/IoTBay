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
}
