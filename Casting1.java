/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting1;

/**
 *
 * @author chris
 */
public class Casting1 {

    /**
     * @param args the command line arguments
     */
    /// also known as data conversion -- very important in modern web development
    public static void main(String[] args) {
        int x;
        double y = 2.5;
        
        //converting a double to an int, we lose data this way, but it is technically correct
        x = (int)y;
        
        System.out.println("x is: " + x);
        
    }
    
}
