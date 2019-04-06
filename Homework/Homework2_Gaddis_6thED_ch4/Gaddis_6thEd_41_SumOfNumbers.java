/* 
 * File:	gaddis_6thed_4.pkg1_sumofnumbers.java
 * Author:	Ryan Ringer
 * Created on:	March 16th, 2019
 * Purpose:	Sum of Numbers
 */

package gaddis_6thed_4.pkg1_sumofnumbers;

import java.util.Scanner;

public class Gaddis_6thEd_41_SumOfNumbers {

    
    public static void main(String[] args) {
	// Seed random number or initialize scanner
        Scanner scan = new Scanner(System.in);
        
        // Constant Variables

        
        // Declare all Variables Here
        Integer input;
	Integer sum = 0;
	String output = "";
	
        // Input or initialize values Here
        System.out.println("Enter the number you would like to sum to: ");
	input= Integer.parseInt(scan.nextLine());
        
        // Process/Calculations Here
	
	for (int i = 1; i <= input; i++) {
	    sum += i;
	}
	
	output = String.format("The total sum is :%d", sum);
        
        // Output Located Here
        
	System.out.println(output);
        
        // Exit
    }

}
