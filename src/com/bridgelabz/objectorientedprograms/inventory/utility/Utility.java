package com.bridgelabz.objectorientedprograms.inventory.utility;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Purpose: Utility for code reusability
 *
 */
public class Utility {

	static Scanner sc = new Scanner(System.in);

	public static int inputNumber() {
		return sc.nextInt();
	}
	public static double inputDouble() {
		return sc.nextDouble();
	}

	public static String inputString() {
		return sc.next();
	}

	public static Long inputlong() {
		return sc.nextLong();
	}

	public static boolean inputBoolean() {
		return sc.nextBoolean();	
	}

	public static float inputFloat() {
		return sc.nextFloat();
	}
//	MyProperties properties = new MyProperties();
//	static ObjectMapper mapper = new ObjectMapper();
//	static File file = new File("/home/admin1/workspace-pro/Program/src/Resource/inventory2.json");
//
//	public static List<MyProperties> readFile() throws IOException{
//		List<MyProperties> list = mapper.readValue(file, new TypeReference <List<MyProperties>>() {});
//		return list;
//	}
//	public static List<MyProperties> writeFile(List<MyProperties> list) throws IOException {
//		// TODO Auto-generated method stub
//		mapper.enableDefaultTyping().writeValue(file, list);
//		return list;
//	}
	public static String stringValidation(String inputString) {
		// TODO Auto-generated method stub
		//String str=("^[a-zA-Z]*$");
		Pattern pr = Pattern.compile("^[a-zA-Z]*$");  
		if(!pr.matcher(inputString).matches()) {
			throw new InputMismatchException();
		}
		else {
			
			return inputString;
			}
		}


}