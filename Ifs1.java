/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifs1;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class Ifs1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number;
        String input;
        input = JOptionPane.showInputDialog("What is your input number? ");
        
        number = Double.parseDouble(input);
        
        if (number <= 10) {
            JOptionPane.showMessageDialog(null, "input is less than 10");
        }
        else
            JOptionPane.showMessageDialog(null, "input is greater than 10");
        
        
        
        
    }
    
}
