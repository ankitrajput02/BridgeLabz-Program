package com.bridgelabz.objectorientedprograms;
import com.bridgelabz.utility.Utility;
public class DeckOfCards {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ranks[] = {"2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K","A"};
		String suits[] = {"♣ ", "♦ ", "♥ ", "♠ "};
		String deck[]=new String[ranks.length*suits.length];
		//Store All cards in the Deck
		int k=0;
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deck[k]=suits[i]+ranks[j];
				k++;
			}
		}
		System.out.println("Total Cards "+k);
		//Print Deck 
		System.out.println("Deck...");
		for(int i=0;i<deck.length;i++) {
			if(i%13==0) {
				System.out.println();
			}
			System.out.print(deck[i]+"\t");
		}
		System.out.println();
		//Shuffle
		Utility.shuffle(deck);
		//Print Deck 
		System.out.println("Shuffle Deck...");
		for(int i=0;i<deck.length;i++) 
		{	
			if(i%13==0) {
				System.out.println();
			}
			System.out.print(deck[i]+"\t");
		}
		//Distribution of Cards
		System.out.println();
		System.out.println("Distribution of 9 Cards to every Player (Total 4 Player)...");
		String[][] distribute = new String[9][4];
		int count=0;
		for (int i = 0; i < 9; i++) {		//9 Cards
			for (int j = 0; j < 4; j++) {	//4 Players
				distribute[i][j]=deck[count];
				count++;
			}
		}
		//After Distribution
		System.out.println(" Player 1\t||Player 2\t||Player 3\t||Player 4");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(distribute[i][j]+"\t\t||");
			}
			System.out.println();
		}
	}
}