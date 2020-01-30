package com.bridgelabz.datastructure;

import com.bridgelabz.utility.QueueLinkedListUtility;
import com.bridgelabz.utility.Utility;

/**Title:Program to check String is Palindrom or Not
 * Created By:Ankit Rajput
 *
 */
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String to Check Palindrom or Not");
		String str=Utility.inputString();
		int s=str.length();
		int mid=s/2;
		for (int i = s-1; i >=0 ; i--) {
			QueueLinkedListUtility.enqueue(str.charAt(i));	//add String of characters into Queue Linked List
		}
		QueueLinkedListUtility.printQueue();
		System.out.println();
	char ch1,ch2;
	int flag=0;
	for(int i=0;i<mid;i++) {
		ch1 = QueueLinkedListUtility.dequeueFront(); //Dequeue or Remove character from front of Queue
		ch2 = QueueLinkedListUtility.dequeueRear();	//Dequeue or Remove character from rear of Queue
		if(ch1!=ch2) {			//check two characters are Equal or not
			flag=1;
		}
	
	}
	if(flag==0) {
		System.out.println("String is Palindrom");
	}
	else {
		System.out.println("String is not Palindrom");
	}
	}

}
