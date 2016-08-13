/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch1;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Switch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number [1,2,3,4]");
        number = keyboard.nextInt();
        
        switch (number) {
            case 1:
                    System.out.println("You've entered 1");
                    break;
            case 2:
                    System.out.println("You've entered 2");
                    break;
            case 3:
                    System.out.println("You've entered 3");
                    break;
            case 4:
                    System.out.println("You've entered 4");
                    break;
            default:
                    System.out.println("Not a valid number");
                    break;
        }
    }
    
}
