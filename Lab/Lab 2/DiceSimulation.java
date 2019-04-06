/* 
 * File:	diceSimulation.java
 * Author:	Ryan Ringer
 * Created on:	March 20th, 2019
 * Purpose:	Dice Lab
 */

package dicesimulation;

import java.util.Scanner;
import java.util.Random;
public class DiceSimulation {

    
    public static void main(String[] args) {
	// Seed random number or initialize scanner
        Random rng = new Random();
        
        // Constant Variables
	
	// Constant for number of rolls
	final int ROLLS = 10000;
        
        // Declare all Variables Here
        Integer die1; // first die
	Integer die2; // second die
	
	int ones = 0; // snake eyes
	int twos = 0; // double twos
	int threes = 0; // double threes
	int fours = 0; // double fours
	int fives = 0; // double fives
	int sixes = 0; // double sixes
//	int sevens = 0; // double sevens for error in rng
	
	boolean done = false; // sentinel for 'while' and 'do-while'
	int j = 0; // counter for 'while' and 'do-while'
	
        // Input or initialize values Here
        
        
        // Process/Calculations Here
	
//	while(!done){
//	    j++;
//	    die1 = (rng.nextInt(6)+1); // assingning rolls to dice
//	    die2 = rng.nextInt(6)+1;
//	    if (die1.equals(die2)){
//		if(die1.equals(1)){
//		    ones++;
//		}
//		else if(die1.equals(2)){
//		    twos++;
//		}
//		else if(die1.equals(3)){
//		    threes++;
//		}
//		else if(die1.equals(4)){
//		    fours++;
//		}
//		else if(die1.equals(5)){
//		    fives++;
//		}
//		else if(die1.equals(6)){
//		    sixes++;
//		}
//		else{
//		    sevens++;
//		}
//		
//		
//	    }
//	    
//	    if(j >= ROLLS){
//		done = true;
//	    }
//	}
	
//	do{
//	    j++;
//	    die1 = (rng.nextInt(6)+1); // assingning rolls to dice
//	    die2 = rng.nextInt(6)+1;
//	    
//	    if(die1.equals(die2)){
//		switch(die1){
//		    case 1:
//			ones++;
//			break;
//		    case 2:
//			twos++;
//			break;
//		    case 3:
//			threes++;
//			break;
//		    case 4:
//			fours++;
//			break;
//		    case 5:
//			fives++;
//			break;
//		    case 6:
//			sixes++;
//		}
//	    }
//	    
//	    if(j >= ROLLS){
//		done = true;
//	    }
//	}while(!done);
	
	for (int i = 0; i <= ROLLS; i++) {
	    j = i;
	    
	    die1 = (rng.nextInt(6)+1); // assingning rolls to dice
	    die2 = rng.nextInt(6)+1;
	    
	    if(die1.equals(die2)){
		switch(die1){
		    case 1:
			ones++;
			break;
		    case 2:
			twos++;
			break;
		    case 3:
			threes++;
			break;
		    case 4:
			fours++;
			break;
		    case 5:
			fives++;
			break;
		    case 6:
			sixes++;
		}
	    }
	    
	}
        
        // Output Located Here
        System.out.println(ones);
	System.out.println(twos);
	System.out.println(threes);
	System.out.println(fours);
	System.out.println(fives);
	System.out.println(sixes);
	System.out.println("Ran " + j + " times");
	//System.out.println(sevens);
        
        // Exit
    }

}
