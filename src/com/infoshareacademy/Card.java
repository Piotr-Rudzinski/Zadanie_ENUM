package com.infoshareacademy;

public class Card {
    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public void printDesc() {
        System.out.println("Opis karty: " + rank.getName() + " " + suit.getName());
    }
}
