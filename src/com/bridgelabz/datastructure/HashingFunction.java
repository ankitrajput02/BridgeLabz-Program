package com.bridgelabz.datastructure;

import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.utility.LinkedListUtility;
import com.bridgelabz.utility.Utility;

/**Title:Hashing Function to search a Number in a slot
 * Created By:Ankit Rajput
 *
 */
public class HashingFunction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
		//addAll():Appends all of the elements in the specified collection to the end of the list
		ll.addAll(Utility.readFileInteger("/home/admin1/workspace-pro/Program/number.txt"));
		int arr []=Utility.linkedListToArrayConversion(ll); //LinkedList to Array Conversion
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
			System.out.println("Stack "+i);
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
