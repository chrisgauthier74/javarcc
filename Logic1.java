/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic1;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class Logic1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salary;
        double yearsOnJob;
        String input;
        
        input = JOptionPane.showInputDialog("Enter your annual salary: ");
        salary = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the number of years on the job");
        yearsOnJob = Double.parseDouble(input);
       
        //logical && in action
        if (salary >= 30000 && yearsOnJob >= 2) {
            JOptionPane.showMessageDialog(null,"You qualify for a promotion");
        }
        else {
            JOptionPane.showMessageDialog(null,"You do not qualify for a promotion");
        }
        
    }
    
}
