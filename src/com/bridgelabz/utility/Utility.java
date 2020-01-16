package com.bridgelabz.utility;
import java.util.Scanner;


public class Utility {
		static Scanner sc=new Scanner(System.in);
		//for input integer
		public static int inputNumber() {
			int num=sc.nextInt();
			return num;
		}
		//for input Double
		public static double inputDouble() {
			double num=sc.nextDouble();
			return num;
		}
		//for input String
		public static String inputString() {
			String str=sc.next();
			return str;
		}
		
		//
		//Basic Core Programs
		//
		//
		/*String Replace*/
		public static String stringReplace(String str1,String str2,String str3) {
		if(str1.length()>=3){
			String replaceString=str2.replace(str3, str1);
			return replaceString;
		}
		else{
			System.out.println("Enter Valid String");
		}
		return str3;
		}
		
		/*For Flip Coin Percentage*/
		//For Tail Percentage
		public static double tailPercentage(int tail,int flip) {
			return (100*(double)tail)/flip;
		}
		//For Head Percentage
		public static double headPercentage(int head,int flip) {
			return (100*(double)head)/flip;
		}
		
		
		/*Year is Leap or Not*/
		public static boolean leapOrNot(int year) {
			if(year>=1000||year<9999){
				if(year % 400==0 || year % 4 ==0 && year % 100 != 0) {
					System.out.println("Leap Year");
					return true;
				}
				else{
					System.out.println("Not Leap Year");
					return false;
				}
			}
			System.out.println("Not Leap Year");
			return false;
			
		}
		
		/*For Power of 2*/
		public static int powerOfTwo(int num) {
			if(num>=0 && num <31 ) {
				int i=1;
				int result=1;
				while(i<=num) 
				{
				result=result*2;	
				i++;
				}
				System.out.println("2^"+num+"="+result);
			}
			return num;
		}
		
		/*Harmonic Value*/
		public static double harmonicValueOf(int num) {
			double result=0;
			if(num!=0) {
				for(int i=1;i<num;i++) {
					 result=result+(double)1/i;
				}
			System.out.println("Harmonic Value Of "+result);
			}
			return result;
			
		}
		
		
		/*Factor of a Number*/
		public static int factorof(int num) 
		{
			int fact=1;
			for(int i=num;i>=1;i--) {
				fact=fact*i;
				System.out.print(i+" ");
			}
			System.out.println("\nFacforial of "+num+" is "+fact);
			return fact;
		}
		
		//
		//Functional Programs
		//
		//
		
		/*2D Array */
		

}
