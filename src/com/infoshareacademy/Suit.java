package com.infoshareacademy;

public enum Suit {
    CLUBS("CLUBS"),
    DIAMONDS("DIAMONDS"),
    HEARTS("HEARTS"),
    SPADES("SPADES");

    private String name;

    Suit (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }
}
