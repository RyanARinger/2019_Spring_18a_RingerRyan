/* 
 * File:        gaddis_6thed_3.pkg4_testscores.java
 * Author:      Ryan Ringer 
 * Purpose:     Test score average calculator
 * Created on:  March 6th, 2019
 */

package gaddis_6thed_3.pkg4_testscores;

import java.util.Scanner;

public class Gaddis_6thED_34_TestScores {

    
    public static void main(String[] args) {
        // Seed random number/ initialize scanner
        Scanner scan = new Scanner(System.in);
        
        // Constant Variables
        
        // Declare all Variables Here
        Integer score1, score2, score3;
        Integer avg;
        String output;
        // Input or initialize values Here
        System.out.println("Enter score #1");
        score1 = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter score #2");
        score2 = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter score #1");
        score3 = Integer.parseInt(scan.nextLine());
        
        // Process/Calculations Here
        avg = (score1 + score2 + score3)/3;
        if(avg>=90){
            //a
            output = String.format("%d (A)", avg);
        }
        else if(avg>=80 && avg<90){
            //b
            output = String.format("%d (B)", avg);
        }
        else if(avg>=70 && avg<80){
            //c
            output = String.format("%d (C)", avg);
        }
        else if(avg>=60 && avg<70){
            //d
            output = String.format("%d (D)", avg);
        }
        else{
            //f
            output = String.format("%d (F)", avg);
        }
        // Output Located Here

        System.out.println("The Average score was " + output);
        
        // Exit
    }

}
