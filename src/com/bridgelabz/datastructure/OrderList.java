package com.bridgelabz.datastructure;

import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.utility.Utility;

public class OrderList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.addAll(Utility.readFileInteger("/home/admin1/workspace-pro/Program/numberdata.txt"));
		int[] arr1=linkedListToArrayConversion(ll);
		Utility.bubbleSort(arr1);
		//Insert sorted data into Linked List
		for(int data:arr1) {
			Utility.insertLinkedListInt(data);
		}
		//after inserting data will be
		System.out.println("After inserting data into linked List data will be");
		Utility.printLinkedListInt();
		System.out.println("Enter Number to Find");
		int num=Utility.inputNumber();
		Utility.findNumber(num);
		
	}
	public static int[] linkedListToArrayConversion(LinkedList<Integer> ll) {
		int n=ll.size();
		int[] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=ll.get(i);
		}
		return arr;
	}

}
