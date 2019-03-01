/* 
 * File:	Loops.java
 * Author:	Ryan Ringer
 * Created on:	February 28th, 2019
 * Purpose:	Loops Classwork
 */
package loops;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Loops {

    
    public static void main(String[] args) {
        // TODO: write a program that asks for: name, age, and salary
        //       Display the name and age, and use string.format to format
        //       the salary as dollars
        // Bonus: John = special
        // loop until "EXIT"
        // use equalsIgnoreCase to allow user to type any string exit
        
        // seed the scanner
        Scanner scan = new Scanner(System.in);
        
        // variables
        String name;
        Integer age;
        Float salary;
        String outString;
        
        
        // sentinel
        Boolean done = false;
        
        // prompt loop
        do{
            System.out.println("Enter your name: ");
            name = scan.nextLine();
            
            System.out.println("Enter your age: ");
            age = Integer.parseInt(scan.nextLine());
            
            System.out.println("Enter your salary: ");
            salary = Float.parseFloat(scan.nextLine());
            
            if(name.equals("John")){
                outString = String.format("Hello Prof. Oconnor, \nYou are %d years old\n And your Salary is: $%.2f\n", age, salary);
            }
            else{
                outString = String.format("Hello %s, \nYou are %d years old\n And your Salary is: $%.2f\n", name, age, salary);
            }
            
            System.out.println(outString);
            
            sout
            
        }while(!done);
                
        
        
        
        
    }
    
}
