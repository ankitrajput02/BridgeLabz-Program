package com.bridgelabz.objectorientedprograms;

import com.bridgelabz.utility.QueueLinkedListUtility;
import com.bridgelabz.utility.Utility;

/**
 * Title:Program to create a Player Object having Deck of Cards, and having
 * ability to Sort by Rank and maintain the cards in a Queue implemented using
 * Linked List.
 * 
 *
 */
public class DeckOfCardsSort {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		String ranks[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String suits[] = { "♣ ", "♦ ", "♥ ", "♠ " };
		// String[] cardDeck = new String[52];
		String deck[] = new String[ranks.length * suits.length];
		QueueLinkedListUtility queue1 = new QueueLinkedListUtility();
		QueueLinkedListUtility queue2 = new QueueLinkedListUtility();
		QueueLinkedListUtility queue3 = new QueueLinkedListUtility();
		QueueLinkedListUtility queue4 = new QueueLinkedListUtility();
		// Store All cards in the Deck
		int k = 0;
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deck[k] = ranks[j] + suits[i];
				k++;
			}
		}
		System.out.println("Total Cards " + k);
		// Print Deck
		System.out.println("Deck...");
		for (int i = 0; i < deck.length; i++) {
			if (i % 13 == 0) {
				System.out.println();
			}
			System.out.print(deck[i] + "\t");
		}
		System.out.println();
		// Shuffle the Deck
		Utility.shuffle(deck);
		// Print Deck
		System.out.println("Shuffle Deck...");
		for (int i = 0; i < deck.length; i++) {
			if (i % 13 == 0) {
				System.out.println();
			}
			System.out.print(deck[i] + "\t");
		}
		// Distribution of Cards
		System.out.println();
		System.out.println("Distribution of 9 Cards to every Player (Total 4 Player)...");
		String[] user1 = new String[9];
		String[] user2 = new String[9];
		String[] user3 = new String[9];
		String[] user4 = new String[9];

		int count = 0, i;
		for (i = 0; i < 9; i++) { // 9 Cards
			if (count < 9) {
				user1[i] = deck[count];
				// System.out.print(user1[i]+" ");
				count++;
			}
		}

		for (i = 0; i < 9; i++) { // 9 Cards
			if (count >= 9 && count < 18) {
				user2[i] = deck[count];
				// System.out.print(user2[i]+" ");
				count++;
			}
		}
		for (i = 0; i < 9; i++) {
			if (count >= 18 && count < 27) {
				user3[i] = deck[count];
				// System.out.print(user3[i]+" ");
				count++;
			}
		}
		for (i = 0; i < 9; i++) {
			if (count >= 27 && count < 36) {
				user4[i] = deck[count];
				// System.out.print(user3[i]+" ");
				count++;
			}
		}
		System.out.println();
		// After Distribution To Player 1
		System.out.print("Player 1");
		System.out.print("Queue1 ");
		for (i = 1; i < 9; i++) {
			int j;
			String temp;
			for (j = 0; j < 9 - i; j++)
				if (user1[j].compareTo(user1[j + 1]) > 0) {
					temp = user1[j];
					user1[j] = user1[j + 1];
					user1[j + 1] = temp;
				}

		}
		for (i = 0; i < 9; i++) {
			queue1.enqueue(user1[i]);

		}
		// print Queue
		queue1.printQueue();
		System.out.println();
		// After Distribution To Player 2
		System.out.print("Player 2");
		System.out.print("Queue2 ");
		for (i = 1; i < 9; i++) {
			int j;
			String temp;
			for (j = 0; j < 9 - i; j++)
				if (user2[j].compareTo(user2[j + 1]) > 0) {
					temp = user2[j];
					user2[j] = user2[j + 1];
					user2[j + 1] = temp;
				}

		}
		for (i = 0; i < 9; i++) {
			queue2.enqueue(user2[i]);

		}
		queue2.printQueue();
		System.out.println();

		// After Distribution To Player 3
		System.out.print("Player 3");
		System.out.print("Queue3 ");
		for (i = 1; i < 9; i++) {
			int j;
			String temp;
			for (j = 0; j < 9 - i; j++)
				if (user3[j].compareTo(user3[j + 1]) > 0) {
					temp = user3[j];
					user3[j] = user3[j + 1];
					user3[j + 1] = temp;
				}

		}
		for (i = 0; i < 9; i++) {
			queue3.enqueue(user3[i]);

		}
		queue3.printQueue();

		// After Distribution To Player 4
		System.out.println();
		System.out.print("Player 4");
		System.out.print("Queue4 ");
		for (i = 1; i < 9; i++) {
			int j;
			String temp;
			for (j = 0; j < 9 - i; j++)
				if (user4[j].compareTo(user4[j + 1]) > 0) {
					temp = user4[j];
					user4[j] = user4[j + 1];
					user4[j + 1] = temp;
				}

		}
		for (i = 0; i < 9; i++) {
			queue4.enqueue(user4[i]);

		}
		queue4.printQueue();
	}
}
