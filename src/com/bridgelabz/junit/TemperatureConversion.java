package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select What do you need?\n1.Fahrenheit To Celsius\n2.Celsius To Fahrenheit\nSelect Choice");
		int ch=Utility.inputNumber();
		switch(ch) {
		case 1:
			System.out.println("Enter temperature in fahrenheit ");
			int f=Utility.inputNumber();
			int c=(f-32)*5/9;
			System.out.println("Temperature Fahrenheit "+f+" F into Celsius "+c+" C");
			break;
		case 2:
			System.out.println("Enter temperature in Celsius ");
			int c1=Utility.inputNumber();
			int f1=(c1*9/5)+32;
			System.out.println("Temperature Celsius "+c1+" C into Fahrenheit "+f1+" F");
			break;
		default:
			System.out.println("Select Correct choice");
			break;
		}
		
	}

}
