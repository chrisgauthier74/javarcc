/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package increments1;

/**
 *
 * @author chris
 */
public class Increments1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 4;
        
        System.out.println("number is: " + number);
        number++;
        System.out.println("number is now: " + number);
        number--;
        System.out.println("number is now: " + number);
        
        //this gets useful in a for loop
        for (int b=0; b <= 10; b++) {
            System.out.println("b: " + b);
            
        }
        
        //b now disappears from scope
        int b = 0;
        
       //or a while loop
        while (b <= 20) {
            System.out.println("c in while: " + b);
            b++;
        }
    }
    
}
