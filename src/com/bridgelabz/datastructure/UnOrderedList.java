package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.utility.Utility;

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
