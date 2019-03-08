/* 
 * File:        gaddis_6thed_3.pkg2_magicdates.java
 * Author:      Ryan Ringer 
 * Purpose:     Magic date detector
 * Created on:  March 6th, 2019
 */

package gaddis_6thed_3.pkg2_magicdates;

import java.util.Scanner;

public class Gaddis_6thED_32_MagicDates {

    
    public static void main(String[] args) {
        // Seed random number/ initialize scanner
        Scanner scan = new Scanner(System.in);
        
        // Constant Variables

        // Declare all Variables Here
        Integer month, day, year;
        Integer mNum;
        String output;
        boolean tdYear = false;
        // Input or initialize values Here
        System.out.println("Please enter a date.\n month:");
        month = Integer.parseInt(scan.nextLine());
        System.out.println("Day: ");
        day = Integer.parseInt(scan.nextLine());
        
        do{
            System.out.println("Year(two-digit)");
            year = Integer.parseInt(scan.nextLine());
            
            if(year >= 100){
                System.out.println("Error: year entered is not two digits or is "
                                   + "less than zero\n TRY AGAIN");
            }
            else{
                tdYear = true;
            }
        }while(!tdYear);
        // Process/Calculations Here
        mNum = day * month;
        if(mNum.equals(year)){
            output = String.format("The date %d/%d/%d, is magic!", month, day, year);
        }
        else{
            output = String.format("The date %d/%d/%d, is not magic. Loser", month, day, year);
        }
        // Output Located Here

        System.out.println(output);
        // Exit
    }

}
