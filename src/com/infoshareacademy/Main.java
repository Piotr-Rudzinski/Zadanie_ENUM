package com.infoshareacademy;

import java.util.Scanner;

public class Main {
    private final String ACE = "ace";
    private final String KING = "king";
    private final String QUEEN = "queen";
    private final String JACK = "jack";
    private final String EXIT = "exit";
    private final String CLUBS = "clubs";
    private final String DIAMONDS = "diamonds";
    private final String HEARTS = "hearts";
    private final String SPADES = "spades";
    private String rankCard;
    private String suitCard;

    public static void main(String[] args) {
        Main main = new Main();
        main.startCreatingCards();
    }

    public void startCreatingCards() {
        boolean repeat = true;

        while (repeat) {

            rankCard = getTextRank();
            if (rankCard.equals(EXIT)) {
                repeat = false;
            } else {
                suitCard = getTextSuit();
                Card card = new Card (selectSuit(suitCard), selectRank(rankCard));
                card.printDesc();
            }
            System.out.println();
        }
        System.out.print("Koniec programu.");
    }

    private String getTextRank () {
        String text = "";

        while (!(isRankValid(text))) {
            System.out.print("Podaj figurę karty: ace, king, queen, jack lub wpisz exit aby zakończyć program: ");
            Scanner scanner = new Scanner(System.in);
            text = scanner.nextLine();
        }
        return text;
    }

    private boolean isRankValid (String text) {
        return text.equals(ACE) || text.equals(KING) || text.equals(QUEEN) || text.equals(JACK) || text.equals(EXIT);
    }

    private Rank selectRank (String rankCard) {
        switch (rankCard) {
            case"ace":
                return Rank.ACE;
            case "king":
                return Rank.KING;
            case"queen":
                return Rank.QUEEN;
            case "jack":
                return Rank.JACK;
            default:
                return null;
        }
    }

    private String getTextSuit () {
        String text = "";

        while (!(isSuitValid(text))) {
            System.out.print("Podaj kolor karty: clubs, diamonds, hearts, spades: ");
            Scanner scanner = new Scanner(System.in);
            text = scanner.nextLine();
        }
        return text;
    }

    private boolean isSuitValid (String text) {
        return text.equals(CLUBS) || text.equals(DIAMONDS) || text.equals(HEARTS) || text.equals(SPADES);
    }

    private Suit selectSuit (String suitCard) {
        switch (suitCard) {
            case"clubs":
                return Suit.CLUBS;
            case "diamonds":
                return Suit.DIAMONDS;
            case"hearts":
                return Suit.HEARTS;
            case "spades":
                return Suit.SPADES;
            default:
                return null;
        }
    }
}
