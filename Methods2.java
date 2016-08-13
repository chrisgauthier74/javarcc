/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods2;
import javax.swing.JOptionPane;
/**
 *
 * @author chris
 */
public class Methods2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salary;
        int creditRating;
        String input;

        input = JOptionPane.showInputDialog("What is your annual salary?");
        salary = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("On a scale of 1 to 10, what is your credit rating? ");
        creditRating = Integer.parseInt(input);
        
        if (salary >= 20000 && creditRating >= 7) {
            qualify();
        }
        else { 
            notQualified();
        }
               
    }
    public static void qualify() {
        JOptionPane.showMessageDialog(null, "You are qualified!");
    }

    public static void notQualified() {
        JOptionPane.showMessageDialog(null,  "You are not qualified");
    }
    
    
}
