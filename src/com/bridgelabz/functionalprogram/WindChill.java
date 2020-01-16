package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Temperature And Wind Speed");
		double t=Utility.inputDouble();		//t temperature(Fahrenheit)
		double v=Utility.inputDouble();		//v wind speed
		if( (t > 50) || (v > 120) || ( v < 3) ) {
			System.out.println("Values Should be in Range");
		}
		else {
			double w = 35.74 +(0.6215*t)-(35.75*Math.pow(v,0.16))+(0.4275*t*Math.pow(v,0.16));
			System.out.println(w);
		}
	}

}
