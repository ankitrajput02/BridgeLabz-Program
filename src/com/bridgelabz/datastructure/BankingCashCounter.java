package com.bridgelabz.datastructure;

import com.bridgelabz.utility.QueueUtility;
import com.bridgelabz.utility.Utility;

public class BankingCashCounter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bankBalance=100000;
		
		System.out.println("Enter How many Users?");
		int user=Utility.inputNumber();
		
		for (int i = 0; i < user; i++) {
			//int data=Utility.inputNumber();
			QueueUtility.enQueue(i);
		}
		System.out.println(user+" Added..");
		for (int i = 0; i < user; i++) {
			bankBalance=Utility.transactions(bankBalance);
		}
	
		
	}

}
