/* 
 * File:        Arrays.java
 * Author:      Ryan Ringer 
 * Purpose:     Learning Arrays using a basic adding loop
 * Created on:  March 1st, 2019
 */

package arrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arrays {

    
    public static void main(String[] args) {
        // Seed random number/ initialize scanner
        Scanner scan = new Scanner(System.in);

        // Constant Variables

        // Declare all Variables Here
        Integer read;
        Integer arr[];
        Integer sum = 0;
        String out;
        
        // Input or initialize values Here
//        System.out.println("Enter the number you would like to add up to: ");
//        read = Integer.parseInt(scan.nextLine());
        read = Integer.parseInt(JOptionPane.showInputDialog("Enter the number you would like to add up to: "));
        arr = new Integer[read];
        
        // Process/Calculations Here
        
        // load array
        for (int i = 0; i < read; i++) {
            arr[i] = i+1;
        }
        
        // add elements
        for (int i = 0; i < read; i++) {
            sum += arr[i];
        }
        // Output Located Here
        
        // create formatted string
        out = String.format("The sum is: %d\n", sum);
        
        // output string
//        System.out.println(out);
        JOptionPane.showMessageDialog(null, out);
        
        // Exit
    }

}
