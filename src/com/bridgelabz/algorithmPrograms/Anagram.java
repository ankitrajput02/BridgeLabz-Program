package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.utility.Utility;

/**Created By:Ankit Rajput
 * Title:Program to check Two Strings are Anagram or not.
 *
 */
public class Anagram {
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter First String");
		String str1=Utility.inputString();
		System.out.println("Enter First String");
		String str2=Utility.inputString();
		
		if(str1.length()==str2.length()){
			String n1=Utility.sortString(str1);	//predefine function to sort String
			String n2=Utility.sortString(str2);	//predefine function to sort String
			
			if(n1.equals(n2)==true) {		//if strings are equal then it returns true else false
				System.out.println("Strings Are Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
		else {
			System.out.println("Not Anagram");
		}
}
}
