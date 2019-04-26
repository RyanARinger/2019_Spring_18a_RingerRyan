/*
 * Author: Ryan Ringer
 * Created on: April 25th, 2019
 * File: pkg042519_exceptions_classwork
 * Purpose: Classwork
*/
package pkg042519_exceptions_classwork;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;

public class Main {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
//        PrintWriter print = new PrintWriter("data.txt");
//        print.close();

        FileOutputStream fStream = new FileOutputStream("pic.dat");
        byte[] b = {
            0b01001000, 0b01100101, 0b01101100, 0b01101100, 0b01101111, 
            0b00100000,
            0b01010111, 0b01101111, 0b01110010, 0b01101100, 0b01100100 , 0b1100
        };
        fStream.write(b);
        
        DataOutputStream dos = new DataOutputStream(fStream);
        dos.writeChars("Hello there");
    }
    
}