/* 
 * File:	.java
 * Author:	Ryan Ringer
 * Created on:	
 * Purpose:	
 */

package gaddis_6thed_4.pkg2_distancetravelled;

import java.util.Scanner;

public class Gaddis_6thEd_42_DistanceTravelled {

    
    public static void main(String[] args) {
	// Seed random number or initialize scanner
        Scanner scan = new Scanner(System.in);
        
        // Constant Variables

        
        // Declare all Variables Here
        
	Integer speed;
	Integer time;
	Integer distance;
	String output = "";
        // Input or initialize values Here
        System.out.println("Enter the speed of the vehicle in Miles Per Hour: ");
	speed = Integer.parseInt(scan.nextLine());
	if(speed < 0){
	    speed *= -1;
	}
	
	do{
	    System.out.println("Enter the number of hours for which the vehicle travelled");
	    time = Integer.parseInt(scan.nextLine());
	    
	    if(time<=0){
		System.out.println("ERROR: please enter a value greater than 0");
	    }
	}while(time <= 0);
	
        // Process/Calculations Here
	output = String.format("Hour     Distance");
	for (int i = 0; i <= time; i++) {
	    distance = i * speed;
	    if(i<10){
		output = String.format(output+"\n%d        %d", i, distance);
	    }
	    else if(i < 100){
		output = String.format(output+"\n%d       %d", i, distance);
	    }
	    else{
		output = String.format(output+"\n%d      %d", i, distance);
	    }
	}
	
        
        // Output Located Here
        System.out.println(output);
        
        // Exit
    }

}
