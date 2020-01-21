package com.bridgelabz.functionalprogram;
import com.bridgelabz.utility.Utility;

/**Created By:Ankit Rajput
 * Title:Program WindChill.java that takes two double command-line arguments t and v and prints the
 * wind chill. Use Math.pow(a, b) to compute ab. Given the temperature t (in Fahrenheit) and the
 * wind speed v (in miles per hour), the National Weather Service defines the effective temperature
 * (the wind chill) to be:
 *	w = 35.74 +(0.6215*t)-(35.75*Math.pow(v,0.16))+(0.4275*t*Math.pow(v,0.16))
 */
public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Temperature And Wind Speed");
		double t=Utility.inputDouble();		//t temperature(Fahrenheit)
		double v=Utility.inputDouble();		//v wind speed
		System.out.println("Wind Chill "+Utility.windChill(t, v)+" F");
	}
}