/* 
 * File:	stats.java
 * Author:	Ryan Ringer
 * Created on:	March 21st, 2019
 * Purpose:	stats lab
 */

package stats;

import java.util.Scanner;
import java.util.Random;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Stats {

    
    public static void main(String[] args) {
	// Seed random number or initialize scanner
	Random rng = new Random(); // Random number generator
	Scanner scan = null;
	Scanner scan1 = null;
	FileWriter write = null;
	PrintWriter print = null;
	
        
        // Constant Variables
	final int ROLLS = 5;
        
        // Declare all Variables Here
        Integer die1, die2; // dice
	File file = new File("numbers.txt");
	Double stdDev = 0.0;
	Double avg, temp;
	Double sum = 0.0;
	int j = 0; // increment for counting number of characters
	
	try{
	    write = new FileWriter(file);
	    print = new PrintWriter(write);
	    scan = new Scanner(file);
	    scan1 = new Scanner(file);
	}
	catch(FileNotFoundException ex){
	    System.out.println("File not found");
	}
	catch(IOException ex){
	    System.out.println("IO exeption");
	}
	
	
        // Input or initialize values Here
        
        
        // Process/Calculations Here
	for (int i = 0; i < ROLLS; i++) {
	    print.println(rng.nextInt(6)+1);
	}
        print.close();
	
	while(scan.hasNextLine()){
	    j++;
	    temp = Double.parseDouble(scan.nextLine()); 
	    sum += temp;
	}
	
	avg = sum/j;
	
	while(scan1.hasNextLine()){
	    temp = Double.parseDouble(scan1.nextLine());
	    temp-=avg;
	    if(temp<=0){
		temp = 0.0;
	    }
	    stdDev = (temp * temp);
	}
	stdDev /= j;
	
	System.out.println(sum);
	System.out.println(j);
	System.out.println(avg);
	System.out.println(stdDev);
        // Output Located Here
        
        
        // Exit
    }

}
