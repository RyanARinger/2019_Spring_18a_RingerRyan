/* 
 * File:	Gaddis_6thED_62_RetailCalculator.java
 * Author:	Ryan Ringer
 * Created on:	April 6th, 2019
 * Purpose:	
 */

package gaddis_6thed_6.pkg2_retailcalculator;

import javax.swing.JOptionPane;

public class Gaddis_6thED_62_RetailCalculator {

    
    public static void main(String[] args) {
	// Seed random number or initialize scanner
        
        
        // Constant Variables

        
        // Declare all Variables Here
        Double markup = 0.0;
	Double wSale = 0.0;
	Double price;
	String prompt1 = "Enter the wholesale price";
	String prompt2 = "Enter the markup percentage";
	String output;
	boolean done;
        // Input or initialize values Here
	
	
	// I played around with catching the exception that Double.ParseDouble
	// throws when it encounters a parsing error
	
	do{
	    try{
		wSale = Double.parseDouble(JOptionPane.showInputDialog(prompt1));
		done = true;
	    }
	    catch(NumberFormatException ex){
		prompt1 = String.format("ERROR: Invalid Input\n" + prompt1);
		done = false;
	    }
	    
	}while(!done);
	
	do{
	    try{
		markup = Double.parseDouble(JOptionPane.showInputDialog(prompt2));
		done = true;
	    }
	    catch(NumberFormatException ex){
		prompt2 = String.format("ERROR: Invalid Input\n" + prompt2);
		done = false;
	    }
	}while(!done);
	
        
        // Process/Calculations Here
	price = calc(wSale,markup);
        
	output = String.format("The final price is: $%.2f", price);
        
	// Output Located Here
        JOptionPane.showMessageDialog(null, output);
        
        // Exit
    }
    
    public static double calc(double w, double m){
	final int CON = 100;
	double price;
	
	m = (m/CON) + 1.0;
//	System.out.println(m);
	
	price = w*m;
	
	return price;
    }
}
