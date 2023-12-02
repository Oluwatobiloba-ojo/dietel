package chapter_seven.card.black_jack;

import chapter_seven.card.Card;
import chapter_seven.card.DeckOfCard;

import java.util.Arrays;
import java.util.Scanner;

public class BlackJack {
   static DeckOfCard deck = new DeckOfCard();
   static Scanner scanner = new Scanner(System.in);

    public static Card[] dealCard(Card[] card, int[] removeIndex) {
        if(!deck.hasFourOfAKind(card)){
            for (int i = 0; i < removeIndex.length ; i++) {
                card[removeIndex[i] - 1] = deck.dealCard();
            }
            if (deck.hasFourOfAKind(card)){
                return card;
            }else {
                System.out.println("Busted");
                return card;
            }
        }else {
            return card;
        }
    }

    public static void populateCard(Card[] cards) {
        deck.shuffle();
        for (int i = 0; i < cards.length; i++) {
            cards[i] = deck.dealCard();
        }
    }

    public static void dealerHand(Card[] cards) {
        System.out.println("Enter the amount of card you want to deal");
        int number = scanner.nextInt();
        int[] nums = new int[number];
        for (int count = 0; count < number; count++){
            nums[count] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(dealCard(cards, nums)));
    }
}
