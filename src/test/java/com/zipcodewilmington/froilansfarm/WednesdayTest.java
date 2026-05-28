import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.zipcodewilmington.froilansfarm.EarCorn;
import com.zipcodewilmington.froilansfarm.FarmTestBase;
import com.zipcodewilmington.froilansfarm.Horse;
import com.zipcodewilmington.froilansfarm.Stable;

public class WednesdayTest extends FarmTestBase {

    @Test
    void everyHorseCanBeRidden() {
        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getHorses()) {
                assertDoesNotThrow(() -> froilan.mount(horse));
                assertDoesNotThrow(() -> froilan.dismount(horse));
            }
        }
    }

    @Test
    void horseCanEatCorn() {
        Horse horse = new Horse();
        EarCorn corn = new EarCorn();

        assertDoesNotThrow(() -> horse.eat(corn));
    }

    @Test
    void horseMakesNoise() {
        Horse horse = new Horse();

        assertEquals("Neigh", horse.makeNoise());
    }
}