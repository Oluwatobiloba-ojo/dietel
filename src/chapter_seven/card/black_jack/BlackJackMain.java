package chapter_seven.card.black_jack;

import chapter_seven.card.Card;
import chapter_seven.card.DeckOfCard;

import java.util.Arrays;

public class BlackJackMain {

    public static void main(String[] args) {
        DeckOfCard deck = new DeckOfCard();
        Card[] cards = new Card[5];
        BlackJack.populateCard(cards);
        System.out.println(Arrays.toString(cards));
        if (deck.hasFourOfAKind(cards)){
            System.out.println("Card has high quantity no need for dealing");
        }else {
            BlackJack.dealerHand(cards);
        }
    }
}
