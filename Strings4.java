/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings4;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class Strings4 {

    /**
     * comparing 2 strings
     */
    public static void main(String[] args) {
        String a,b,input;
        
        a = JOptionPane.showInputDialog("Enter string a: ");
        b = JOptionPane.showInputDialog("Enter string b: ");
        
        if (a.equals(b) ) {
            JOptionPane.showMessageDialog(null," Strings match");
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Strings do not match");
        }
        
        
        
    }
    
}
