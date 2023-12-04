package chapter_seven.card;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class DeckOfCardTest {

    @Test
    public void testThatACardHasAFaceAndASuitInIt(){
        Card card = new Card(CardFaces.SIX, CardSuites.SPADES);
        assertSame(card.getFace(), CardFaces.SIX);
        assertSame(card.getSuit(), CardSuites.SPADES);
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
        card[0] = new Card(CardFaces.JACK, CardSuites.SPADES);
        card[1] = new Card(CardFaces.ACE, CardSuites.HEART);
        card[2] = new Card(CardFaces.JACK, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.EIGHT,CardSuites.SPADES);
        card[4] = new Card(CardFaces.KING, CardSuites.SPADES);
        assertTrue(deck.isPair(card));
    }

    @Test
    public void testForWhenAFivePokerCardIsCheckedThereIsNoPair(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.JACK, CardSuites.SPADES);
        card[1] = new Card(CardFaces.ACE, CardSuites.HEART);
        card[2] = new Card(CardFaces.NINE, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.EIGHT,CardSuites.SPADES);
        card[4] = new Card(CardFaces.KING, CardSuites.SPADES);
        assertFalse(deck.isPair(card));
    }

    @Test
    public void testForThatInAFiveCardThereIsTwoPairs(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.JACK, CardSuites.SPADES);
        card[1] = new Card(CardFaces.KING, CardSuites.HEART);
        card[2] = new Card(CardFaces.JACK, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.EIGHT,CardSuites.SPADES);
        card[4] = new Card(CardFaces.KING, CardSuites.SPADES);
        assertTrue(deck.isTwoPair(card));
    }

    @Test
    public void testForThatInAFiveCardThereIsNoTwoPair(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.JACK, CardSuites.SPADES);
        card[1] = new Card(CardFaces.KING, CardSuites.HEART);
        card[2] = new Card(CardFaces.NINE, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.EIGHT,CardSuites.SPADES);
        card[4] = new Card(CardFaces.KING, CardSuites.SPADES);
        assertFalse(deck.isTwoPair(card));
    }

    @Test
    public void testForThatInAFiveCardThatThereIsAThreeOfKindInIt(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.JACK, CardSuites.SPADES);
        card[1] = new Card(CardFaces.KING, CardSuites.HEART);
        card[2] = new Card(CardFaces.NINE, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.KING,CardSuites.SPADES);
        card[4] = new Card(CardFaces.KING, CardSuites.SPADES);
        assertTrue(deck.hasThreeOfAKind(card));
    }

    @Test
    public void testForThatACardIfItIsFourKindOf(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.KING, CardSuites.SPADES);
        card[1] = new Card(CardFaces.KING, CardSuites.SPADES);
        card[2] = new Card(CardFaces.JACK, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.KING,CardSuites.SPADES);
        card[4] = new Card(CardFaces.KING, CardSuites.SPADES);
        assertTrue(deck.hasFourOfAKind(card));
    }

    @Test
    public void testForThatACardIfIsNotFourKindOf(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.KING, CardSuites.SPADES);
        card[1] = new Card(CardFaces.JACK, CardSuites.HEART);
        card[2] = new Card(CardFaces.EIGHT, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.KING,CardSuites.SPADES);
        card[4] = new Card(CardFaces.KING, CardSuites.SPADES);
        assertFalse(deck.hasFourOfAKind(card));
    }

    @Test
    public void testThatAFiveCardPokerHaveFiveSameSuits(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.KING, CardSuites.SPADES);
        card[1] = new Card(CardFaces.ACE, CardSuites.SPADES);
        card[2] = new Card(CardFaces.JACK, CardSuites.SPADES);
        card[3] = new Card(CardFaces.KING,CardSuites.SPADES);
        card[4] = new Card(CardFaces.KING, CardSuites.SPADES);
        assertTrue(deck.isAFlushCard(card));
    }

    @Test
    public void testThatAFiveCardPokerNotHaveFiveSameSuits(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.KING, CardSuites.SPADES);
        card[1] = new Card(CardFaces.ACE, CardSuites.SPADES);
        card[2] = new Card(CardFaces.JACK, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.KING,CardSuites.SPADES);
        card[4] = new Card(CardFaces.KING, CardSuites.SPADES);
        assertFalse(deck.isAFlushCard(card));
    }

    @Test
    public void testThatAFiveCardPokerIsArrangeInAFaceValueConsecutively(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.TEN, CardSuites.SPADES);
        card[1] = new Card(CardFaces.NINE, CardSuites.SPADES);
        card[2] = new Card(CardFaces.EIGHT, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.SEVEN,CardSuites.SPADES);
        card[4] = new Card(CardFaces.SIX, CardSuites.SPADES);
        assertTrue(deck.isStraightCard(card));
    }

    @Test
    public void testForThatACardIsStraightWhenFaceValueIsConsecutively(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.ACE, CardSuites.SPADES);
        card[1] = new Card(CardFaces.DEUCE, CardSuites.SPADES);
        card[2] = new Card(CardFaces.THREE, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.FOUR,CardSuites.SPADES);
        card[4] = new Card(CardFaces.FIVE, CardSuites.SPADES);
        assertTrue(deck.isStraightCard(card));
    }

    @Test
    public void testForThatACardIsNotStraightCauseFaceValueIsNotConsecutively(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.ACE, CardSuites.SPADES);
        card[1] = new Card(CardFaces.DEUCE, CardSuites.SPADES);
        card[2] = new Card(CardFaces.THREE, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.JACK,CardSuites.SPADES);
        card[4] = new Card(CardFaces.FOUR, CardSuites.SPADES);
        assertFalse(deck.isStraightCard(card));
    }

    @Test
    public void testThatACardIsAFullHouseCard(){
        DeckOfCard deck = new DeckOfCard();
        Card[] card = new Card[5];
        card[0] = new Card(CardFaces.ACE, CardSuites.SPADES);
        card[1] = new Card(CardFaces.JACK, CardSuites.SPADES);
        card[2] = new Card(CardFaces.TEN, CardSuites.CLUBS);
        card[3] = new Card(CardFaces.JACK,CardSuites.SPADES);
        card[4] = new Card(CardFaces.JACK, CardSuites.SPADES);
        assertFalse(deck.isFullHouse(card));
    }
}
