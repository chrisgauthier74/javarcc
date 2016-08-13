/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while2;
import javax.swing.JOptionPane;
/**
 *
 * @author chris
 */
public class While2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MIN_PLAYERS = 9;
        final int MAX_PLAYERS = 15;
        int players, teamSize,teams,leftOver;
        String input;
        
        input = JOptionPane.showInputDialog("Enter the number of players per team");
        teamSize = Integer.parseInt(input);
        
        while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS) {
            input = JOptionPane.showInputDialog("The number must be between " + MIN_PLAYERS + "and " + MAX_PLAYERS);
            teamSize = Integer.parseInt(input);
        }
        input = JOptionPane.showInputDialog("Enter the number of available players");
        players = Integer.parseInt(input);
        
        while (players <= 0) {
            input = JOptionPane.showInputDialog("Enter a number bigger than 0");
            players = Integer.parseInt(input);
        }
        
        teams = players / teamSize;
        leftOver = players % teamSize;
        
        JOptionPane.showMessageDialog(null, "There will be " + teams + " with " + leftOver + " players left over");
        
        
        
    }
    
}
