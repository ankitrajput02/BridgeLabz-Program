package com.bridgelabz.junit;
import com.bridgelabz.utility.Utility;

/**
 * Title:The temperature in fahrenheit as input outputs the temperature in Celsius or viceversa 
 * using the formula Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
 *					 Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
 *	
 *
 */
public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select What do you need?\n1.Fahrenheit To Celsius\n2.Celsius To Fahrenheit\nSelect Choice");
		int ch=Utility.inputNumber();
		Utility.tempConvert(ch);
		
	}
}
