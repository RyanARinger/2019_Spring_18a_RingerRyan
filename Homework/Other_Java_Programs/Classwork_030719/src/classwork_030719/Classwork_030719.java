/* 
 * File:	.java
 * Author:	Ryan Ringer
 * Created on:	
 * Purpose:	
 */

package classwork_030719;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Classwork_030719 {

    
    public static void main(String[] args) {
	String filename;
	filename = JOptionPane.showInputDialog("Enter File name");
	
	// printwriter (easy)
	    PrintWriter output;
	try {
	    output = new PrintWriter(filename);
	    output.println("Hello World");
	    output.close();
	} catch (FileNotFoundException ex) {
	    System.out.println("File Not Found");
	    
	}
    }

}
