/* 
 * File:	Gaddis_6thED_6.2_CarClass.java
 * Author:	Ryan Ringer
 * Created on:	
 * Purpose:	
 */

package gaddis_6thed_6.pkg2_carclass;


public class Gaddis_6thED_62_CarClass {

    
    public static void main(String[] args) {
	// Seed random number or initialize scanner
        
        
        // Constant Variables
	final String MAKE = "freestar";
	final Integer MODEL = 2007;
	
        
        // Declare all Variables Here
        Car sedan1 = new Car(MAKE, MODEL);
	Integer spd;
	
        // Input or initialize values Here
        
        
        // Process/Calculations Here
	System.out.println("Accelerating");
	for (int i = 0; i < 5; i++) {
	    sedan1.accelerate();
	    spd = sedan1.getSpeed();
	    System.out.println(spd);
	}
	System.out.println("Braking");
	for (int i = 0; i < 5; i++) {
	    sedan1.brake();
	    spd = sedan1.getSpeed();
	    System.out.println(spd);
	}
        
        // Output Located Here
       
        
        // Exit
    }

}