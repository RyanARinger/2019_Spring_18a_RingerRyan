    /* 
     * File:	    Geometry.java
     * Author:	    Ryan Ringer
     * Created on:  April 7th, 2019
     * Purpose:	
     */

    package geometry;
    
    import static java.lang.Math.PI;
    import java.util.Scanner;

    public class Geometry {

	
	public static void main(String[] args) {
	    int choice;       // The user's choice
	    double value = 0; // The method's return value
	    char letter;
	    double radius;
	    double length;
	    double width;
	    double height;
	    double base;
	    double side1;
	    double side2;
	    double side3;
	    // The user's Y or N decision
	    // The radius of the circle
	    // The length of the rectangle
	    // The width of the rectangle
	    // The height of the triangle
	    // The base of the triangle
	    // The first side of the triangle
	    // The second side of the triangle
	    // The third side of the triangle
	    // Create a scanner object to read from the keyboard
	    Scanner keyboard = new Scanner(System.in);
	    // The do loop allows the menu to be displayed first
	    do
	    {
		// TASK #1 Call the printMenu method
		prtMenu();
		choice = keyboard.nextInt();
		switch (choice){
		    case 1:
			System.out.print("Enter the radius of " + "the circle: ");
			radius = keyboard.nextDouble();
			// TASK #3 Call the circleArea method and
			value = cArea(radius);
			// store the result in the value variable
			System.out.println("The area of the " + "circle is " + value);
			break;

		    case 2:
			System.out.print("Enter the length of " + "the rectangle: ");
			length = keyboard.nextDouble();
			System.out.print("Enter the width of " +  "the rectangle: ");
			width = keyboard.nextDouble();
			// TASK #3 Call the rectangleArea method and
			value = rArea(length, width);
			// store the result in the value variable
			System.out.println("The area of the " + "rectangle is " + value);
			break;

		    case 3:
			System.out.print("Enter the height of " + "the triangle: ");
			height = keyboard.nextDouble();
			System.out.print("Enter the base of " + "the triangle: ");
			base = keyboard.nextDouble();
			// TASK #3 Call the triangleArea method and
			value = tArea(height, base);
			// store the result in the value variable
			System.out.println("The area of the " + "triangle is " + value);
			break;

		    case 4:
			System.out.print("Enter the radius of " + "the circle: ");
			radius = keyboard.nextDouble(); 
			// TASK #3 Call the circumference method and
			value = cPerim(radius);
			// store the result in the value variable
			System.out.println("The circumference " + "of the circle is " + value); 
			break;

		    case 5:
			System.out.print("Enter the length of " + "the rectangle: ");
			length = keyboard.nextDouble();
			System.out.print("Enter the width of " +	"the rectangle: ");
			width = keyboard.nextDouble();
			// TASK #3 Call the perimeter method and
			value = rPerim(length, width);
			// store the result in the value variable
			System.out.println("The perimeter of " + "the rectangle is " + value); 
			break;

		    case 6:
			System.out.print("Enter the length of " + "side 1 of the " + "triangle: ");
			side1 = keyboard.nextDouble();
			System.out.print("Enter the length of " + "side 2 of the " + "triangle: ");
			side2 = keyboard.nextDouble();
			System.out.print("Enter the length of " + "side 3 of the " + "triangle: ");
			side3 = keyboard.nextDouble();
			// TASK #3 Call the perimeter method and
			value = tPerim(side1, side2, side3);
			// store the result in the value variable
			System.out.println("The perimeter of " + "the triangle is " + value);
			break;

		    default: 
			System.out.println("You did not enter " + "a valid choice.");
		}
		keyboard.nextLine(); // Consume the new line
		System.out.println("Do you want to exit " + "the program (Y/N)?: ");
		String answer = keyboard.nextLine();
		letter = answer.charAt(0);
	    }while(letter != 'Y' && letter != 'y');
	}
	    // TASK #1 Create the printMenu method here
	public static void prtMenu(){
	    System.out.println("This is a Geometry Calculator");
	    System.out.println("Choose what you would like to calculate");
	    System.out.println("1: Find area of a circle");
	    System.out.println("2: Find the area of a rectangle");
	    System.out.println("3: Find the area of a triangle");
	    System.out.println("4: Find the circumference of a circle");
	    System.out.println("5: Find the perimeter of a rectangle");
	    System.out.println("6: Find the perimeter of a triangle");
	    System.out.println("Enter the numeber of your Choice: ");
	}
	// TASK #2 Create the value-returning methods here
	
	/**
	 * 
	 * @param radius is the radius value received from the user
	 * @return the product of PI and the radius squared
	 */
	public static double cArea(double radius){
	    double area = (radius*radius)*PI;
	    return area;
	}
	
	/**
	 * 
	 * @param width width of the rectangle
	 * @param length length of the rectangle
	 * @return the product of the length and the width
	 */
	public static double rArea(double width, double length){
	    double area = width * length;
	    return area;
	}
	
	/**
	 * 
	 * @param height the height of the triangle
	 * @param base the length of the base of the triangle
	 * @return half of the product of the height and the base
	 */
	public static double tArea(double height, double base){
	    double area = 0.5 * height * base;
	    return area;
	}
	
	/**
	 * 
	 * @param r the radius of the circle
	 * @return the circumference of the circle
	 */
	public static double cPerim(double r){
	    double p = 2*r*PI;
	    return p;
	}
	
	/**
	 * 
	 * @param length the length of the rectangle
	 * @param width the width of the rectangle
	 * @return the sum of the two sides multiplied by two
	 */
	public static double rPerim(double length, double width){
	    double p = (length + width) * 2;
	    return p;
	}
	
	/**
	 * 
	 * @param side1 a distinct side of the triangle
	 * @param side2 a distinct side of the triangle
	 * @param side3 a distinct side of the triangle
	 * @return the sum of the three sides
	 */
	public static double tPerim(double side1, double side2, double side3){
	    double p = side1 + side2 + side3;
	    return p;
	}
	
	// TASK #4 Write javadoc comments for each method
    }