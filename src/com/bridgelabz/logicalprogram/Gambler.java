package com.bridgelabz.logicalprogram;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Ankit Rajput
 * Date:17/01/2020
 * Title: Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke
 * (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number
 * of bets he/she makes.Run the experiment N times, averages the results, and prints them out.
 * I/P->$Stake, $Goal and Number of times
 * O/P -> Print Number of Wins and Percentage of Win and Loss.
 */
public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The $Stack");
		int stack=Utility.inputNumber();
		System.out.println("Enter $Goal");
		int goal=Utility.inputNumber();
		System.out.println("How many times you want to play?");
		int play=Utility.inputNumber();
		int win=Utility.gamePlay(stack, goal, play);
		System.out.println("Win "+win);
		
//		int win=0,counter=0;
//		while(counter < play && stack > 0 && goal > stack) {
//			if(Math.random()>0.5) {
//				win++;
//			}
//			else {
//				stack--;
//			}
//		counter++;
//		}
//		System.out.println("Win "+win);
//		System.out.println("Percentage of Winning "+(double)win/play*100);
		
	}

}
