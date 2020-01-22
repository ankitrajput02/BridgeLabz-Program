package com.bridgelabz.coreprogram;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi Hello Ankit";
		String arr1[]=str.split(" ");
		
		for (int i = 0; i < arr1.length; i++) {
			char[] arr=arr1[i].toCharArray();
			for (int j = arr.length-1; j >=0; j--) {
				System.out.print(arr[j]);
			}
			System.out.print(" ");
		}
		
	}
}
	

		
	