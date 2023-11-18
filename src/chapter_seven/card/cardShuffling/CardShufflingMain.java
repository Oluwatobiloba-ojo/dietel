package chapter_seven.card.cardShuffling;

import chapter_seven.card.Card;

import static chapter_seven.card.cardShuffling.CardShufflingAndDealing.displayCard;
import static chapter_seven.card.cardShuffling.CardShufflingAndDealing.populateFiveCard;

public class CardShufflingMain {
    public static void main(String[] args) {
        Card [] card1 = new Card[5];
        Card[] card2 = new Card[5];
        populateFiveCard(card1, card2);
        System.out.println("Hand One :" + displayCard(card1));
        System.out.println("Hand two :" + displayCard(card2));
        System.out.println(CardShufflingAndDealing.dealTwoFivePokerHand(card1, card2));
    }
}
