package com.bridgelabz.logicalprogram;
import com.bridgelabz.utility.Utility;

/**
 * Created By:Ankit Rajput
 * Date:17/01/2020
 * Title-> Given N distinct Coupon Numbers,how many random numbers do you need to generate distinct
 * 		   coupon number? This program simulates this random process.
 * I/P -> N Distinct Coupon Number
 * Logic -> repeatedly choose a random number and check whether it's a new one.
 * O/P -> total random number needed to have all distinct numbers.
 * Functions => Write Class Static Functions to generate random number and to process distinct coupons.
 * 
 */
public class CouponNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many coupon numbers you need?");
		int num=Utility.inputNumber();
		Utility.couponNumber(num);
	}
}
