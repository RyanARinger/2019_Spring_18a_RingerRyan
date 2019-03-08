/* 
 * File:        Gaddis_6thED_35_MassWeight.java
 * Author:      Ryan Ringer 
 * Purpose:     Weight Calculator
 * Created on:  March 6th, 2019
 */

package gaddis_6thed_3.pkg5_massweight;

import java.util.Scanner;

public class Gaddis_6thED_35_MassWeight {

    
    public static void main(String[] args) {
        // Seed random number/ initialize scanner
        Scanner scan = new Scanner(System.in);
        
        // Constant Variables
        final Integer HEAVY = 1000;
        final Integer LIGHT = 10;
        final Double GRAV = 9.8;
        
        // Declare all Variables Here
        Double mass;
        Double newt;
        String output;
        // Input or initialize values Here
        System.out.println("Enter the objects mass:");
        mass = Double.parseDouble(scan.nextLine());
        
        // Process/Calculations Here
        
        ////weight = mass x 9.8////
        newt = mass * GRAV;
        
        if(newt>HEAVY){
            output= String.format("The object weighs %.2f newtons.\n"
                    + "it is too heavy.", newt);
        }
        else if(newt<LIGHT){
            output= String.format("The object weighs %.2f newtons.\n"
                    + "it is too light.", newt);
        }
        else{
            output= String.format("The object weighs %.2f newtons", newt);
        }
        // Output Located Here
        System.out.println(output);
        // Exit
    }

}
