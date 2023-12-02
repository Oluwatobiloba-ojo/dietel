package chapter_seven.card;

public class Card {
    private final CardFaces face;
    private final CardSuites suits;

    public Card(CardFaces face, CardSuites suits) {
        this.face = face;
        this.suits = suits;
    }

    public CardFaces getFace() {
        return face;
    }

    public CardSuites getSuit() {
        return suits;
    }

    public String toString(){
        return face + " " + suits;
    }
}
