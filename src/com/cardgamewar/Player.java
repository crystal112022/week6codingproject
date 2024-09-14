package com.cardgamewar;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<>();
	private int score = 0;
	private String name;
	
	// Constructor
	public Player(String name) {
		this.name = name;
	}
	
	// Describe method to print player information and cards in hand
	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Score: " + score);
		System.out.println("Cards in hand:");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	//Flip method to play the top card
	public Card flip() {
		if (!hand.isEmpty()) {
			return hand.remove(0); // Remove and return the top card
		} else {
			return null; // If no cards are left
		}
	}
	
	// Draw method to take a card from the deck
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		if (drawnCard != null) {
			hand.add(drawnCard);
		}
	}
	
	// Increment the score
	public void incrementScore() {
		score++;
	}
	
	// Getter for the score
	public int getScore() {
		return score;
	}
}
