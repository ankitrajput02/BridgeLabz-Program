package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

/**
 * Title: to find square root using newton's method
 * 
 * Created By:Ankit Rajput
 *
 */
public class NewtonSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to find root: ");
		double num = Utility.inputDouble();
		double epsilon = 1e-15;
		Utility.sqrt(num, epsilon);
		

	}

}