/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods3;
import java.util.Scanner;
/**
 *
 * @author chris
 */
public class Methods3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter text to send to displayMessage");
        text = keyboard.nextLine();
        displayMessage(text);
    }

    public static void displayMessage(String text) {
        System.out.println(text);
    }
}
