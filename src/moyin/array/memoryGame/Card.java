package moyin.array.memoryGame;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
    private String[] deck;
    private final String[] ALPHABETS =
            {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                    "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            };
    private final String[] MOTIVATIONAL_STATEMENTS =
            {
                    "Keep looking", "Don't lose focus", "Maintain your gaze", "Don't sleep on it"
            };
    private final String[] NUMBERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private final String[][] ALPHANUMERIC = {ALPHABETS, NUMBERS};
    private SecureRandom random = new SecureRandom();
    private int winningSymbolIndex;

    public Card(int deckLength) {
        deck = new String[deckLength];
        for (int i = 0; i < deckLength; i++) {
            int deckTypeIndex = random.nextInt(2);
            int deckTypeLength = ALPHANUMERIC[deckTypeIndex].length;
            deck[i] = ALPHANUMERIC[deckTypeIndex][random.nextInt(deckTypeLength)];
        }
    }

    public void shuffle(){
        List<String> indexes = new ArrayList<>();
        String [] newDeck = new String[deck.length];
        for (int i = 0; i < deck.length; i++) indexes.add(String.valueOf(i));
        for (int i = 0; i < newDeck.length; i++) {
            int nextCardIndex = Integer.parseInt(indexes.get(random.nextInt(indexes.size())));
            String nextCard = deck[nextCardIndex];
            newDeck[i] = nextCard;
            indexes.remove(String.valueOf(nextCardIndex));
        }
        deck = newDeck;
    }

    public String[] getDeck() {
        return deck;
    }

    public String nextMotivationalStatement() {
        return MOTIVATIONAL_STATEMENTS[random.nextInt(MOTIVATIONAL_STATEMENTS.length)];
    }

    public int getNextWinningSymbolIndex(){
        winningSymbolIndex = random.nextInt(deck.length);
        return winningSymbolIndex;
    }
    public String[] getBlankDeck(){
        String [] blankDeck = new String[deck.length];
        Arrays.fill(blankDeck, "X");
        return blankDeck;
    }

    public boolean playerHasWon(int playerWinningSymbolIndex){
        return winningSymbolIndex == (playerWinningSymbolIndex-1);
    }
}

