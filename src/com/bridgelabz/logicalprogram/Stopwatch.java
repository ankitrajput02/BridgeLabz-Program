package com.bridgelabz.logicalprogram;
import com.bridgelabz.utility.Utility;

/**Created By:Ankit Rajput
 * Purpose:Stopwatch Program for measuring the time that elapses between the start and end clicks
 * I/P -> Start the Stopwatch and End the Stopwatch
 * O/P -> Print the elapsed time.
 * Date:17/01/2020
 */
public class Stopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select the input...\n1.Start\n2.Stop");
		int c=Utility.inputNumber();
		long start=0,end=0;
		if(c==1) {
			start=System.currentTimeMillis();
		}
		int c2=Utility.inputNumber();
		if(c2==2) {
			end=System.currentTimeMillis();
		}
		System.out.println("Elapsed time "+(double)Utility.stopwatch(start,end)+" Sec");
	}

}
