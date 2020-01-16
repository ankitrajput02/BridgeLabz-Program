package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter point(X,Y) from origin(0,0)");
		int x=Utility.inputNumber();
		int y=Utility.inputNumber();
		System.out.println(Utility.euclideanDistance(x, y));
	}

}
  