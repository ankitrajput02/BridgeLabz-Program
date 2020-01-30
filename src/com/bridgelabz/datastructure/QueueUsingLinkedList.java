package com.bridgelabz.datastructure;
import java.util.ArrayList;
import com.bridgelabz.utility.QueueLinkedListUtility;
import com.bridgelabz.utility.Utility;

/**Title:Program to add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Queue using the Linked
 * List and Print the Anagrams from the Queue
 * Created By:Ankit Rajput
 * 
 *
 */
public class QueueUsingLinkedList {

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
			if (arr[i] != 0) {
				QueueLinkedListUtility.enqueue(arr[i]);
			}
		}
		while (length > 1) {
			int data = QueueLinkedListUtility.dequeue(); //removing data from stack
			System.out.print(data+" "); // printing data
			length--;
		}
	}

}

