package com.bridgelabz.datastructure;

import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.utility.Utility;

/**Title:Read the Text from a file, split it into words and arrange it as Linked List.Take a user input to 
 * search a Word in the List. If the Word is not found then add it to the list, and if it found then remove
 * the word from the List.
 * Created By:Ankit Rajput
 */
public class UnOrderedList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedList<String> str=new LinkedList<String>(); 
		str = Utility.readFile("/home/admin1/workspace-pro/Program/dataFile.txt");
		for(String data: str) {
			Utility.insertLinkedList(data);
		}
		//
		Utility.printLinkedList();
		System.out.println("Enter word to search..");
		String find=Utility.inputString();
		Utility.findAddOrDelete(find);


	}	





}
