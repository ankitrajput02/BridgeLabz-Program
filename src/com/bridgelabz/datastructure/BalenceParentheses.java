package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import java.lang.NullPointerException;

/**Title:Program to show arithmetic Expression is balanced or not.
 * Created By:Ankit Rajput
 *
 */
public class BalenceParentheses {
	  
	public static void main(String[] args) throws NullPointerException {
		// TODO Auto-generated method stub
		System.out.println("Enter Expression");
		String str=Utility.inputString();
//		String str="(5+6)∗(7+8)/(4+3)";
		char arr[]=str.toCharArray();
		//Print
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
//		char arr[]= {'{','(',')','}'};
		if(Utility.isBalance(arr))
			System.out.println("Balence");
		else
			System.out.println("Not Balence");	
		//char exp[]= {(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)};
		}

	
		


}
