/**
 * Author:      Ryan Ringer
 * File:        InClassChallenge.java
 * Purpose:     Challenge
 * Created on:  March 14th, 2019
 */

////////////// THIS PROGRAM ALLOWS FOR TRUNCATION ERRORS ///////////////////////


package inclasschallenge;

import java.util.Scanner;

public class InclassChallenge {

    
    public static void main(String[] args) {
//        Write a program that accepts 
//        an input in meters and converts it to
//        1. Kilometers
//        2. Inches
//        3. Feet
//        based on menu options

        Scanner Scan = new Scanner(System.in);
        Double input;
        Integer choice;
        Double convert;
        String output; 
        Boolean done = false;
        Conversion meters = new Conversion();
        
        
        do{
            System.out.println("Enter a value of meters: ");
            input = Double.parseDouble(Scan.nextLine());
            
            output = " Meter(s) is ";
            
            System.out.println("Convert to :");
            System.out.println("1) Kilometers? ");
            System.out.println("2) Feet? ");
            System.out.println("3) inches? ");
            System.out.println("4) None, Exit. ");
            choice = Integer.parseInt(Scan.nextLine());
            
            switch(choice){
                case 1:
                    convert = meters.kiloM(input);
                    output = String.format("%.2f" + output + "%.2f Kilometers", input, convert);
                    System.out.println(output);
                    break;
                case 2:
                    convert = meters.feet(input);
                    output = String.format("%.2f" + output + "%.2f Feet", input, convert);
                    System.out.println(output);
                    break;
                case 3:
                    convert = meters.inches(input);
                    output = String.format("%.2f" + output + "%.2f Inches", input, convert);
                    System.out.println(output);
                    break;
                default:
                    done = true;
             output = "";       
            }
        }while(!done);
        
    }
    
}
