package com.bridgelabz.algorithmPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import com.bridgelabz.utility.Utility;

/**
 * Title:Binary Search the Word from File
 * 
 * created by:Ankit Rajput
 *
 */
public class BinarySearch1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("/home/admin1/Desktop/files/sample.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		int count = 0;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			count++;
		}
		String[] str = new String[count];
		int j = 0;
		while ((st = br.readLine()) != null) {
			str[j] = st;
			j++;

			System.out.println("Enter word to Search");
			String key = Utility.inputString(); // word to search

			int result = Utility.binarySearch(str, key); // arr is list of words
			if (result == -1) {
				System.out.println("Word Not Found");
			} else {
				System.out.println("Word Found At " + result);
			}
		}
		br.close();
	}
}
