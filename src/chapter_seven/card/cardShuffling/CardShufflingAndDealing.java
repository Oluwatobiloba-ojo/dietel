package chapter_seven.card.cardShuffling;

import chapter_seven.card.Card;
import chapter_seven.card.DeckOfCard;

import java.security.SecureRandom;

public class CardShufflingAndDealing {
   static DeckOfCard deck = new DeckOfCard();

    public static String dealTwoFivePokerHand(Card[] card, Card[] card2) {
        if (deck.hasFourOfAKind(card) || deck.hasFourOfAKind(card2)){return cardIsFourOfKind(card, card2);}
        else if (deck.isFullHouse(card) || deck.isFullHouse(card2)) {return cardIsAFullHouse(card, card2);}
        else if (deck.isAFlushCard(card) || deck.isAFlushCard(card2)) {return cardIsFlush(card, card2);}
        else if (deck.isStraightCard(card) || deck.isStraightCard(card2)) {return cardIsStraightCards(card, card2);}
        else if (deck.hasThreeOfAKind(card) || deck.hasThreeOfAKind(card2)) {return cardIsThreeOfKindCards(card, card2);}
        else if (deck.isTwoPair(card) || deck.isTwoPair(card2)) {return cardIsATwoPairCards(card, card2);}
        else if (deck.isPair(card) || deck.isPair(card2) ) {return cardIsAPairCards(card, card2);}
        return null;
    }


    private static String cardIsAPairCards(Card[] card, Card[] card2) {
        if (!deck.isPair(card) && deck.isPair(card2)){
            return "Hand two won";
        }else if (deck.isPair(card) && deck.isPair(card2)) {
            return "It is a tie";
        } else{
            return "Hand one won";
        }
    }

    private static String cardIsATwoPairCards(Card[] card, Card[] card2) {
        if (!deck.isTwoPair(card) && deck.isTwoPair(card2)){
            return "Hand two won";
        }else if (deck.hasFourOfAKind(card) && deck.hasFourOfAKind(card2)) {
            return "It is a tie";
        } else {
            return "Hand one won";
        }
    }

    private static String cardIsThreeOfKindCards(Card[] card, Card[] card2) {
        if (!deck.hasThreeOfAKind(card) && deck.hasThreeOfAKind(card2)){
            return "Hand two won";
        }else if (deck.hasThreeOfAKind(card) && deck.hasThreeOfAKind(card2)) {
            return "It is a tie";
        }
        else {
            return "Hand one won";
        }
    }

    private static String cardIsStraightCards(Card[] card, Card[] card2) {
        if (!deck.isStraightCard(card) && deck.isStraightCard(card2)){
            return "Hand two Won";
        }else if (deck.isStraightCard(card) && deck.isStraightCard(card2)) {
            return "It is a tie";
        } else {
            return "Hand One won";
        }
    }

    private static String cardIsFlush(Card[] card, Card[] card2) {
        if (deck.isAFlushCard(card) && !deck.isAFlushCard(card2)){
            return "Hand One Won";
        }else if (deck.isAFlushCard(card) && deck.isAFlushCard(card2)) {
            return "It is a tie";
        } else {
            return "Hand Two won";
        }
    }

    private static String cardIsAFullHouse(Card[] card, Card[] card2) {
        if (!deck.isFullHouse(card) && deck.isFullHouse(card2)){
            return "Hand two won";
        }else if (deck.isFullHouse(card) && deck.isFullHouse(card2)) {
            return "It is a tie";
        } else {
            return "Hand One Won";
        }
    }

    private static String cardIsFourOfKind(Card[] card, Card[] card2) {
        if (deck.hasFourOfAKind(card) && !deck.hasFourOfAKind(card2)){
            return "Hand one won";
        } else if (deck.hasFourOfAKind(card) && deck.hasFourOfAKind(card2)) {
            return "It is a tie";
        } else{
            return "Hand Two won";
        }
    }
    static String displayCard(Card[] card1) {
        String result = "";
        for (Card card: card1) {
            result += card.toString();
        }
        return String.format("[" + result + "]");
    }

    static void populateFiveCard(Card[] card1, Card[] card2) {
        SecureRandom random = new SecureRandom();
        for (int count = 0; count < 5; count++){
            card1[count] = deck.getDeckOfCard()[random.nextInt(52)];
            card2[count] = deck.getDeckOfCard()[random.nextInt(52)];
        }
    }
}
