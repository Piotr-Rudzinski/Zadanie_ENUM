package com.infoshareacademy;

public enum Suit {
    CLUBS ("Clubs"),
    DIAMONDS ("Diamonds"),
    HEARTS ("Hearts"),
    SPADES ("Spades");

    private String name;

    Suit (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }
}
