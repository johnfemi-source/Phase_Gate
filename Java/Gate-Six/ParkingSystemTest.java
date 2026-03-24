import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingSystemTest {

    @Test
    public void testEnterCarPreferredSlot() {
        ParkingSystem.enterCar(101, 5);
        int expected = 101;
        int actual = ParkingSystem.slots[5];
        assertEquals(expected, actual);
    }

    @Test
    public void testEnterCarAutoAssign() {
        ParkingSystem.enterCar(202, 0);
        int expected = 202;
        int actual = ParkingSystem.slots[1];
        assertEquals(expected, actual);
    }
}


