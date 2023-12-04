package chapter_seven.card;

import chapter_seven.card.cardShuffling.CardShufflingAndDealing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardShufflingAndDealingTest {

    @Test
    public void testThatCardHasHigherWinnerInTwoFivePokerHand(){
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.KING, CardSuites.CLUBS);
        card[1] = new Card(CardFaces.KING, CardSuites.HEART);
        card[2] = new Card(CardFaces.JACK, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.JACK, CardSuites.SPADES);
        card[4] = new Card(CardFaces.KING, CardSuites.SPADES);
        Card[] card2 = new Card[5];
        card2[0] = new Card(CardFaces.KING, CardSuites.SPADES);
        card2[1] = new Card(CardFaces.FOUR, CardSuites.HEART);
        card2[2] = new Card(CardFaces.JACK, CardSuites.CLUBS);
        card2[3] = new Card(CardFaces.KING,CardSuites.SPADES);
        card2[4] = new Card(CardFaces.KING, CardSuites.SPADES);
        assertEquals("Hand One Won", CardShufflingAndDealing.dealTwoFivePokerHand(card, card2));
    }

    @Test
    public void testForThatACardWhichHasSameTypeWillTurnOutToBeATie(){
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.KING, CardSuites.SPADES);
        card[1] = new Card(CardFaces.KING, CardSuites.HEART);
        card[2] = new Card(CardFaces.JACK, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.KING, CardSuites.SPADES);
        card[4] = new Card(CardFaces.KING, CardSuites.SPADES);
        assertEquals("It is a tie", CardShufflingAndDealing.dealTwoFivePokerHand(card, card));
    }

    @Test
    public void testForThatACardWhichHasHighestCardWinnerInTheCardDealing(){
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.KING, CardSuites.SPADES);
        card[1] = new Card(CardFaces.KING, CardSuites.HEART);
        card[2] = new Card(CardFaces.JACK, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.JACK,CardSuites.SPADES);
        card[4] = new Card(CardFaces.TEN, CardSuites.SPADES);
        Card[] card2 = new Card[5];
        card2[0] = new Card(CardFaces.KING, CardSuites.SPADES);
        card2[1] = new Card(CardFaces.ACE, CardSuites.HEART);
        card2[2] = new Card(CardFaces.JACK, CardSuites.CLUBS);
        card2[3] = new Card(CardFaces.KING,CardSuites.SPADES);
        card2[4] = new Card(CardFaces.TEN, CardSuites.SPADES);
        assertEquals("Hand one won", CardShufflingAndDealing.dealTwoFivePokerHand(card, card2));
    }

}