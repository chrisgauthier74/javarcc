/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparingchars;
import java.util.Scanner;


/**
 *
 * @author chris
 */
public class ComparingChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        char ch = keyboard.findInLine(".").charAt(0);

        if (ch  == 'A') {
            System.out.println("input is an A!");
        }
        else {
            System.out.println("It is another letter!");
        }

    }
}
        