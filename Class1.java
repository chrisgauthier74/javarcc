/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class1;

/**
 *
 * @author chris
 */
public class Class1 {
    double length, width;
    
    public void setWidth(double len) {
        length = len;
    }
    
    public void setLength(double w) {
        width = w;
    }
    
    public double getWidth () {
        return width;
    } 
    
    public double getLength() {
        return length;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.setWidth(10);
        class1.setLength(10);
        System.out.println(class1.getWidth());
        System.out.println(class1.getLength());
        
    }
    
}
