package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Principle Loan amount");
		int P=Utility.inputNumber();
		System.out.println("Year");
		int y=Utility.inputNumber();
		System.out.println("Interest rate");
		int R=Utility.inputNumber();
		int r=Utility.rateOfInterest(R);//rate
		int n=Utility.year(y); //year
		int payment=Utility.monthlyPayment(P,r,n);
		int interest=Utility.totalInterest(payment,n,P);
		System.out.println("Interest "+interest);
		System.out.println("Payment "+payment);
	}
}