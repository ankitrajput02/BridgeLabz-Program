package com.bridgelabz.objectorientedprograms.inventory.utility;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.objectorientedprograms.inventory.model.Properties;
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


	Properties properties = new Properties();
	static ObjectMapper mapper = new ObjectMapper();
	static File file = new File("/home/admin1/workspace-pro/Program/src/Resource/inventory11.json");

	public static List<Properties> readFile() throws IOException{
		List<Properties> list = mapper.readValue(file, new TypeReference <List<Properties>>() {});
		return list;
	}

	//	public static void writeFile(List<Properties> list) throws IOException {
	//		mapper.defaultPrettyPrintingWriter().writeValue(file, list);
	//	}
	@SuppressWarnings("deprecation")
	public static List<Properties> writeFile(List<Properties> list) throws JsonMappingException, IOException {
		// TODO Auto-generated method stub
//		mapper.enableDefaultTyping().writeValue(file, list);
		mapper.defaultPrettyPrintingWriter().writeValue(file, list);
//		mapper.enableDefaultTyping().writeValue(file, list);
		return list;
	}

	public static String stringValidation(String inputString) {
		// TODO Auto-generated method stub
		String str=("^[a-zA-Z]*$");
		Pattern pr = Pattern.compile(str);  
		if(pr.matcher(inputString).matches()) {
			return inputString;
		}
		else {
			throw new InputMismatchException();
			}
		}


}