package chapter_seven.card;

import chapter_seven.card.cardShuffling.CardShufflingAndDealing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardShufflingAndDealingTest {

    @Test
    public void testThatCardHasHigherWinnerInTwoFivePokerHand(){
        Card[] card = new Card[5];
        card[0] = new Card("King", "spade");
        card[1] = new Card("King", "Heart");
        card[2] = new Card("Jack", "Club");
        card[3] = new Card("King","spade");
        card[4] = new Card("King", "spade");
        Card[] card2 = new Card[5];
        card2[0] = new Card("King", "spade");
        card2[1] = new Card("Heart", "Heart");
        card2[2] = new Card("Jack", "Club");
        card2[3] = new Card("King","spade");
        card2[4] = new Card("King", "spade");
        assertEquals("Hand one won", CardShufflingAndDealing.dealTwoFivePokerHand(card, card2));
    }

    @Test
    public void testForThatACardWhichHasSameTypeWillTurnOutToBeATie(){
        Card[] card = new Card[5];
        card[0] = new Card("King", "spade");
        card[1] = new Card("King", "Heart");
        card[2] = new Card("Jack", "Club");
        card[3] = new Card("King","spade");
        card[4] = new Card("King", "spade");
        assertEquals("It is a tie", CardShufflingAndDealing.dealTwoFivePokerHand(card, card));
    }

    @Test
    public void testForThatACardWhichHasHighestCardWinnerInTheCardDealing(){
        Card[] card = new Card[5];
        card[0] = new Card("King", "spade");
        card[1] = new Card("King", "Heart");
        card[2] = new Card("Jack", "Club");
        card[3] = new Card("Jack","spade");
        card[4] = new Card("Ten", "spade");
        Card[] card2 = new Card[5];
        card2[0] = new Card("King", "spade");
        card2[1] = new Card("Ace", "Heart");
        card2[2] = new Card("Jack", "Club");
        card2[3] = new Card("King","spade");
        card2[4] = new Card("Ten", "spade");
        assertEquals("Hand one won", CardShufflingAndDealing.dealTwoFivePokerHand(card, card2));
    }

}