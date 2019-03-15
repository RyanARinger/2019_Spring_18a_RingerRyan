/* 
 * File:	DecisionMaking.java
 * Author:	Ryan Ringer
 * Created on:	February 28th, 2019
 * Purpose:	Decision Making Classwork
 */

package decisionmaking;

import java.util.Scanner;

public class DecisionMaking {

    public static void main(String[] args) {
        
	// String variable for menu selection
	String choice;
	Integer numChoice;
	
	
//	// menu list
	System.out.println("This is our gradebook: ");
	System.out.println("Pick an action to perform:");
	System.out.println("1. Enter a graded");
	System.out.println("2. Compute Averages");
	System.out.println("3. Exit");
	
	// scanner initialization
	Scanner input= new Scanner(System.in);
	
	// menu prompt
	System.out.println("What is your selection?: ");
	
	// user input
	choice = input.nextLine();
	numChoice = Integer.parseInt(choice);
	
	// menu opertaion
	if(numChoice == 1){
	    System.out.println("you picked: option 1");
	}
        else if(numChoice == 2){
	    System.out.println("you picked: option 2");
	}
        else if(numChoice == 3){
	    System.out.println("you picked: option 3");
	}
        else{
            System.out.println("No Choice Exists for: '" + numChoice + "'");
        }
        
        // menu opertaion                                     ///////// Doesn't Work /////////
//	if(choice.equals ("Enter Grade")){
//	    System.out.println("you picked: option 1");
//	}
//        else if(choice.equals ("Compute Averages")){
//	    System.out.println("you picked: option 2");
//	}
//        else if(choice.equals ("Exit")){
//	    System.out.println("you picked: option 3");
//	}
//        else{
//            System.out.println("No Choice Exists for: '" + choice + "'");
//        }
        
        
        // ternary logical statement to assign vaiables
        //(variable) = (tested variable) (operator) (test value) ? (value to set variable if true) : (value to set variable if false); 
//        numChoice = numChoice < 0 ? 0 : 1;
    }

}