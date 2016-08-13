/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods4;
import java.util.Scanner;
/**
 *
 * @author chris
 */
public class Methods4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text;
        text = displayMessage();
        System.out.println("text is: " + text);
        
    }
    
    public static String displayMessage() {
        String text = "This is a return value!";
        return text;
    }
}
