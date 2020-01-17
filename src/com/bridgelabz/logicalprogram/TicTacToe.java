package com.bridgelabz.logicalprogram;

import com.bridgelabz.utility.Utility;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] gameDesk= {{' ','|',' ','|',' '},
							{'-','+','-','+','-'},
							{' ','|',' ','|',' '},
							{'-','+','-','+','-'},
							{' ','|',' ','|',' '}};
	//Before play
	System.out.println("Before Play");
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			System.out.print(gameDesk[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Select Choice 'X' or 'O'");
	char ch=Utility.inputChar();
	char symbol=' ';
	if(ch=='X'||ch=='x') {
		symbol='X';
	}
	
	}
}
