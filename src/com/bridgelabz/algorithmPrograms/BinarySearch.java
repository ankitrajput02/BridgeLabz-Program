package com.bridgelabz.algorithmPrograms;

import java.io.FileWriter;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] st=new String[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Data");
		for(int i=0;i<)
		String str=sc.next();
		System.out.println("Enter Word to Find from file");
		String find=sc.next();
		FileWriter fw=new FileWriter("/home/admin1/Desktop/files/sample.txt");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==',') {
				fw.write("\n");
			}
			else {
				fw.write(str.charAt(i));
			}
		}
		fw.close();
		for(int i=0;i<find.length();i++) {
			for(int j=0;j<str.length();j++) {
				
		}
	}
	
}
