/* 
 * File:	Gaddis_6thED_51_showChar.java
 * Author:	Ryan Ringer
 * Created on:	April 6th, 2019
 * Purpose:	
 */

package gaddis_6thed_5.pkg1_showchar;

import javax.swing.JOptionPane;

public class Gaddis_6thED_51_showChar {

    
    public static void main(String[] args) {
	// Seed random number or initialize scanner
	
        // Constant Variables
	
        
        // Declare all Variables Here
        String input;
	Integer spot;
	char c;
	String output;
	
	
        // Input or initialize values Here
        input = JOptionPane.showInputDialog("Enter a string");
	spot = Integer.parseInt(JOptionPane.showInputDialog("What spot would you like to search for"));
	
        
        // Process/Calculations Here
	c = showChar(input, spot);
        output = String.format("The Character at position %d of '%s' is: %c", spot, input, c);
	
        // Output Located Here
        JOptionPane.showMessageDialog(null, output);
        
        // Exit
    }
    
    public static char showChar(String s, int i){
	char c;
	c = s.charAt(i);
	return c;
    } 

}
