/* 
 * File:        pricelab.java
 * Author:      Ryan Ringer 
 * Purpose:     Price Lab Assignment
 * Created on:  March 9th, 2019
 */

package pricelab;

import java.util.Scanner;

public class PriceLab {

    
    public static void main(String[] args) {
      // Identifier declarations
      final double TAX_RATE = 0.055;
      double price;
      double tax;
      double total;
      String item;
      // Create a Scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);
      // Display prompts and get input.
      System.out.print("Item description:  ");
      item = keyboard.nextLine();
      System.out.print("Item price:  $");
      price = keyboard.nextDouble();
      // Perform the calculations.
      tax = price * TAX_RATE;
      total = price + tax;
      // Display the results.
      System.out.println(item + "        $" + price);
      System.out.printf("Tax          $%.2f\n", tax);
      System.out.printf("Total        $%.2f\n", total);
    }

}
