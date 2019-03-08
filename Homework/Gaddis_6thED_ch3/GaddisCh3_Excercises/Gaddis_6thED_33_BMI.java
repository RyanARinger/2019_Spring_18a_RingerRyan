/* 
 * File:        .java
 * Author:      Ryan Ringer 
 * Purpose:     
 * Created on:  
 */

package gaddis_6thed_3.pkg3_bmi;

import java.util.Scanner;

public class Gaddis_6thED_33_BMI {

    
    public static void main(String[] args) {
        // Seed random number/ initialize scanner
        Scanner scan = new Scanner(System.in);
        
        // Constant Variables
        final Integer val = 703;
        
        // Declare all Variables Here
        double bmi;
        Integer height;
        Integer weight;
        String output;
        
        // Input or initialize values Here
        System.out.println("This program willoutput your BMI\n"
                + "Enter your Height (in inches):");
        height = Integer.parseInt(scan.nextLine());
        System.out.println("Enter your weight (in Pounds):");
        weight = Integer.parseInt(scan.nextLine());
        
        
        // Process/Calculations Here
        //BMI = Weight * 703 / Height2//
        bmi = weight*val/(height*height);
        
        if(bmi>18.5){
            output= String.format("Your BMI is %.2f, You're fat.", bmi);
        }
        else if(bmi<25){
            output= String.format("Your BMI is %.2f, You're underweight.", bmi);
        }
        else{
            output= String.format("Your BMI is %.2f, You're a healthy weight.", bmi);
        }
        // Output Located Here
        
        System.out.println(output);
        
        // Exit
    }

}
