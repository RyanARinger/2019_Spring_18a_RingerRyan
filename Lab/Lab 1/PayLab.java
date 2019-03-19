/* 
 * File:        paylab.java
 * Author:      Ryan Ringer 
 * Purpose:     Pay Lab Assignment
 * Created on:  March 9th, 2019
 */

package paylab;

import java.util.Scanner;

public class PayLab {

    
    public static void main(String[] args) {
      // Create a Scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);
      // Identifier declarations
      double hours;  // Number of hours worked
      double rate;   // Hourly pay rate
      double pay;    // Gross pay
      // Display prompts and get input.
      System.out.print("How many hours did you work? ");
      hours = keyboard.nextDouble();
      System.out.print("How much are you paid per hour? ");
      rate = keyboard.nextDouble();
      // Perform the calculations.
      
      if(hours <= 40)
        // this calculates the base hourly pay if the employee
        // worked under 40 hours a week
        pay = hours * rate;
      else
        // this calculates the pay of an empoyee that HAS worked over 40 hours
        // first it caculates every hour over 40 the employee worked then
        // multiplies it by 150% the normal pay rate
        // finally it adds the normal 40 hours of pay
        pay = (hours - 40) * (1.5 * rate) + 40 * rate;
      
      // Display results.
      System.out.println("You earned $" + pay);
    }

}
