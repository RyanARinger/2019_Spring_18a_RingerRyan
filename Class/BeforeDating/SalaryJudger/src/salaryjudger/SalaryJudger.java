/* 
 * File:	SalaryJudger.java
 * Author:	Ryan Ringer
 * Created on:	February 28th, 2019
 * Purpose:	Salary Classwork
 */

package salaryjudger;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SalaryJudger {

    
    public static void main(String[] args) {
        // "seed" Scanner
        Scanner scan = new Scanner(System.in);
        
        // Salary integer object
//        Integer salary;
        
        // prompt user for Salary
//        System.out.println("Enter your Salary: ");
//        salary = Integer.parseInt(scan.nextLine());
        
//        if(salary > 0 && salary < 20000){
//            if(salary<5000){
//                System.out.println("You're very broke");
//            }
//            else if(salary <10000){
//                System.out.println("You're broke");
//            }
//            else{
//                System.out.println("Alright, not bad.... not good either");
//            }
//            
//        }
//        else{
//            System.out.println("Big Baller over here");
//        }
        
//        switch (salary){
//            case 1:
//                System.out.println("broke boi");
//                break;
//            case 2:
//                System.out.println("baller");
//                break;
//            default:
//                System.out.println("OK then");
//                
//        }
        
        // printf work
        
        float money = 50;
        String fValue;
        // % = format a character
        // optional flag
        // optional width
        // optional precision (floating point numbers)
        System.out.printf("I have $%.2f\n", money);
        fValue = String.format("I have$%.2f\n", money);
        JOptionPane.showMessageDialog(null, fValue);
        
        
    }
    
}
