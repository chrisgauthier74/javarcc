/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinedlearning1;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class CombinedLearning1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           String inputString;
           String name;
           int hours;
           double payRate;
           double grossPay;
           
           name = JOptionPane.showInputDialog("What is your name: ");
           inputString = JOptionPane.showInputDialog("How many hours did you work this week? ");
           hours = Integer.parseInt(inputString);
           inputString = JOptionPane.showInputDialog("What is your hourly pay? ");
           payRate = Double.parseDouble(inputString);
           grossPay = hours * payRate;
           
           JOptionPane.showMessageDialog(null,"Hello, " + name + "your weekly pay is " + grossPay);
           
           System.exit(0);
                   
           
           
    }
    
}
