package com.bridgelabz.datastructure;

/**	Title : Program to find the Prime numbers in the range of 0 - 1000. Store the prime numbers in a 2D Array,
 * 	the first dimension represents the range 0-100, 100-200, and so on. While the second dimension represents 
 * the prime numbers in that range.
 * 
 * 
 *
 */
public class Prime2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i <= 1000;i++)
		{
			int flag=0;
			for (int j = 2; j<i; j++) 
			{
				if(i%j==0) 
				{
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
			
			
		}
	}

}
