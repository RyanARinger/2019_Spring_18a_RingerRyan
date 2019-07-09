package classwork_030719;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class Yahtzee {
    public static void main(String[] args) {
	Random rng = new Random();
	int die;
	PrintWriter print = null;
	FileWriter write;
	try {
	    
	    write = new FileWriter("dice.txt", true);
	    print = new PrintWriter(write);
	} catch (FileNotFoundException ex) {
	    System.out.println("File not found");
	} catch (IOException ex){
	    System.out.println("exception");
	}
	
	
	for (int i = 0; i < 6; i++){ 
	    print.println(rng.nextInt(6)+1);
	}
	
	print.close();
	
	File myFile = new File("dice.txt");
	Scanner scan = null;
	try{
	    scan = new Scanner(myFile);
	} catch(FileNotFoundException ex){
	    System.out.println("problemo");
	}
	
	while(scan.hasNextLine()){
	    System.out.println(scan.nextLine());
	}
    }
}