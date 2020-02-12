package utility;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

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
	public static String zipValidation(String inputString1) {
		Pattern zipCode=Pattern.compile("^\\d{6}(?:[\\s]\\d{4})?$");
		if(!zipCode.matcher(inputString1).matches()) {
			throw new InputMismatchException();
		}
		else {
			return inputString1;	
		}
		
	}

}
