import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumbers {

    @Test
    public void testGetNumbers() {
        int[] numbers = {9,2,3,2,1};
        String expected = "9,3,1";
        String actual = Numbers.getNumbers(numbers);
        assertEquals(expected, actual);
    }
}


