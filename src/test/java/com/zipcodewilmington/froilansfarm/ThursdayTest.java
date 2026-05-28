import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.zipcodewilmington.froilansfarm.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleEgg;
import com.zipcodewilmington.froilansfarm.FarmTestBase;
import com.zipcodewilmington.froilansfarm.Tomato;

public class ThursdayTest extends FarmTestBase {

    @Test
    void froilanCanEatBreakfast() {
        assertDoesNotThrow(() -> froilan.eat(new EarCorn()));
        assertDoesNotThrow(() -> froilan.eat(new Tomato()));
        assertDoesNotThrow(() -> froilan.eat(new EdibleEgg()));
    }

    @Test
    void froilandaCanEatBreakfast() {
        assertDoesNotThrow(() -> froilanda.eat(new EarCorn()));
        assertDoesNotThrow(() -> froilanda.eat(new Tomato()));
        assertDoesNotThrow(() -> froilanda.eat(new EdibleEgg()));
    }

    @Test
    void farmerMakesNoise() {
        assertEquals("Hello, I am Froilan", froilan.makeNoise());
    }
}