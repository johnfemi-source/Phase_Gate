import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestNumberGuessingApp {

    @Test
    void testCheckGuessTooLow() {
        boolean result = NumberGuessingApp.checkGuess(50, 30);
        assertFalse(result);
    }

    @Test
    void testCheckGuessTooHigh() {
        boolean result = NumberGuessingApp.checkGuess(50, 70);
        assertFalse(result);
    }

    @Test
    void testCheckGuessCorrect() {
        boolean result = NumberGuessingApp.checkGuess(50, 50);
        assertTrue(result);
    }
}
