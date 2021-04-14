package com.infoshareacademy;

import java.util.Scanner;

public class Card {
    Suit[] suit = Suit.values();
    Rank[] rank = Rank.values();

    public static void main(String[] args) {
        String rankCard;
        String suitCard;

        Boolean repeat = true;

        while (repeat) {

            rankCard = getTextRank();
            if (!rankCard.equals("e")) {
                suitCard = getTextSuit();

                System.out.println();
                printDesc(rankCard, suitCard);
            } else {
                repeat = false;
            }
            System.out.println();
            System.out.println();
        }
        System.out.print("Koniec programu.");
    }

    private static void printDesc (String rankCard, String suitCard) {
       switch (rankCard) {
           case "a":
               System.out.println(Rank.ACE.getName().toUpperCase() + " - " + getSuitString(suitCard));
               getSuitString(suitCard);
               break;
           case "k":
               System.out.println(Rank.KING.getName().toUpperCase() + " - " + getSuitString(suitCard));
               getSuitString(suitCard);
               break;
           case "q":
               System.out.println(Rank.QUEEN.getName().toUpperCase() + " - " + getSuitString(suitCard));
               getSuitString(suitCard);
               break;
           case "j":
               System.out.println(Rank.JACK.getName().toUpperCase() + " - " + getSuitString(suitCard));
               getSuitString(suitCard);
               break;
           default:
               break;
       }
    }

    private static String getSuitString (String suitCard) {
        switch (suitCard) {
            case "c":
                return Suit.CLUBS.getName().toUpperCase();
            case "d":
                return Suit.DIAMONDS.getName().toUpperCase();
            case "h":
                return Suit.HEARTS.getName().toUpperCase();
            case "s":
                return Suit.SPADES.getName().toUpperCase();
            default:
                break;
        }
        return "";
    }

    private static String getTextRank () {
        String text = "";

        while (!((text.equals("a") || text.equals("k") || text.equals("q") || text.equals("j") || text.equals("e")))) {
            System.out.print("Podaj figurę karty (a - ACE, k - KING, q - QUEEN, j - JACK, |e - wyjście|): ");
            Scanner scanner = new Scanner(System.in);
            text = scanner.nextLine();
        }
        return text;
    }

    private static String getTextSuit () {
        String text = "";

        while (!((text.equals("c") || text.equals("d") || text.equals("h") || text.equals("s")))) {
            System.out.print("Podaj kolor karty (c - CLUBS, d - DIAMONDS, h - HEARTS, s - SPADES): ");
            Scanner scanner = new Scanner(System.in);
            text = scanner.nextLine();
        }
        return text;
    }
}
