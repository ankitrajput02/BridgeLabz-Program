package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

/**Created By:Ankit Rajput
 * Date:18/01/2020
 * Title:Program find the Fewest Notes to be returned for Vending Machine
 * Desc ->There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
 * returned by Vending Machine. Write a Program to calculate the minimum number
 * of Notes as well as the Notes to be returned by the Vending Machine as a Change
 * I/P -> read the Change in Rs to be returned by the Vending Machine
 * O/P -> Two Outputs - one the number of minimum Note needed to give the change 
 * and second list of Rs Notes that would given in the Change
 *
 */
public class VendingMachine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter amount");
		int amount=Utility.inputNumber();
		Utility.calculateNotes(amount);
	}

	
}
//	
//	while(amount!=0) {
//			for(int i=notes.length-1;i>=0;i--) {
//				for(int j=)
//				if(amount>=notes[i] && amount != 0) {
//					noteCounts[i]=amount/notes[i];
//					System.out.println(notes[i]+"X"+noteCounts[i]+"="+notes[i]*noteCounts[i]);
//					int amount1=notes[i]*noteCounts[i];
//					if(amount1==0) {
//						break;
//					}
//					else {
//						amount-=amount1;
//						//System.out.println("Remains "+amount);
//						calculateNotes(amount,notes,noteCounts);
//					}
//				}
//				else if(amount>0){
//					i--;
//				}
//		
//			}
//		}
