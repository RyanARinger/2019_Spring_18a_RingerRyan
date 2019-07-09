/* 
 * File:	.java
 * Author:	Ryan Ringer
 * Created on:	
 * Purpose:	
 */

package pennysforpay;


public class PennysForPay {

    
    public static void main(String[] args) {
	// Seed random number or initialize scanner
        
        
        // Constant Variables
	final int DAYS = 30;
        
        // Declare all Variables Here
        int sum = 0;
	int startingPay = 1;
	
	
        // Input or initialize values Here
        
        
        // Process/Calculations Here
	for (int i = 0; i < DAYS; i++) {
	    sum += startingPay;
	    startingPay  *= 2;
	}
        
        // Output Located Here
        System.out.println(sum/100);
        
        // Exit
    }

}
