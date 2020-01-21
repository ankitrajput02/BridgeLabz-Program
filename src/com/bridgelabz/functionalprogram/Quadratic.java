package com.bridgelabz.functionalprogram;
import com.bridgelabz.utility.Utility;
/**Created By:Ankit Rajput
 * Title:Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
 * Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found
 * using a formula (Note: Take a, b and c as input values) delta = b*b - 4*a*c
 * Root 1 of x = (-b + sqrt(delta))/(2*a)
 * Root 2 of x = (-b - sqrt(delta))/(2*a)
 * Date:16/01/2020
 *
 */
public class Quadratic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Value of a,b & c");
		int a=Utility.inputNumber();
		int b=Utility.inputNumber();
		int c=Utility.inputNumber();
		Utility.rootOfX(a, b, c);
		
	}
}
