import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionTest {

    @Test
    public void testGetPrimeNumbers() {

        int[] numbers = {5, 9, 3, 6, 2};

        String expected = "5 3 2";

        String actual = Function.getPrimeNumbers(numbers);

        assertEquals(expected, actual);
    }
}
