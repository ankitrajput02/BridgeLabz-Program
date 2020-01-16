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
