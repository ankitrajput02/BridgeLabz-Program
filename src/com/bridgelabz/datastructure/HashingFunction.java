package com.bridgelabz.datastructure;

import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.utility.LinkedListUtility;
import com.bridgelabz.utility.Utility;

public class HashingFunction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.addAll(Utility.readFileInteger("/home/admin1/workspace-pro/Program/numberdata.txt"));
		int arr []=Utility.linkedListToArrayConversion(ll);
		Object [] obj=new Object[11];
		for (int i = 0; i < 11; i++) {
			obj[i]=new LinkedListUtility<Integer>();
		}
		int stack=0;
		for(int i=0;i<arr.length;i++) {
			stack=arr[i]%11;
			@SuppressWarnings("unchecked")
			LinkedListUtility<Integer> list = (LinkedListUtility<Integer>) obj[stack];
			list.insert(arr[i]);
		}
		for (int i = 0; i < obj.length; i++) {
			LinkedListUtility<Integer> list = (LinkedListUtility)obj[i];
			System.out.println("Stack "+i+"->");
			list.show();
			System.out.println();
		}
		System.out.println("Enter data to search ");
		int data=Utility.inputNumber();
		LinkedListUtility list=(LinkedListUtility)obj[data%11];
		if(list.search(data)) {
			System.out.println("Found in stack no "+data%11);
			list.delete(data);
			list.show();
			
		}
		else {
			System.out.println("Not Found");
			LinkedListUtility list1 = (LinkedListUtility)obj[data%11];
			list1.insert(data);
			System.out.println("Stack no "+data%11);
			list1.show();
		}
	}

}
