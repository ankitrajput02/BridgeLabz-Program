package com.bridgelabz.datastructure;
import java.util.ArrayList;
import com.bridgelabz.utility.StackUsingLinkedListUtility;
import com.bridgelabz.utility.Utility;
/**	Title:Program to add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using the Linked
 * 	List and Print the Anagrams in the Reverse Order. 
 *	Created By:Ankit Rajput
 */
public class StackUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		int arr[] = new int[100];

		al = Utility.primeNoRange(1000); //prime number list
		arr = Utility.primeAnagramArray(al); // prime anagram array
		Utility.bubbleSort(arr);
		int length = arr.length;
		length = Utility.removeDuplicatesFromArray(arr, length); //removing duplicates from array
		for (int i = 0; i < length; i++) {
			if (arr[i] != 0)
				StackUsingLinkedListUtility.push(arr[i]); //pushing data to stack
		}
		while (length > 1) {
			int data = StackUsingLinkedListUtility.pop(); //removing data from stack
			System.out.println(data); // printing data
			length--;
		}
	}

}

