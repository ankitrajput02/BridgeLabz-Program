package com.bridgelabz.datastructure;

import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.utility.Utility;

/**Title:Program to read a List of Numbers from a file and arrange it ascending Order in a Linked List.
 * Take user input for a number, if found then pop the number out of the list else insert the number in 
 * appropriate position.
 *
 */
public class OrderList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
		//addAll():Appends all of the elements in the specified collection to the end of the list
		ll.addAll(Utility.readFileInteger("/home/admin1/workspace-pro/Program/numbernew.txt"));	//Path of file
		int[] arr1=Utility.linkedListToArrayConversion(ll);	//convert LinkedList into Array
		Utility.bubbleSort(arr1);		//to sort array
		//Insert sorted data into Linked List
		for(int data:arr1) {		//Enhance for loop
			Utility.insertLinkedListInt(data);
		}
		//after inserting data will be
		System.out.println("After inserting data into linked List data will be");
		Utility.printLinkedListInt();
		System.out.println("Enter Number to Find");
		int num=Utility.inputNumber();
		Utility.findNumber(num);
		
	}
	

}
