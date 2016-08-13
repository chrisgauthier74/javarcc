/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile1;
import java.util.Scanner;
/**
 *
 * @author chris
 */
public class DoWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score1, score2, score3;
        double average;
        char repeat;
        String input;
        
        System.out.println("This program calculates the overage of three test scores.");
        Scanner keyboard = new Scanner(System.in);
        
        do {
            System.out.println("Enter Score #1");
            score1 = keyboard.nextInt();
            System.out.println("Enter Score #2");
            score2 = keyboard.nextInt();
            System.out.println("Enter Score #3");
            score3 = keyboard.nextInt();
            keyboard.nextLine();
            average = (score1 + score2 + score3) / 3.0;
            System.out.println("The average is: " + average);
            System.out.println("Would you like to go again? ");
            System.out.println("Enter Y for yes and N for no");
            input = keyboard.nextLine();
            repeat = input.charAt(0);
        }  while (repeat == 'Y' || repeat == 'y');
        
        
    }
    
}
