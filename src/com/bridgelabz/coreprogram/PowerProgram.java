package com.bridgelabz.coreprogram;
import com.bridgelabz.utility.Utility;
/**
 * Created By:Ankit Rajput
 * Title:program takes a command-line argument N and prints a table of the 
 * 			powers of 2 that are less than or equal to 2^N.
 *			I/P -> The Power Value N.(Only works if 0 <= N < 31 since 2^31 overflows an int) 
 *			O/P -> prints a table of the powers of 2 that are less than or equal to 2^N.
 * Date:16/01/2020 
 */
public class PowerProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter Number");
		int N=Integer.parseUnsignedInt(args[0]);
		Utility.powerOfTwo(N);
	}
}