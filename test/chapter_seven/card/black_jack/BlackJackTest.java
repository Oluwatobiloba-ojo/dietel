package chapter_seven.card.black_jack;

import chapter_seven.card.Card;
import chapter_seven.card.CardFaces;
import chapter_seven.card.CardSuites;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static chapter_seven.card.black_jack.BlackJack.dealCard;

class BlackJackTest {

    @Test
    public void testForTheTheDealingOfACardWhichHasLowQuantityAndWillReturnBusted(){
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.FIVE, CardSuites.CLUBS);
        card[1] = new Card(CardFaces.JACK, CardSuites.DIAMOND);
        card[2] = new Card(CardFaces.KING, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.QUEEN, CardSuites.HEART);
        card[4] = new Card(CardFaces.FIVE, CardSuites.HEART);
        int[] removeIndex = {1, 5};
        System.out.println(Arrays.toString(dealCard(card, removeIndex)));
    }

    @Test
    public void testForTheDealingOfACardWhichHighQuantityAndWillReturnTheCard() {
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.FIVE, CardSuites.CLUBS);
        card[1] = new Card(CardFaces.FIVE, CardSuites.DIAMOND);
        card[2] = new Card(CardFaces.FIVE, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.FIVE, CardSuites.HEART);
        card[4] = new Card(CardFaces.FIVE, CardSuites.HEART);
        int[] removeIndex = {1, 5};
        System.out.println(Arrays.toString(dealCard(card, removeIndex)));
    }
}