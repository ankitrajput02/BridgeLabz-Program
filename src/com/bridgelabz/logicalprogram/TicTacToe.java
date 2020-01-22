package com.bridgelabz.logicalprogram;

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
		while(true){
		
		int num=9;
		while(num>=0){
		
		System.out.println("Enter Position");
		int pos=Utility.inputNumber();
		System.out.println(pos);
		if(num%2==0)
		{
		placeSymbol(gameBoard,pos,"Player 1");
		printGameBoard(gameBoard);
		num--;
		}
		else{
		placeSymbol(gameBoard,pos,"Player 2");
		printGameBoard(gameBoard);
		num--;
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
		
		public static void placeSymbol(char[][] gameBoard,int pos,String user)
		{
		char symbol=' ';
		if(user=="Player 1"){
			symbol='X';
		}
		else if(user=="Player 2"){
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
				System.out.println("Player 1 Win");
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
				System.out.println("Player 2 Win");
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
					if(gameBoard[4][0]=='X'||gameBoard[5][1]=='O'){
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