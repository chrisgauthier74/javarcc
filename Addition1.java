/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition1;

/**
 *
 * @author chris
 */
public class Addition1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int sum;
        int divide;
        int subtract;
        int multiply;
        
        
        sum = a + b + c;
        divide = (a + b) / 2;
        subtract = (a + b) - 2;
        multiply = a * b;
        
        System.out.println("sum is: " + sum);
        System.out.println("divide is: " + divide);
        System.out.println("subtract is: " + subtract);
        System.out.println("Multiply is: " + multiply);
    }
    
}
