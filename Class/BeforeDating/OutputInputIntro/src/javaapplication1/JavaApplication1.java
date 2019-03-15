/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author ncc
 */
public class JavaApplication1 {

    
    public static void main(String[] args) {
        
        
        // Create a program that does the following:
        // Prompts the user for their name, and stores it
        // prompts the user for their age, and stores it
        // prints "Hello *name* you're *age* years old
        
        String username;
        Integer userAge;
        
        Scanner keyboard = new Scanner(System.in);
        
        username = JOptionPane.showInputDialog("Please enter your name: ");
        userAge = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));
        JOptionPane.showMessageDialog(null, "Hello, " + username + "!\n"
                + "You are currently " + userAge + " years old.\n"
                + "You will be " + (userAge + 5) + " years old in 5 years.");
        
//        System.out.println("Please enter your name: ");
//        username = keyboard.nextLine();
//        System.out.println("Please enter your age: ");
//        userAge = Integer.parseInt(keyboard.nextLine());
//        System.out.println("Hello, " + username + "!\n"
//                + "You are currently " + userAge + " years old"
//                + "\nYou will be " + (userAge + 5) + " years old in 5 years.");
        
    }
    
}
