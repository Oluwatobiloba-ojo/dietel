package chapter_seven.card;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DeckOfCard {
    private static final SecureRandom random = new SecureRandom();
    private int pair_of_card = 0;
    private int two_pair_of_card = 0;
    private int three_kind_of_card = 0;
    private int four_kind_of_card = 0;
    private int flush_of_card = 0;
    private int straight_of_card = 0;
    private int full_house = 0;
    private final int NUMBER_OF_CARD = 52;
    private final Card[] deck = new Card[NUMBER_OF_CARD];
    private int currentCard = 0;
    private boolean isEmpty;

    private final HashMap<CardFaces, Integer> value_of_face = new HashMap<>();

    public boolean isNotEmpty() {
        if (deck[deck.length - 1] != null) {
            isEmpty = true;
        }
        return isEmpty;
    }

    public DeckOfCard() {
        CardFaces[] faces = {CardFaces.ACE, CardFaces.DEUCE, CardFaces.THREE, CardFaces.FOUR, CardFaces.FIVE,
                            CardFaces.SIX, CardFaces.SEVEN, CardFaces.EIGHT,  CardFaces.NINE, CardFaces.TEN,
                            CardFaces.JACK, CardFaces.QUEEN, CardFaces.KING};
        CardSuites[] suits = {CardSuites.HEART, CardSuites.DIAMOND, CardSuites.CLUBS, CardSuites.SPADES};

        for (int count = 0; count < NUMBER_OF_CARD; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
        valueOfFace(faces);
    }

    private void valueOfFace(CardFaces[] faces) {
        for (int count = 0; count < faces.length; count++){
            if (count <= 9){
                value_of_face.put(faces[count], count + 1);
            }else {
                value_of_face.put(faces[count], 10);
            }
        }
    }
    public Card[] getDeckOfCard(){
        return deck;
    }
    public void shuffle() {
        currentCard = 0;
        for (int count = 0; count < NUMBER_OF_CARD; count++) {
            int second_card = random.nextInt(NUMBER_OF_CARD);
            Card temp = deck[count];
            deck[count] = deck[second_card];
            deck[second_card] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }

    public boolean isPair(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            CardFaces face = cards[i].getFace();
            for (int j = i + 1; j < cards.length; j++) {
                if (face.equals(cards[j].getFace())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isTwoPair(Card[] cards) {
        int twoPair = 0;
        for (int i = 0; i < cards.length; i++) {
            CardFaces face = cards[i].getFace();
            for (int j = i + 1; j < cards.length; j++) {
                if (face.equals(cards[j].getFace())) {
                    twoPair++;
                    if (twoPair == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean hasThreeOfAKind(Card[] card) {
        for (int i = 0; i < card.length; i++) {
            int count = 0;
            ArrayList<Integer> nums = new ArrayList<>();
            CardFaces kindOfCard = card[i].getFace();
            for (int j = 0; j < card.length; j++) {
                if (kindOfCard.equals(card[j].getFace())) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFourOfAKind(Card[] card) {
        for (int i = 0; i < card.length ; i++) {
            int count = 1;
            CardFaces face = card[i].getFace();
            for (int j = i+1; j < card.length ; j++) {
                if (face.equals(card[j].getFace())) count++;
            }
            if (count == 4) return true;
        }
        return false;
    }

    public boolean isAFlushCard(Card[] card) {
        CardSuites suit = card[0].getSuit();
        for (int i = 1; i < card.length; i++) {
            if (!suit.equals(card[i].getSuit()))return false;
            if (i == card.length - 1)return true;
        }
        return false;
    }

    public boolean isStraightCard(Card[] card) {
        int[] numbers = new int[5];
        for (int i = 0; i < card.length; i++) {numbers[i] = value_of_face.get(card[i].getFace());}
         int number = getLargest(numbers);
        if (checkOutRangeBetweenFaces(numbers)) {
            return number == numbers[0] || number == numbers[numbers.length - 1];
        }
        return false;
    }

    private boolean checkOutRangeBetweenFaces(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] - numbers[i+1] == 1 || numbers[i] - numbers[i+1] == -1) count++;
        }
        return count == 4;
    }

    private int getLargest(int[] numbers) {
        int maximum = numbers[0];
        for (int count = 0; count < numbers.length; count++){
            if (numbers[count] > maximum) maximum = numbers[count];
        }
        return maximum;
    }

    public boolean isFullHouse(Card[] card){
        HashSet<CardFaces> result = new HashSet<>();
        for (Card value : card) {
            result.add(value.getFace());
        }
        return result.size() == 2;
    }

    public void display(){
        shuffle();
        Card[] card = new Card[5];
        int counter = 0;
        for (int count = 1; count <= deck.length; count++){
            System.out.printf("%-19s",dealCard());
            card[counter++] = deck[count-1];
            if (count % 5 == 0){
                fiveCardPoker(card);
                card = new Card[5];
                counter = 0;
                System.out.println();
            }
        }
        displayResultOfFivePoker();
    }

    private void displayResultOfFivePoker() {
        System.out.printf("""
                \nNumber of pair cards are: %s
                Number of two pair card are: %s
                Number of three of kind are: %s
                Number of four of kind are: %s
                Number of flush is : %s
                Number of Straight card is: %s
                Number of full house card is: %s
                """, pair_of_card, two_pair_of_card, three_kind_of_card, four_kind_of_card, flush_of_card
                ,straight_of_card, full_house);
    }

    public void fiveCardPoker(Card[] card){
        if(isPair(card)) pair_of_card++;
        if(isTwoPair(card))two_pair_of_card++;
        if(hasThreeOfAKind(card)) three_kind_of_card++;
        if (hasFourOfAKind(card)) four_kind_of_card++;
        if(isAFlushCard(card)) flush_of_card++;
        if(isStraightCard(card)) straight_of_card++;
        if(isFullHouse(card)) full_house++;
    }

}
