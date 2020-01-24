package com.bridgelabz.logicalprogram;

import java.util.Random;

import com.bridgelabz.utility.Utility;

/**Title:Program for Tic-Tac-Toe
 * Created By:Ankit Rajput
 *
 */
public class TicTacToe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] gameBoard={
							{' ','|',' ','|',' '},
							{'-','+','-','+','-'},
					{' ','|',' ','|',' '},
							{'-','+','-','+','-'},
							{' ','|',' ','|',' '}};
		printGameBoard(gameBoard);
		int arr[]= {0,0,0,0,0,0,0,0,0,0};
		
		while(true) {
			System.out.println("Enter Position");
			int pos=Utility.inputNumber();
			System.out.println(pos);
			if(arr[pos]==0) {
				placeSymbol(gameBoard,pos,"Player");
				printGameBoard(gameBoard);
				arr[pos]=pos;
			}else {
				System.out.println("Enter Correct No");
				pos=Utility.inputNumber();
				placeSymbol(gameBoard,pos,"Player");
				printGameBoard(gameBoard);
				arr[pos]=pos;
			}
			Random rand=new Random();
			int cpos=rand.nextInt(9)+1;
			
				while(arr[cpos]==0) {
					if(arr[cpos]>0) {
						cpos=rand.nextInt(9)+1;
						System.out.println("PC"+cpos);
					}
					else {
						System.out.println("PC"+cpos);
						arr[cpos]=cpos;
						placeSymbol(gameBoard,cpos,"Computer");
						printGameBoard(gameBoard);	
					}
				}
					
			}
	}
			
		public static void printGameBoard(char[][] gameBoard)
		{
			for(char[] row : gameBoard){
				for(char c : row){
					System.out.print(c);
				}
				System.out.println();
			}
			
		}
		
		public static void placeSymbol(char[][] gameBoard,int pos,String user){
		char symbol=' ';
		if(user.equals("Player")){
			symbol='X';
		}
		else if(user.equals("Computer")){
			symbol='O';
		}
		int count=0;
		while(count<9)
		{
			if((gameBoard[0][0]=='X' && gameBoard[0][2]=='X' && gameBoard[0][4]=='X')||
				(gameBoard[2][0]=='X' && gameBoard[2][2]=='X' && gameBoard[2][4]=='X')||
				(gameBoard[4][0]=='X' && gameBoard[4][2]=='X' && gameBoard[4][4]=='X')||
				(gameBoard[0][0]=='X' && gameBoard[2][0]=='X' && gameBoard[4][0]=='X')||
				(gameBoard[0][2]=='X' && gameBoard[2][2]=='X' && gameBoard[4][2]=='X')||
				(gameBoard[0][4]=='X' && gameBoard[2][4]=='X' && gameBoard[4][4]=='X')||
				(gameBoard[0][0]=='X' && gameBoard[2][2]=='X' && gameBoard[4][4]=='X')||
				(gameBoard[0][4]=='X' && gameBoard[2][2]=='X' && gameBoard[4][0]=='X'))
			{
				System.out.println("Player Win");
				break;
			}
			else if((gameBoard[0][0]=='O' && gameBoard[0][2]=='O' && gameBoard[0][4]=='O')||
					(gameBoard[2][0]=='O' && gameBoard[2][2]=='O' && gameBoard[2][4]=='O')||
					(gameBoard[4][0]=='O' && gameBoard[4][2]=='O' && gameBoard[4][4]=='O')||
					(gameBoard[0][0]=='O' && gameBoard[2][0]=='O' && gameBoard[4][0]=='O')||
					(gameBoard[0][2]=='O' && gameBoard[2][2]=='O' && gameBoard[4][2]=='O')||
					(gameBoard[0][4]=='O' && gameBoard[2][4]=='O' && gameBoard[4][4]=='O')||
					(gameBoard[0][0]=='O' && gameBoard[2][2]=='O' && gameBoard[4][4]=='O')||
					(gameBoard[0][4]=='O' && gameBoard[2][2]=='O' && gameBoard[4][0]=='O')){
				System.out.println("Computer Win");
				break;
			}
			else
				switch(pos)
				{
				case 1:
					if(gameBoard[0][0]=='X'||gameBoard[0][0]=='O'){
						return;
					}
					else
						gameBoard[0][0]=symbol;
					break;
				case 2:
					if(gameBoard[0][2]=='X'||gameBoard[0][2]=='O'){
						return;
						
					}
					else
						gameBoard[0][2]=symbol;
					break;
				case 3:
					if(gameBoard[0][4]=='X'||gameBoard[0][4]=='O'){
						return;
					}
					else
						gameBoard[0][4]=symbol;
					break;
				case 4:
					if(gameBoard[2][0]=='X'||gameBoard[2][0]=='O'){
						return;
					}
					else
						gameBoard[2][0]=symbol;
					break;
				case 5:
					if(gameBoard[2][2]=='X'||gameBoard[2][2]=='O'){
						return;
					}
					else
						gameBoard[2][2]=symbol;
					break;
				case 6:
					if(gameBoard[2][4]=='X'||gameBoard[2][4]=='O'){
						return;
					}
					else
						gameBoard[2][4]=symbol;
					break;
				case 7:
					if(gameBoard[4][0]=='X'||gameBoard[4][1]=='O'){
						return;
					}
					else
						gameBoard[4][0]=symbol;
					break;
				case 8:
					if(gameBoard[4][2]=='X'||gameBoard[4][2]=='O'){
						return;
					}
					else
						gameBoard[4][2]=symbol;
					break;
				case 9:
					if(gameBoard[4][4]=='X'||gameBoard[4][4]=='O'){
						return;
					}
					else
						gameBoard[4][4]=symbol;
					break;
				default:
					break;
			}
		count++;
		}
}
		
}