package com.bridgelabz.datastructure;

import com.bridgelabz.utility.QueueUtility;
import com.bridgelabz.utility.Utility;

/**Title:Program to creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash.
 * Have an input panel to add people to Queue to either deposit or withdraw money and dequeue the people.
 * Maintain the Cash Balance.
 * 
 *
 */
public class BankingCashCounter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bankBalance=100000;
		
		System.out.println("Enter How many Users?");
		int user=Utility.inputNumber();
		
		for (int i = 0; i < user; i++) {
			//int data=Utility.inputNumber();
			QueueUtility.enQueue(i);	//enqueue data adding users to Queue
		}
		System.out.println(user+" Added..");
		for (int i = 0; i < user; i++) {
			bankBalance=Utility.transactions(bankBalance);
		}
	
		
	}

}
