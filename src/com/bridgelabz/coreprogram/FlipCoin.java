/**
 * Created By:Ankit Rajput
 * Title: Flip Coin and print percentage of Heads and Tails
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
		int result=Utility.flipCoin(flip);
		System.out.println(result);
	}
}
