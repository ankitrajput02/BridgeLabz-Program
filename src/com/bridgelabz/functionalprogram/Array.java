package com.bridgelabz.functionalprogram;
import java.util.InputMismatchException;

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
		int row,column;
		switch(n) {
		case 1:
			System.out.println("Enter No of Rows And Columns");
			row=Utility.inputNumber();
			column=Utility.inputNumber();
			Utility.printWriter(row,column);
			break;
		case 2:
			System.out.println("Enter No of Rows And Columns");
			row=Utility.inputNumber();
			column=Utility.inputNumber();
			Utility.printWriterDouble(row,column);
			break;
		case 3:
			System.out.println("Enter No of Rows And Columns");
			try {
			row=Utility.inputNumber();
			column=Utility.inputNumber();
			Utility.printWriterBoolean(row, column);
			break;
			}catch(InputMismatchException e) {
				System.out.println("You entered incorrect data");
				break;
			}
		default:
			System.out.println("Please Select 1 or 2 or 3 Only");
			break;
		}
	}
}

