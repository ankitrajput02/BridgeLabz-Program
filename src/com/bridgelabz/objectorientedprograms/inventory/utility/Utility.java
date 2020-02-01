package com.bridgelabz.objectorientedprograms.inventory.utility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class Utility {
	static Scanner scan=new Scanner(System.in);
	public static int inputNumber() {
		// TODO Auto-generated method stub
		int num=0;
		try {
			num=scan.nextInt();
		}
		catch(Exception exception){
			System.out.println("Please enter integer Only");
		}
		return 0;
	}
	/**
	 * accept string from user
	 * 
	 * @return String
	 */
	public static String inputString() {
		String str = new String();
		try {
			str = scan.next();
		} catch (Exception e) {
			System.out.println("Exception:Enter String only");
		}
		return str;
	}
	
	/**
	 * accept input type double
	 * 
	 * @return double number
	 */
	public static double inputDouble() {
		double num = 0.0;
		try {
			num = scan.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception:Enter value in double only");

		}
		return num;
	}
	
	
	
	
	Properties properties=new Properties();
	static ObjectMapper mapper=new ObjectMapper();
	File file=new File("inventory.json");
	
	public static List<Properties> readFile() throws IOException	{
		List<Properties> list=mapper.readValue(file ,new TypeReference <List<Properties>>() {
			
		} );
		return list;
	}

	public static void writeFile(List<Properties> list) throws IOException {
		mapper.enableDefaultTyping().writeValue(file, list);
		//ObjectMapper.writerWithDefaultPrettyPrinter.
		//mapper.defaultPrettyPrintingWriter().writeValue(file, list);
	}
	

	
}
