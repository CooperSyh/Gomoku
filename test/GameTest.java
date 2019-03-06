import model.Chess;
import model.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {
    private Game testGame;

    @BeforeEach
    void runBefore() {
        testGame = new Game();
    }

    @Test
    void testIsOver() {
        testGame.placePiece(5, 5);  //place a black piece at 5,5
        testGame.placePiece(5, 4);  //place a white piece at 5,4
        testGame.placePiece(4, 5);  //place a black piece at 4,5
        testGame.placePiece(4, 4);  //place a white piece at 4,4
        testGame.placePiece(3, 5);  //place a black piece at 3,5
        testGame.placePiece(3, 4);  //place a white piece at 3,4
        testGame.placePiece(7, 5);  //place a black piece at 7,5
        testGame.placePiece(2, 4);  //place a white piece at 2,4
        testGame.placePiece(6, 5);  //place a black piece at 6,5
        assertTrue(testGame.isOver(new Chess(5, 5, false)));
    }
}
