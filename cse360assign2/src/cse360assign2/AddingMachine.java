/** 
 * @author Cooper McDonald
 * @author ID: 1214581524
 * Assignment 2
 *  This program creates an AddingMachine object that contains a int total. This class has methods
 * that will manipulate this value such as getting, adding, subtracting, clearing, and setting to 
 * a string.
 */

package cse360assign2;

public class AddingMachine {

	// Variables
	private int total = 0;				// total value that will be manipulated by methods. Initially set to 0
	private String equation = "0";		// equation to be printed in toString. Begins the equation with a "0" to show initial value.
	
	/**
	 * Main object method. Nothing is changed
	 */
	public AddingMachine () {
		
	}
	
	/**
	 * Returns the int total
	 * @return total
	 */
	public int getTotal () {
		return total;			// Returning total
	}
	
	/**
	 * Adds value to total and appends variable 'equation'
	 * @param value
	 */
	public void add (int value) {
		total = total + value; 					// Adding the entered value to the current total
		
		equation = equation + " + " + value;	// Appending a string to equation so that it prints correctly in toString()
	}
	
	/**
	 * Subtracts value from total
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value; 					// Subtracting the entered value from the current total
		
		equation = equation + " - " + value;	// Appending a string to equation so that it prints correctly in toString()
	}
	
	/**
	 * Converts total to a string and returns
	 */
	public String toString () {
		return equation;
	}

	/**
	 * Resets total to value of 0
	 */
	public void clear() {
	total = 0;
	}
		 
	/**
	 * Main method created for the purposes of creating an AddingMachine object and testing the methods work correctly
	 * @param args
	 */
	public static void main(String args[]) 
	    { 
		 	AddingMachine myCalculator = new AddingMachine();			// Creating new AddingMachine named myCalculator with total set to 0
		 	
		 	myCalculator.add(4);		// adding 4 to total
		 	myCalculator.subtract(1);	// subtracting 1 from total
		 	myCalculator.add(5);		// adding 5 to total
		 	myCalculator.subtract(2);	// subtracting 2 form total
		 	myCalculator.add(6);		// adding 6 to total
		 	myCalculator.subtract(3);	// subtracting 3 from total
		 	
		 	System.out.println("The euation is " + myCalculator.toString());	// Printing the equation using toString() method
		 	System.out.println("The total is " + myCalculator.getTotal());		// Printing the final value total
		 	
	    } 
	
}
