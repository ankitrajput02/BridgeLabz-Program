package com.bridgelabz.utility;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;

/**
 * 
 *
 */
public class Utility {
		static Scanner sc=new Scanner(System.in);
		/**accept input type integer number
		 * @return integer number 
		 */
		
		public static int inputNumber() {
			int num = 0;
			try {
			num=sc.nextInt();
			}catch(Exception e) {
				System.out.println("Exception:Please Enter the Integer");
			}
			return num;
		}
		/**
		 * accept input type double
		 * @return double number
		 */
		public static double inputDouble() {
			double num=0.0;
			try {
			num=sc.nextDouble();
			}catch(Exception e) {
				System.out.println("Exception:Enter value in double only");
				
			}
			return num;
		}
		/**accept string from user
		 * @return String
		 */
		public static String inputString() {
			String str=new String();
			try {
			str=sc.next();
			}catch(Exception e) {
				System.out.println("Exception:Enter String only");
			}
			return str;
		}
		
		public static char inputChar() {
			char ch = ' ';
			try {
				ch=sc.next().charAt(0);
			}catch(Exception e) {
				System.out.println("Exception:Enter Character");
			}
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
		
		/*Title: Flip Coin Percentage Using Math.random Function*/
		public static int flipCoin(int flip) {
		int tail=0,head=0;
		if(flip>0) {
			int counter=0;
			while(counter < flip) { //counter use to repeat while loop upto no of times Flip
				if(Math.random() < 0.5) {  //Math.random() returns value of double data type
					tail++;
				}
				else {
					head++;
				}
			counter++;				
			}
			System.out.println("No of Heads"+head);
			System.out.println("No of Tails"+tail);
			System.out.println("Head Percentage "+Utility.headPercentage(head, flip)); //no of heads And Flip
			System.out.println("Tail Percentage "+Utility.tailPercentage(tail, flip)); //no of tails And Flip
		}
		return head;
		
		}
		//For Tail Percentage
		/**
		 * @param tail integer number
		 * @param flip number of times coin flip
		 * @return double Tail Percentage
		 */
		public static double tailPercentage(int tail,int flip) {
			return (100*(double)tail)/flip;
		}
		//For Head Percentage
		/**
		 * @param head integer number
		 * @param flip number of times coin flip
		 * @return double Head Percentage
		 */
		public static double headPercentage(int head,int flip) {
			return (100*(double)head)/flip;
		}
		
		
		/*Title:Program to print Year is Leap or Not*/
		/**
		 * @param year integer value
		 * @return year is leap or not
		 */
		public static boolean leapOrNot(int year) {
			if(year>=1000||year<9999){
				if(year % 400==0 || year % 4 ==0 && year % 100 != 0) { //year % 400 & 4==0 is leap.But year % 100==0 is not Leap year
					//System.out.println("Leap Year");
					return true;
				}
				else{
					//System.out.println("Not Leap Year");
					return false;
				}
			}
			//System.out.println("Not Leap Year");
			return false;
			
		}
		
		/*Title:Program To find Power of 2 of N*/
		/**
		 * @param num integer number from command line
		 */
		public static void powerOfTwo(int num) {
			if(num>=0 && num <31 ) {
				int i=1;
				int result=1;
				while(i<=num) 
				{
				result=result*2;	
				//System.out.print(result+" ");
				i++;
				}
				System.out.println("2^"+num+"="+result);
			}
		}
		
		/*Title: Program To print harmonic value of a number*/
		/**
		 * @param num integer
		 * @return double harmonic value
		 */
		public static double harmonicValueOf(int num) {
			double result=0;
			if(num!=0) {
				for(int i=1;i<num;i++) {
					 result=result+(double)1/i;	//1/1 + 1/2 + ... + 1/num
				}
			//System.out.println("Harmonic Value Of "+result);
			}
			return result;
			
		}
				
		/*Print Factors And factorial of a Number */
		/**
		 * @param num integer type
		 * @return fact Factorial of num
		 */
		public static int factorOf(int num) 
		{
			int fact=1;					//initialise fact=1
			for(int i=num;i>=1;i--) {	//run for from num to 1
				fact=fact*i;			//multiply num with decreament i
				
			}
			//System.out.println("\nFacforial of "+num+" is "+fact);
			return fact;
		}
		
		
		
		//Functional Programs
		/*Title: A library for reading in 2D arrays of integers, doubles, or booleans from standard input
		 * and printing them out to standard output.*/
		//For Input	N*M Integer Numbers
		
		/**
		 * @param n no of rows integer
		 * @param m no of columns integer
		 */
		public static void printWriter(int n,int m) {
			int[][] arr = new int[n][m];
			System.out.println("Enter "+n*m+" Elements");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					arr[i][j]=Utility.inputNumber();
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
		//function to create array to store double Numbers
		/**
		 * @param n no of rows
		 * @param m	no of columns
		 */
		//function to create array to store integer Numbers
		public static void printWriterDouble(int n,int m) {
			double[][] arr = new double[n][m];
			System.out.println("Enter "+n*m+" Elements");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					arr[i][j]=Utility.inputDouble();
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
		//Fuction to create array to store Boolean data type
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

		
		
		
		/**Title:Program to print no of triplets=zero
		 * arr[i]+arr[j]+arr[k]==0
		 * @param arr of integer
		 */
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
		
		
		/*Title: program Distance.java that takes two integer command-line arguments x and y and prints
	  	   the Euclidean distance from the point (x, y) to the origin (0, 0).*/
		/**
		 * @param x integer value
		 * @param y integer value
		 * @return distance double data type
		 */
		public static double euclideanDistance(int x,int y) {
			double powX=(int)x*x;
			double powY=(int)y*y;
			double distance=Math.sqrt(powX+powY);
			return distance;
		}
		
		
		//Title:Program for Quadratic Equation
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
	
	
		//Title:Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke
		/**
		 * @param stack is integer number
		 * @param goal is integer number
		 * @param play is integer number which is shows how many times while loop executes
		 * @return win integer number that shows no of times user wins
		 */
		public static int gamePlay(int stack,int goal,int play) {
		int win=0,counter=0;
		while(counter < play && stack > 0 && goal > stack) {
			if(Math.random()>0.5) {		//if Math.random() returns double type of data
				win++;					//if value>0.5 then win increases
			}
			else {
				stack--;				//if value<0.5 then stack/money decreases
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
		public static void couponNumber(int num) {
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
			
			}
		
		//Title:Stopwatch Program for measuring the time that elapses between the start and end clicks
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
		
		//Title:Program for Vending Machine
		/**
		 * @param amount is integer number which is entered by user
		 */
		public static int calculateNotes(int amount) {
			int notes[]= {1000,500,100,50,20,10,5,2,1};	//Array which contains notes
			int[] noteCounts= new int[notes.length];	//Array to store no of Notes use to Change
			for(int i=0;i<notes.length;i++) {
				if(amount>=notes[i] && amount !=0) {
					noteCounts[i]=amount/notes[i];
					System.out.println(notes[i]+"X"+noteCounts[i]+"="+notes[i]*noteCounts[i]);//no of notes
					amount-=notes[i]*noteCounts[i];
				}
			}
			return amount;
		}
		
		//Newtons Sqrt
		
		/**
		 * @param num double data type value
		 * @param epsilon
		 */
		public static void sqrt(double num, double epsilon) {
			double t = num;
			while (Math.abs(t - num / t) > epsilon * t) {
				t = (num / t + t) / 2.0;
			}
			System.out.println("Square Root "+t);
		}
		//Tremperature Connversion
		/**Purpose:The temperature in fahrenheit as input outputs the temperature in Celsius or viceversa 
		 * using the formula Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
		 *					 Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
		 */
		
		/**
		 * @param ch integer input to select Choice
		 */
		public static void tempConvert(int ch){
		switch(ch) {
		case 1:
			System.out.println("Enter temperature in fahrenheit ");
			int f=Utility.inputNumber();
			int c=(f-32)*5/9;
			System.out.println("Temperature Fahrenheit "+f+" F into Celsius "+c+" C");
			break;
		case 2:
			System.out.println("Enter temperature in Celsius ");
			int c1=Utility.inputNumber();
			int f1=(c1*9/5)+32;
			System.out.println("Temperature Celsius "+c1+" C into Fahrenheit "+f1+" F");
			break;
		default:
			System.out.println("Select Correct choice");
			break;
		}
		}
		
		//Decimal To Binary
		
		/**Title:Program to convert Decimal number into Binary by using toBinary() static method
		 * @param number integer input enter by User
		 */
		public static void toBinary(int number) {
		String str="";				//String to store output
		if(number>0) {
			while(number!=0) {		//loop run upto number=0
				if(number%2==0) {  
					str=str+"0";	//if even no in string 0 is store
				}
				else {
					str=str+"1";	//if odd no in string 1 is store
				}
				number=(int)number/2; //number decrement
			}
			
		}
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i)+" "); //to print binary output reverse order
		}
		}
		
		//Title:To the Util Class add dayOfWeek static function that takes a date as input and prints the day of the
		//week that date falls on.
		/**
		 * @param y integer for input year
		 * @param m integer for input month
		 * @param d integer for date
		 */
		public static void dayOfWeek(int y,int m,int d) {
		int y0=y-(14-m)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0 = (d + x + (m0*31) / 12) % 7;	//output is from 0 to 6
		switch(d0) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		
		}
	}
	/* Write a Util Static Function to calculate monthlyPayment that reads in three command-line arguments 
	 * P, Y, and R and calculates the monthly payments you would have to make over Y years to pay off a P 
	 * principal loan amount at R per cent interest compounded monthly.
	 */
		//monthly payment
		public static int monthlyPayment(int p,int r,int n){
			return (int) ((p*r)/(1-Math.pow((1+r),(-n))));
		}
		//rate of interest
		public static int rateOfInterest(int rate) {
			return rate/(12*100);
		}
		//year
		public static int year(int y) {
			return y*12;
		}
		//Total Interest
		public static int totalInterest(int payment, int n, int p) {
			// TODO Auto-generated method stub
			return payment*n-p;
		}
		
		
		//Permutation of String
		/**
		 * @param str input string
		 * @param temp output permutation of string
		 */
		public static void permutation(String str,String temp) {
			int n=str.length();
			if(n==0) {
				System.out.println(temp+" ");
				return;
			}
			for(int i=0;i<n;i++) {
				char ch=str.charAt(i);
				String left=str.substring(0, i)+str.substring(i+1);
				permutation(left,temp+ch);
			}
			
		}
		//Program to find Prime numbers from range
		/**
		 * @param start integer number
		 * @param end integer number
		 */
		public static void primeRange(int start,int end){
			for(int i=start;i<end;i++) 
			{
				int flag=0;
				for(int j=2;j<i;j++) 
				{
					if(i%j==0) {
						flag=1;
					}
				}
				if(flag==0) {
					System.out.println(i);
				}
			}
		}
		
		
		
		//Title:Program for Bubble Sort
		/**
		 * @param arr String array which unsorted
		 * @param n integer size of Array
		 * @return Sorted Array
		 */
		public static int bubbleSort(int[] arr,int n) {
			for(int i=1;i<=n -1;i++) {
				for(int j=0;j< n-1-i;j++) {
					if(arr[j]>arr[j+1]) {	//if greater then swap it
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			return n;
		}
		
		//Title: Binary Search of String
		/**
		 * @param arr String Array
		 * @param key data type is String which is entered by the user to search in the array
		 * @return 0 or -1 if element present 0 will be return else -1 will be return
		 */
		public static int binarySearch(String[] arr,String key) {
		int low=0;
		int high=arr.length-1;
			while (low <= high) {
				int mid=low+(high-low) / 2;
				int res=key.compareTo(arr[mid]);
				if(res==0) {
					return mid;
				}
				if(res > 0) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}
			return -1;
		}
		
		//Title:Program for Insertion Sort
		/**
		 * @param arr Array of Integer which is to sort
		 */
		public static void insertionSort(int arr[]) {
		int size=arr.length;
		for(int i=1;i<size;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j] > temp) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
		for(int i=0;i<size;i++) {
		System.out.print(arr[i]+" ");
		}
		}
		
		//Title:Program for Merge Sort
		/**
		 * @param arr Array list
		 * @param l left side index value
		 * @param mid integer value
		 * @param r right side index value
		 * @return Sorted Array
		 */
		public static String[] mergeSort(String[] arr,int l,int mid,int r) {
			int n1=mid-l+1;
			int n2=r-mid;
			 String L[] = new String[n1]; 
		     String R[] = new String[n2]; 
	 
		     for (int i=0; i<n1; i++)
		    	 L[i] = arr[l + i];
		     for (int j=0; j<n2; ++j)
		    	 R[j] = arr[mid + 1+ j]; 
		     // Initial indexes of first and second subarrays 
		      int i = 0, j = 0; 
		      // Initial index of merged subarry array 
		      int k = l; 
		      while (i < n1 && j < n2) 
		      { 
		    	  if (L[i].compareTo(R[j]) < 0){
		    		  arr[k] = L[i]; 
		    		  i++; 
		    	  } 
		    	  else{
		    		  arr[k] = R[j];
		    		  j++; 
		    	  }
		      k++; 
		      } 

		        /* Copy remaining elements of L[] if any */
		        while (i < n1) 
		        { 
		            arr[k] = L[i]; 
		            i++; 
		            k++; 
		        } 
		  
		        /* Copy remaining elements of R[] if any */
		        while (j < n2) 
		        { 
		            arr[k] = R[j]; 
		            j++; 
		            k++; 
		        }
				return R; 
		  }
		//Program to Sort
		 public static void sort(String arr[], int l, int r) 
		    { 
		        if (l < r) 
		        { 
		            // Find the middle point 
		            int mid = (l+r)/2; 
		  
		            // Sort first and second halves 
		            sort(arr, l, mid); 
		            sort(arr, mid+1, r); 
		  
		            // Merge the sorted halves 
		            mergeSort(arr, l, mid, r); 
		        } 
		    }
		 //To print Array
		    public static void printArray(String arr[]) 
		    { 
		        int n = arr.length; 
		        for (int i=0; i<n; i++) 
		            System.out.print(arr[i]+" "); 
		        System.out.println(); 
		    }

		    
		    //Title: String is Anagram or Not
		    public static String sortString(String string) 
		    { 
		        // convert input string to char array 
		        char tempArray[] = string.toCharArray(); 
		          
		        // sort tempArray 
		        Arrays.sort(tempArray); 
		          
		        // return new sorted string 
		        return new String(tempArray); 
		    } 
		    
		    //PrimePalindrom
		    /**
		     * Title:Program to Print prime palindrome numbers
		     *
		     */
		    /**
		     * @param start integer
		     * @param end integer
		     */
		    public static void primePalindrom(int start,int end){
		    		for(int i=start;i<end;i++) 
		    		{
		    			int flag=0;
		    			for(int j=2;j<i;j++) 
		    			{
		    				if(i%j==0) {
		    					flag=1;
		    				}
		    			}
		    			if(flag==0) {
		    				
		    				palindrom(i);
		    				
		    			}
		    		}
		    }
		   	public static void palindrom(int i) {
		   		int temp = 0, remainder;
		   		int num=i;
		   		while (i != 0) {
	    	        remainder = i % 10;
	    	        temp = temp * 10 + remainder;
	    	        i /= 10;
	    	    }
		        // palindrome if num and temp is equal
		    	if (num == temp)
		   	        System.out.println(num);
		   	}
		   	
		   	//Title: guessing the user's number

			/**
			 * @param arr array of integer
			 * @param low
			 * @param high
			 * @return
			 */
			public static int binarySearchInt(int arr[], int low, int high) {
				if (high >= low) {
					int mid = low + (high - low) / 2; // finding mid
					System.out.println(arr[mid] + " is the number :");
					System.out.println("if greater press g else l"); // asking user for correct answer
					String key = inputString();
					if (key.equals("y"))
						return mid;
					else if (key.equals("g"))
						return binarySearchInt(arr, mid + 1, high); // recursively calling binarySearchInt method
					else if (key.equals("l"))
						return binarySearchInt(arr, low, mid - 1);
					else
						return binarySearchInt(arr, low, high);
				}
				return -1;
			}

			
}
