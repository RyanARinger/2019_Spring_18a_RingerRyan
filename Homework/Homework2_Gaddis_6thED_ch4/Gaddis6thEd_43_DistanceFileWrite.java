/* 
 * File:	.java
 * Author:	Ryan Ringer
 * Created on:	
 * Purpose:	
 */

package gaddis.pkg6thed_4.pkg3_distancefilewrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Gaddis6thEd_43_DistanceFileWrite {

    
    public static void main(String[] args) {
		// Seed random number or initialize scanner
        Scanner scan = new Scanner(System.in);
	FileWriter write = null;
	PrintWriter print = null;
        
        // Constant Variables

        
        // Declare all Variables Here
        
	File myFile = new File("Distance.txt");
	
	Integer speed;
	Integer time;
	Integer distance;
	String output = "";
	
        // Input or initialize values Here
	try{
	    write = new FileWriter("Distance.txt");
	    print = new PrintWriter(write);
	}
	catch(FileNotFoundException ex){
	    System.out.println("FNFE");
	}
	catch(IOException ex){
	    System.out.println("IOE");
	}
	
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
	print.println("Hour     Distance");
	for (int i = 0; i <= time; i++) {
	    distance = i * speed;
	    if(i<10){
		print.format(output+"%d        %d miles\n", i, distance);
	    }
	    else if(i < 100){
		print.format(output+"%d       %d miles\n", i, distance);
	    }
	    else{
		print.format(output+"%d      %d miles\n", i, distance);
	    }
	}
	
        print.close();
        // Output Located Here
//        System.out.println(output);
        
        // Exit
    }

}
