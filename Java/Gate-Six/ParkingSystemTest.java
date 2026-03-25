import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingSystemTest {

    @Test
    public void testEnterCarPreferredSlot() {
        ParkingSystem.enterCar(5, 1);
        int expected = 5;
        int actual = ParkingSystem.slots[5];
        assertEquals(expected, actual);
    }
}


