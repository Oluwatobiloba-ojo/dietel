package chapter_seven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArcheryGameTest {
    ArcheryClass myArchery;
    @BeforeEach
    public void setMyArchery(){
        myArchery = new ArcheryClass();
    }

    @Test
    public void testForThePlayersForTheGameIsFour(){
       int players = myArchery.getNumberOfPlayers();
       int numberOfPlayer = 4;
       assertEquals(players, numberOfPlayer);
    }

    @Test
    public void testForTheSelectionOfPlayers(){
        myArchery.setPlayers(1);
        assertEquals(1, myArchery.getPlayerSet());
        myArchery.setPlayers(2);
        assertEquals(2, myArchery.getPlayerSet());
    }

    @Test
    public void testThatWhenAPlayerIsSelectedHePlayHisOwnArchery(){
        myArchery.setPlayers(1);
        assertEquals(1, myArchery.getPlayerSet());
        myArchery.shotArchery(10);
        assertEquals(10, myArchery.checkOutPlayerScore());
    }

    @Test
    public void testForWhenDifferentPlayersPlays(){
        myArchery.setPlayers(1);
        myArchery.shotArchery(10);
        assertEquals(10, myArchery.checkOutPlayerScore());

        myArchery.setPlayers(2);
        myArchery.shotArchery(9);
        assertEquals(9, myArchery.checkOutPlayerScore());
    }

    @Test
    public void testForTheWinnerOfTheArcheryGame(){
        for (int i = 0; i < 3; i++){
            myArchery.setPlayers(i + 1);
            myArchery.shotArchery((i + 1) * 2);
        }
        assertEquals(3,myArchery.checkOutWinner());
    }
}
