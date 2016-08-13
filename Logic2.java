/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic2;
import javax.swing.JOptionPane;
/**
 *
 * @author chris
 */
public class Logic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salary, yearsOnJob;
        String input;
        
        input = JOptionPane.showInputDialog("Enter your annual salary");
        salary = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the number of years on the current job");
        yearsOnJob = Double.parseDouble(input);
        
        //logical or in action
        if (salary >= 30000 || yearsOnJob >=2) {
            JOptionPane.showMessageDialog(null,"You have been on the job for more than 2 years and make more than 30000");
        }
        else {
            JOptionPane.showMessageDialog(null,"You either are not on the job more than 2 years or your salary isn't more than 30000 a year");
        }
    }
    
}
