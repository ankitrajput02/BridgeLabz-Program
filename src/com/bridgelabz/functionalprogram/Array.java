package com.bridgelabz.functionalprogram;
import com.bridgelabz.utility.Utility;
/**
 *	Created By:Ankit Rajput 
 *  Title: A library for reading in 2D arrays of integers, doubles, or booleans from standard input
 *  and printing them out to standard output.
 *  I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
 *	O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter to print the output
 *	to the screen.
 *	Date:16/01/2020
 */
public class Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select Array of..\n1.Integers\n2.Doubles\n3.Boolean");
		int n=Utility.inputNumber();
		System.out.println("Enter No of Rows And Columns");
		int row=Utility.inputNumber();
		int column=Utility.inputNumber();
		switch(n) {
		case 1:
			Utility.printWriter(row,column);
			break;
		case 2:
			Utility.printWriterDouble(row,column);
			break;
		case 3:
			Utility.printWriterBoolean(row, column);
			break;
		default:
			break;
		}
	}
}

