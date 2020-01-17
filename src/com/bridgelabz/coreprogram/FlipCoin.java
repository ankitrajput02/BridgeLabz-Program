/**
 * Created By:Ankit Rajput
 * Purpose: Flip Coin and print percentage of Heads and Tails
 *			I/P -> The number of times to Flip Coin
 *			O/P -> Percentage of Head vs Tails
 * Date:16/01/2020 
 */
package com.bridgelabz.coreprogram;
import com.bridgelabz.utility.Utility;
import java.math.*;

public class FlipCoin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many times you want to flip coin?");
		int flip=Utility.inputNumber();
		int tail=0,head=0;
		if(flip>0) {
			int counter=0;
			while(counter < flip) {
				if(Math.random() < 0.5) {
					tail++;
				}
				else {
					head++;
				}
			counter++;	
			}
			System.out.println("No of Heads"+head);
			System.out.println("No of Tails"+tail);
			System.out.println("Head Percentage "+Utility.headPercentage(head, flip));
			System.out.println("Tail Percentage "+Utility.tailPercentage(tail, flip));
		}
	}
}
