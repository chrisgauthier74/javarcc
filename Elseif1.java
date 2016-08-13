/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elseif1;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class Elseif1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int testScore;
        String input;
        
        input = JOptionPane.showInputDialog("Enter your test score: ");
        testScore = Integer.parseInt(input);
        if (testScore < 50) {
            JOptionPane.showMessageDialog(null, "You have an F");
        }
        else if (testScore < 60) {
            JOptionPane.showMessageDialog(null, "You have a C");
        }
        else if (testScore < 70) {
            JOptionPane.showMessageDialog(null, "You have a B");
        }
        
        else if (testScore < 80) {
            JOptionPane.showMessageDialog(null,"You have an A");
        }
        else if (testScore < 90) {
            JOptionPane.showMessageDialog(null, "You have an A+");
        }
        else {
            JOptionPane.showMessageDialog(null, "Your score isn't recorded");
        }
    }
    
}
