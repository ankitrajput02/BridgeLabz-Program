package com.bridgelabz.utility;
import java.util.Scanner;

//Ankit
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
		public static void leapOrNot(int year) {
			if(year>=1000||year<9999) {
				if(year % 400==0 || year % 4 ==0 && year % 100 != 0) {
					System.out.println(year+" is Leap Year");
				}
				else {
					System.out.println(year+" is Not Leap Year");
				}
			}
		}
		/*For Power of 2*/
		public static void powerOfTwo(int num) {
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
		}
		

}
