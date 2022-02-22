package com.deckOfCards;
//card class represents a plying card in the deck
public class Card {
	private String face;//face of our card
	private String suit;//Suit of our card
	
//	two argument constructor initializes cards face and suit
	public Card(String cardFace,String cardSuit) {
		face = cardFace; //initialize face of the card
		suit = cardSuit; //initialize suit of the card
	}// end constructor 
//	return string representation of card

	@Override
	public String toString() {
		return face + " of " + suit;
	}// end method toString
	
}//end class card
