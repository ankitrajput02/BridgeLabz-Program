package com.bridgelabz.logicalprogram;
import com.bridgelabz.utility.Utility;

public class TicTacToe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] gameDesk= {{' ','|',' ','|',' '},
				{'-','|','-','|','-'},
				{' ','|',' ','|',' '},
				{'-','|','-','|','-'},
				{' ','|',' ','|',' '}};
		//Before play
		char arr[]=new char[10];
		
	}







	//		while(true) {
	//		int num=9;int pos=0;
	//		while(num>=0) {
	//			if(num%2==0) {
	//				num--;
	//				int distinct=0;
	//				
	//				while(distinct<10) {
	//					pos=(int)(Math.random()*9);
	//					if(!newPos[pos] ) {
	//						System.out.println(pos);
	//						placeSymbol(gameDesk,pos,'p');
	//						printDesk(gameDesk);
	//						distinct++;
	//						//newPos[pos]=true;
	//					}
	//				}
	//				
	//			}	
	//			else {
	//				System.out.println("Enter Position");
	//				pos=Utility.inputNumber();
	//				placeSymbol(gameDesk,pos,'u');
	//				printDesk(gameDesk);
	//				num--;
	//			}
	//		}
	//	}

public static void printDesk(char[][] gameDesk) {
	//System.out.println("Before Play");
	for(int i=0;i<gameDesk.length;i++) {
		for(int j=0;j<gameDesk.length;j++) {
			System.out.print(gameDesk[i][j]+" ");
		}
		System.out.println();
	}
}
public static void userFill(char[][] gameDesk,char[] arr) {
	System.out.println("Enter Position");
	int pos=Utility.inputNumber();
	if(arr[pos]!='f') {
		placeSymbol(gameDesk,pos,'u');
		printDesk(gameDesk);
		arr[pos]='f';
	}
	else {
		userFill(gameDesk, arr);
	}
}
public static void systemFill(char[][] gameDesk,char[] arr) {
	int pos=(int)(Math.random()*9);
	if(arr[pos]!='f') {
		placeSymbol(gameDesk,pos,'p');
		printDesk(gameDesk);
		arr[pos]='f';
	}
	else {
		systemFill(gameDesk, arr);
	}
}

public static void placeSymbol(char[][] gameDesk,int pos,char user) {
	char symbol =' ';
	if(user=='u') {
		symbol='X';
	}
	else if(user=='p'){
		symbol='O';
	}
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
		break;
	}

}
}
