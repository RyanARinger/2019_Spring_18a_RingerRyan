/* 
 * File:	.java
 * Author:	Ryan Ringer
 * Created on:	
 * Purpose:	
 */

package timecalculator;

import java.util.Scanner;

public class TimeCalculator {

    
    public static void main(String[] args) {
	        // Seed random number/ initialize scanner

        Scanner scan = new Scanner(System.in);
        // Constant Variables
        final Integer MINUTE = 60;
        final Integer HOUR = 3600;
        final Integer DAY = 86400; 
        
        // Declare all Variables Here
        Integer input;
        Integer remainder = 0;
        Integer nDays = 0, nHours = 0, nMin = 0, nSecs = 0;
        String output1 = "";
        String output2 = ""; 
        String output3 = "";
        
        // Input or initialize values Here
        
        System.out.println("Enter the number of seconds:");
        input = Integer.parseInt(scan.nextLine());
        remainder = input;
        nSecs = input;
        //System.out.println(input);
        
        // Process/Calculations Here

        if(input>=MINUTE){
            if(input>=HOUR){
                if(input>=DAY){
                    nDays = remainder/DAY;
                    remainder = input - (nDays * DAY);
                    nSecs = nSecs - (nDays * DAY);
                }
                else{
                    nDays = 0;
                }
                nHours = remainder/HOUR;
                remainder = remainder - (nHours * HOUR);
                nSecs = nSecs - (nHours * HOUR);
            }
            else{
                nHours = 0;
            }
            nMin = remainder/MINUTE;
            remainder = remainder - (nMin * MINUTE);
            nSecs = nSecs - (nMin * MINUTE);
        }
        else{
            nMin = 0;
        }
        // Output Located Here
        System.out.println(nDays + " Day(s), " + nHours + " Hour(s), " + nMin + " Minute(s), " + nSecs +" Second(s).");
        // Exit
    }

}
