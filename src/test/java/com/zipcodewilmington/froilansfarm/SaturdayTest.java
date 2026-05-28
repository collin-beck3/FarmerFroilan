import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import com.zipcodewilmington.froilansfarm.FarmTestBase;

public class SaturdayTest extends FarmTestBase {

    @Test
    void farmHasCorrectNumberOfStructures() {
        assertEquals(3, farm.getStables().size());
        assertEquals(4, farm.getChickenCoops().size());
        assertNotNull(farm.getFarmHouse());
        assertNotNull(farm.getField());
    }

    @Test
    void farmHasTwoFarmVehicles() {
        assertEquals(2, farm.getFarmVehicles().size());
    }

    @Test
    void tractorCanOperateOnFarm() {
        assertDoesNotThrow(() -> tractor.operate(farm));
    }

    @Test
    void cropDusterCanOperateOnFarm() {
        assertDoesNotThrow(() -> cropDuster.operate(farm));
    }
}
