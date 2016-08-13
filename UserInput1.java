/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput1;
import java.util.Scanner;


/**
 *
 * @author chris
 */
public class UserInput1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare our user input variable
        String input;
        //create a scanner instance
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a username: ");
        //read keyboard input
        input = keyboard.nextLine();
        //print it out
        System.out.println("input: " + input);
        
        
    }
    
}
