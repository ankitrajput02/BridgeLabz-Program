package com.bridgelabz.utility;
import java.util.Scanner;


public class Utility {
		static Scanner sc=new Scanner(System.in);
		/**accept input type integer number
		 * @return integer number 
		 */
		public static int inputNumber() {
			int num=sc.nextInt();
			return num;
		}
		/**
		 * accept input type double
		 * @return double number
		 */
		public static double inputDouble() {
			double num=sc.nextDouble();
			return num;
		}
		/**accept string from user
		 * @return String
		 */
		public static String inputString() {
			String str=sc.next();
			return str;
		}
		
		public static char inputChar() {
			char ch=sc.next().charAt(0);
			return ch;
		}
		
		
		//Basic Core Programs
		/**
		 * @param str1 is user input that is name entered by user
		 * @param str2 Original string
		 * @param str3 String that is replace with user input
		 * @return string with user name
		 */
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
				System.out.print(result+" ");
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
		public static int factorOf(int num) 
		{
			int fact=1;
			for(int i=num;i>=1;i--) {
				fact=fact*i;
				System.out.print(i+" ");
			}
			System.out.println("\nFacforial of "+num+" is "+fact);
			return fact;
		}
		
		
		
		//Functional Programs
		/*2D Array */
		//For Input	N*M Integer Numbers
		public static void printWriter(int n,int m) {
			int[][] arr = new int[n][m];
			System.out.println("Enter "+n*m+" Elements");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			System.out.println("Array is..");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		//For Double Numbers
		public static void printWriterDouble(int n,int m) {
			double[][] arr = new double[n][m];
			System.out.println("Enter "+n*m+" Elements");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					arr[i][j]=sc.nextDouble();
				}
			}
			System.out.println("Array is..");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					System.out.print(arr[i][j]+"  ");
				}
				System.out.println();
			}
		}
		//For Boolean
		public static void printWriterBoolean(int n,int m) {
			boolean[][] arr = new boolean[n][m];
			System.out.println("Enter "+n*m+" Elements");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					arr[i][j]=sc.nextBoolean();
				}
			}
			System.out.println("Array is..");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}

		
		
		//Triplets That Equals to Zero
		//arr[i]+arr[j]+arr[k]=0
		public static void tripletAddition(int arr[]) {
			int count=0;
			
			for(int i=0;i < arr.length;i++) {
				for(int j=i+1;j < arr.length;j++) {
					for(int k=j+1;k < arr.length;k++) {
						if(arr[i]+arr[j]+arr[k]==0) {
							count++;
							System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"=0");
						}
					}
				}
			}
			System.out.println("Total Distinct Triplets "+count);
		}
		
		
		//Euclidean Distance
		public static double euclideanDistance(int x,int y) {
			double powX=(int)x*x;
			double powY=(int)y*y;
			double distance=Math.sqrt(powX+powY);
			return distance;
		}
		
		
		//Quadratic Equation
		/**
		 * @param a number which pass the value of A
		 * @param b number which pass the value of B
		 * @param c	number which pass the value of C
		 */
		public static void rootOfX(int a,int b,int c) {
			double delta=b*b-4*a*c;
			double rootOneX=(-b+Math.sqrt(delta))/(2*a);
			System.out.println("Root 1 of X "+rootOneX);
			double rootTwoX=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("Root 2 of X "+rootTwoX);
	
		}
		
		
		//Wind Chill
		/**
		 * @param t is temperature in Fahrenheit
		 * @param v is Wind Speed (in mph)
		 * @return w is wind chill (Fahrenheit)
		 */
		public static double windChill(double t,double v) {
			double w=0.0;
			if( (t < 50) && (v < 120) && ( v > 3) ) {
				w = 35.74 +(0.6215*t)-(35.75*Math.pow(v,0.16))+(0.4275*t*Math.pow(v,0.16));
			}
			else {
				System.out.println("Values Should be in Range");
			}
			return w;
		
		
		}
	
	
		//Gambler
		/**
		 * @param stack is integer number
		 * @param goal is integer number
		 * @param play is integer number which is shows how many times while loop executes
		 * @return win integer number that shows no of times user wins
		 */
		public static int gamePlay(int stack,int goal,int play) {
		int win=0,counter=0;
		while(counter < play && stack > 0 && goal > stack) {
			if(Math.random()>0.5) {
				win++;
			}
			else {
				stack--;
			}
		counter++;
		}
		//System.out.println("Win "+win);
		double percentage=(double)win/play*100;
		System.out.println("Percentage of Winning "+percentage);
		return win;
		}
		
		
		
		/**
		 * @param num integer number that shows how many random numbers are required
		 * @return distinct elements/number and Total random no required to generate distinct numbers
		 */
		public static int couponNumber(int num) {
			int count=0,distinct=0;
			boolean newNum[]=new boolean[num];
			while(distinct<num) 
			{
				int number=(int)(Math.random()*num);
				count++;
				if(!newNum[number]) {		//if number is not present in newNum array then it will print
					System.out.print(number+" ");	
					distinct++;			//if number is new then distinct increases
					newNum[number]=true;	
				}
			
			}
			System.out.println("\nTotal random number required "+count);
			return distinct;
			}
		
		//stopwatch start
		/**
		 * @param start is long value which contain time in millis
		 * @param end is long value which contain time in millis
		 * @return time in sec
		 */
		public static long stopwatch(long start,long end) {
			long time=(end-start)/1000;
			//System.out.println("Stopwatch time "+(double)value/1000+" Sec");
			return time;
		}
		
		//Tic-tac-toe
		
		//Vending Machin
		/**
		 * @param amount is integer number which is entered by user
		 */
		public static int calculateNotes(int amount) {
			int notes[]= {1000,500,100,50,20,10,5,2,1};
			int[] noteCounts= new int[notes.length];
			for(int i=0;i<notes.length;i++) {
				if(amount>=notes[i] && amount !=0) {
					noteCounts[i]=amount/notes[i];
					System.out.println(notes[i]+"X"+noteCounts[i]+"="+notes[i]*noteCounts[i]);
					amount-=notes[i]*noteCounts[i];
				}
			}
			return amount;
		}
	
				
}
