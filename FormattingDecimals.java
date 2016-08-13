/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formattingdecimals;
import java.text.DecimalFormat;

/**
 *
 * @author chris
 */
public class FormattingDecimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number1 = 1.555555555;
        double number2 = 2.555555555;
        double number3 = 3.56666666;
        
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(number1));
        System.out.println(formatter.format(number2));
        System.out.println(formatter.format(number3));
       
    }
    
}
