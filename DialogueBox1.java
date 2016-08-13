/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialoguebox1;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class DialogBox1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;
        
        firstName = JOptionPane.showInputDialog("What is your first name?");
        middleName = JOptionPane.showInputDialog("What is your middle name?");
        lastName = JOptionPane.showInputDialog("What is your last name?");
        
        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " +  middleName + " " + lastName);
    }
    
}
