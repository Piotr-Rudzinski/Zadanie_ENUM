package com.infoshareacademy;

public enum Rank {
    ACE ("Ace"),
    KING ("King"),
    QUEEN ("Queen"),
    JACK ("Jack");

    private  String rank;

    Rank (String rank) {
        this.rank = rank;
    }

    public String getName () {
        return rank;
    }
}
