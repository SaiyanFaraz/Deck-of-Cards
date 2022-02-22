package com.deckOfCards;


import java.util.Random;

public class DeckOfCards {
	private Card deck[]; // array of card object
	private int currentCard; // index of next card to be delt
	private final int NUMBER_OF_CARDS = 52; // Constant number of cards 
	private Random randomNumbers;
	
	// constructor fills the dec of cards
	public DeckOfCards(){
		String faces[] = {"ACE","2", "3", "4", "5", "6", "7", 
				"8", "9", "10", "JACK", "QUEEN", "KING"};
		String suit[] = {"HEARTS","DIAMONDS","CLUBS","SPADES"};
		
		deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects 
		currentCard = 0; // set the current card so first card dealt is deck[0]
		randomNumbers = new Random(); // Create random number generator
		
//		Populate deck with card objects 
		for(int count = 0; count < deck.length; count++){
			deck[count]= new Card(faces[count % 13], suit[count/13]);
		}
	} //end deck of cards constructor 
	
//	Shuffle deck of cards with one pass algorithm
	public void shuffle() {
//		after shuffling,deal sould start at deck[0] again
		currentCard = 0; //Reinitializing currentCard
		//for each card pick anther random card and swap them
		for(int first = 0; first <deck.length; first++) {
			//Select a random number between 0 and 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS); 
			
			//swap current card with randomly selected card
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}//end for
	}//end shuffle
	
	public Card dealCard(){
//		Determine if the cards are still needed to be delt
		if(currentCard < deck.length)
			return deck[currentCard++];// return current card in deck
		else 
			return null;// return nul indicates that all the cards were delt
	}//end Deal card
}//end deck of cards
