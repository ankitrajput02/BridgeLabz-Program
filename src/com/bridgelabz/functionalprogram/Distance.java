package com.bridgelabz.functionalprogram;
import com.bridgelabz.utility.Utility;

/**
 *	Created By:Ankit Rajput 
 *  Title: program Distance.java that takes two integer command-line arguments x and y and prints
 *  	   the Euclidean distance from the point (x, y) to the origin (0, 0).The formulae to calculate
 *		   distance = sqrt(x*x + y*y). Use Math.power function
 *  Date:16/01/2020
 *  
 */
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter point(X,Y) from origin(0,0)");
		int x=Integer.parseUnsignedInt(args[0]);
		int y=Integer.parseUnsignedInt(args[1]);
		System.out.println(Utility.euclideanDistance(x, y));
	}
}
  