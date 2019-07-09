/* 
 * File:	ClassChallenge.java
 * Author:	Ryan Ringer
 * Created on:	March 7th, 2019
 * Purpose:	Class challenge (die roll file)
 */

package classchallenge;

import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
	
public class ClassChallenge {

    
    public static void main(String[] args) {
	//create a program that generates 5 random dice rolls
	//save them to a file on a single line
	//Read the dice rolls back into the program using scanner
	//output ONLY the last line you read back from the file
	
	// Seed random number or initialize scanner
        Random rng = new Random();
	Scanner scan = null;
	FileWriter write = null;
        PrintWriter printer = null;
	
        // Constant Variables

        
        // Declare all Variables Here
        String roll5 = "";
	File myFile = new File("RollRecord.txt");
	String outRoll = "";
	
        // Input or initialize values Here
        try{
	    // the 'true' in the next statement allows for appending rather than deletion
	    write = new FileWriter("RollRecord.txt", true);
	    printer = new PrintWriter(write);
	    scan = new Scanner(myFile);
	}
	catch(IOException ex){
	    System.out.println("write exception");
	}
        
        // Process/Calculations Here
	for (int i = 0; i < 5; i++) {
	    roll5 = String.format(roll5 + "%d,", rng.nextInt(6)+1);
	}
        printer.println(roll5);
	printer.close();
	
//	try{
//	    scan = new Scanner(myFile);
//	}
//	catch(IOException ex){
//	    System.out.println("Scan Exception");
//	}
	
	while(scan.hasNextLine()){
	    outRoll = scan.nextLine();
	}
	
        // Output Located Here
        
        System.out.println(outRoll);
        // Exit
    }

}