/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput2;
import java.util.Scanner;


/**
 *
 * @author chris
 */
public class UserInput2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //grabbing an int from the keyboard
        double input;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a double: ");
        input = keyboard.nextDouble();
        
        System.out.println("this is your double: " + input);
    }
    
}
