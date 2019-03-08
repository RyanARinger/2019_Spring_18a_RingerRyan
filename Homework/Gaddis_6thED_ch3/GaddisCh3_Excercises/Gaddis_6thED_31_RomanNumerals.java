/* 
 * File:        gaddis_6thed_3.pkg1_romannumerals.java
 * Author:      Ryan Ringer 
 * Purpose:     Roman Numeral Calculator
 * Created on:  March 6th, 2019
 */

package gaddis_6thed_3.pkg1_romannumerals;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gaddis_6thED_31_RomanNumerals {

    
    public static void main(String[] args) {
        // Seed random number/ initialize scanner
        Scanner scan = new Scanner(System.in);
        
        
        // Constant Variables

        
        // Declare all Variables Here
        Integer input;
        String output = null;
        boolean inRange;
        // Input or initialize values Here
        do{
            System.out.println("Enter an integer between 1 and 10: ");
            input = Integer.parseInt(scan.nextLine());
            //System.out.println(input);
            
            if(input < 1 || input > 10){
                System.out.println("ERROR: Value entered was out of bounds\nPlease try again");
                inRange = false;
            }
            else{
                inRange = true;
            }
        }while(!inRange);
        
        
        
        // Process/Calculations Here

        switch(input){
            case 1:
                output = String.format("I");
                break;
            case 2:
                output = String.format("II");
                break;
            case 3:
                output = String.format("III");
                break;
            case 4:
                output = String.format("IV");
                break;
            case 5:
                output = String.format("V");
                break;
            case 6:
                output = String.format("VI");
                break;
            case 7:
                output = String.format("VII");
                break;
            case 8:
                output = String.format("VIII");
                break;
            case 9:
                output = String.format("IX");
                break;
            case 10:
                output = String.format("X");
                break;
        }
        
        // Output Located Here
        System.out.println("The value entered in roman numeral form is: " + output);
        
        // Exit
    }

}
