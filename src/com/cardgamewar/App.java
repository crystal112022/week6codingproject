package com.cardgamewar;

public class App {

	public static void main(String[] args) {
		// Instantiate a Deck and two Players
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		// Shuffle the deck
		deck.shuffle();
		
		//Deal 52 cards to both players (26 each)
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		// Each player flips a card and compare values
		for (int i =0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			if (card1 != null && card2 != null) {
				System.out.println("Round " + (i +1) + ": ");
				card1.describe();
				card2.describe();
			
			
				if (card1.getValue() > card2.getValue()) {
					player1.incrementScore();
					System.out.println("Player 1 wins the round!");
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 wins the round!");
			} else {
				System.out.println("It's a tie!");
				
			}
			
		}

	}
		// Print final scores and determing the winner
		System.out.println("\nFinal Scores:");
        System.out.println("Player 1: " + player1.getScore());
        System.out.println("Player 2: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins the game!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("It's a draw!");
        }
     
	}  	

}
