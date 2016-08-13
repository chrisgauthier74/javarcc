/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors1;

/**
 *
 * @author chris
 */
public class Constructors1 {

    /**
     * @param args the command line arguments
     */
    //the constructor is called every time a new constructor object is instantiated
    public Constructors1() {
        System.out.println("Creating a new constructor1 object!");
    }
    
    public Constructors1(String text) {
        System.out.println("a new string constructor1 is created, " + text);
    }
    public static void main(String[] args) {
        String text = "A new string!";
        Constructors1 c1 = new Constructors1();
        Constructors1 c2 = new Constructors1(text);
        
        
    }
    
    
}
