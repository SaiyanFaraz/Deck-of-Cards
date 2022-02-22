package com.deckOfCards;

public class DeckOfCardsMain {

	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); //placing cards in random order
		
//		print 52 cards in order they are delt
		
		for(int i = 0; i < 9; i++) {
//			deal and print 4 cards
			System.out.printf("Player1: %-20s Player2: %-20s Player3: %-20s Player4: %-20s\n",
					myDeckOfCards.dealCard(),myDeckOfCards.dealCard(),
					myDeckOfCards.dealCard(),myDeckOfCards.dealCard());
		}//end for
	}//end main
}//end DeckCardsMain
