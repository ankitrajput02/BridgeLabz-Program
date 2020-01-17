package com.bridgelabz.logicalprogram;

import com.bridgelabz.utility.Utility;

public class TicTacToe {
	public void printDesk(char[][] gameDesk) {
		System.out.println("Before Play");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(gameDesk[i][j]+" ");
			}
			System.out.println();
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] gameDesk= {{' ','|',' ','|',' '},
							{'-','+','-','+','-'},
							{' ','|',' ','|',' '},
							{'-','+','-','+','-'},
							{' ','|',' ','|',' '}};
	//Before play
	TicTacToe t=new TicTacToe();
	t.printDesk(gameDesk);
	System.out.println("Select Choice 'X' or 'O'");
	char ch=Utility.inputChar();
	char symbol=' ';
	if(ch=='X'||ch=='x') {
		symbol='X';
	}
	int count=0;
	while(count<9) {
	System.out.println("Enter Position");
	int pos=Utility.inputNumber();
	switch(pos) {
	case 1:
		gameDesk[0][0]=symbol;
		break;
	case 2:
		gameDesk[0][2]=symbol;
		break;
	case 3:
		gameDesk[0][4]=symbol;
		break;
	case 4:
		gameDesk[2][0]=symbol;
		break;
	case 5:
		gameDesk[2][2]=symbol;
		break;
	case 6:
		gameDesk[2][4]=symbol;
		break;
	case 7:
		gameDesk[4][0]=symbol;
		break;
	case 8:
		gameDesk[4][2]=symbol;
		break;
	case 9:
		gameDesk[4][4]=symbol;
		break;
	default:
		System.out.println("Enter valid position");
		break;
	}
	t.printDesk(gameDesk);
	count++;
	}
	}
}
