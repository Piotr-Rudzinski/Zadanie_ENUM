package com.infoshareacademy;

public enum Rank {
    ACE("ACE"),
    KING("KING"),
    QUEEN("QUEEN"),
    JACK("JACK");

    private String name;

    Rank (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }
}
