package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,4,6,15,7,2,9,20,25,5};
		int n=arr.length;
		Utility.bubbleSort(arr, n);
		for(int i=0;i<n-1;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
