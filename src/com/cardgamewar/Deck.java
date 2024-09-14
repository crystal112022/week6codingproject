package com.cardgamewar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<>();
	
	// Constructor
	public Deck() {
		// Populate the deck with 52 cards
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
                "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			for (int i = 0; i < names.length; i++) {
				int value = i + 2; // Cards 2-14 (2 to Ace)
				String name = names[i] + " of " + suit;
				cards.add(new Card(value, name));
			}
		}
	}
	
	//Shuffle the deck
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
	//Draw a card from the deck
	public Card draw() {
		if (!cards.isEmpty()) {
			return cards.remove(0); // Remove and return the top card
		} else {
			return null; // If the deck is empty
		}
	}

}
