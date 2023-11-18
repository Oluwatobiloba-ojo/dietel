package chapter_seven.card;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class DeckOfCardTest {

    @Test
    public void testThatACardHasAFaceAndASuitInIt(){
        Card card = new Card("Six", "Spades");
        assertEquals(card.getFace(), "Six");
        assertEquals(card.getSuit(), "Spades");
    }

    @Test
    public void testThatWhenWePopulateTheDeckOfCardItsNotEmpty(){
        DeckOfCard deckOfCard = new DeckOfCard();
        assertTrue(deckOfCard.isNotEmpty());
    }

    @Test
    public void testThatWeWillFindOutAPairWithinAFivePokerHandCard(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("Jack", "spade");
        card[1] = new Card("Ace", "Heart");
        card[2] = new Card("Jack", "Club");
        card[3] = new Card("Eight","spade");
        card[4] = new Card("King", "spade");
        assertTrue(deck.isPair(card));
    }

    @Test
    public void testForWhenAFivePokerCardIsCheckedThereIsNoPair(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("Jack", "spade");
        card[1] = new Card("Ace", "Heart");
        card[2] = new Card("Nine", "Club");
        card[3] = new Card("Eight","spade");
        card[4] = new Card("King", "spade");
        assertFalse(deck.isPair(card));
    }

    @Test
    public void testForThatInAFiveCardThereIsTwoPairs(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("Jack", "spade");
        card[1] = new Card("King", "Heart");
        card[2] = new Card("Jack", "Club");
        card[3] = new Card("Eight","spade");
        card[4] = new Card("King", "spade");
        assertTrue(deck.isTwoPair(card));
    }

    @Test
    public void testForThatInAFiveCardThereIsNoTwoPair(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("Jack", "spade");
        card[1] = new Card("King", "Heart");
        card[2] = new Card("Nine", "Club");
        card[3] = new Card("Eight","spade");
        card[4] = new Card("King", "spade");
        assertFalse(deck.isTwoPair(card));
    }

    @Test
    public void testForThatInAFiveCardThatThereIsAThreeOfKindInIt(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("Jack", "spade");
        card[1] = new Card("King", "Heart");
        card[2] = new Card("Nine", "Club");
        card[3] = new Card("King","spade");
        card[4] = new Card("King", "spade");
        assertTrue(deck.hasThreeOfAKind(card));
    }

    @Test
    public void testForThatACardIfItIsFourKindOf(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("King", "spade");
        card[1] = new Card("King", "Heart");
        card[2] = new Card("Jack", "Club");
        card[3] = new Card("King","spade");
        card[4] = new Card("King", "spade");
        assertTrue(deck.hasFourOfAKind(card));
    }

    @Test
    public void testForThatACardIfIsNotFourKindOf(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("King", "spade");
        card[1] = new Card("Heart", "Heart");
        card[2] = new Card("Jack", "Club");
        card[3] = new Card("King","spade");
        card[4] = new Card("King", "spade");
        assertFalse(deck.hasFourOfAKind(card));
    }

    @Test
    public void testThatAFiveCardPokerHaveFiveSameSuits(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("King", "spade");
        card[1] = new Card("Heart", "spade");
        card[2] = new Card("Jack", "spade");
        card[3] = new Card("King","spade");
        card[4] = new Card("King", "spade");
        assertTrue(deck.isAFlushCard(card));
    }

    @Test
    public void testThatAFiveCardPokerNotHaveFiveSameSuits(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("King", "spade");
        card[1] = new Card("Heart", "spade");
        card[2] = new Card("Jack", "Clubs");
        card[3] = new Card("King","spade");
        card[4] = new Card("King", "spade");
        assertFalse(deck.isAFlushCard(card));
    }

    @Test
    public void testThatAFiveCardPokerIsArrangeInAFaceValueConsecutively(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("Ten", "spade");
        card[1] = new Card("Nine", "spade");
        card[2] = new Card("Eight", "Clubs");
        card[3] = new Card("Seven","spade");
        card[4] = new Card("Six", "spade");
        assertTrue(deck.isStraightCard(card));
    }

    @Test
    public void testForThatACardIsStraightWhenFaceValueIsConsecutively(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("Ace", "spade");
        card[1] = new Card("Deuce", "spade");
        card[2] = new Card("Three", "Clubs");
        card[3] = new Card("Four","spade");
        card[4] = new Card("Five", "spade");
        assertTrue(deck.isStraightCard(card));
    }

    @Test
    public void testForThatACardIsNotStraightCauseFaceValueIsNotConsecutively(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("Ace", "spade");
        card[1] = new Card("Deuce", "spade");
        card[2] = new Card("Three", "Clubs");
        card[3] = new Card("Jack","spade");
        card[4] = new Card("Four", "spade");
        assertFalse(deck.isStraightCard(card));
    }

    @Test
    public void testThatACardIsAFullHouseCard(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card("Ace", "spade");
        card[1] = new Card("Jack", "spade");
        card[2] = new Card("Ten", "Clubs");
        card[3] = new Card("Jack","spade");
        card[4] = new Card("Jack", "spade");
        assertFalse(deck.isFullHouse(card));
    }
}
