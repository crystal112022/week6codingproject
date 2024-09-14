package com.cardgamewar;

public class Card {
    private int value; // 2-14 representing cards 2 to Ace
    private String name; // e.g., "Ace of Diamonds", "Two of Hearts"

    // Constructor
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getters
    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Describe method to print card information
    public void describe() {
        System.out.println(name + " (" + value + ")");
    }
}
