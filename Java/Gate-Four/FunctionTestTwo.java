import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionTestTwo {

    @Test
    public void testCountEvens() {
        int[] numbers = {1, 2, 3, 4, 6, 7};
        int expected = 3;
        int actual = FunctionTwo.countEvens(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testSquares() {
        int[] expected = {};
        int[] actual = FunctionTwo.squares(0);

        assertEquals(expected.length, actual.length);
    }

    @Test
    public void testArraysEqual() {
        int[] first = {1, 2, 3};
        int[] second = {1, 2, 3};

        boolean expected = true;
        boolean actual = FunctionTwo.arraysEqual(first, second);

        assertEquals(expected, actual);
    }
}
