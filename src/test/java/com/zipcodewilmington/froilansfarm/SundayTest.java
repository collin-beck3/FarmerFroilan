import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SundayTest extends FarmTestBase {

    @Test
    void froilanPlantsCropsInFirstThreeRows() {
        CropRow<Crop> row1 = farm.getField().getCropRows().get(0);
        CropRow<Crop> row2 = farm.getField().getCropRows().get(1);
        CropRow<Crop> row3 = farm.getField().getCropRows().get(2);

        froilan.plant(new CornStalk(), row1);
        froilan.plant(new TomatoPlant(), row2);
        froilan.plant(new LettucePlant(), row3);

        assertTrue(row1.getCrops().get(0) instanceof CornStalk);
        assertTrue(row2.getCrops().get(0) instanceof TomatoPlant);
        assertTrue(row3.getCrops().get(0) instanceof LettucePlant);
    }

    @Test
    void farmStartsWithCorrectNumberOfRows() {
        assertEquals(5, farm.getField().getCropRows().size());
    }

    @Test
    void farmStartsWithCorrectNumberOfHorses() {
        int horseCount = 0;

        for (Stable<Horse> stable : farm.getStables()) {
            horseCount += stable.getHorses().size();
        }

        assertEquals(10, horseCount);
    }

    @Test
    void farmStartsWithCorrectNumberOfChickens() {
        int chickenCount = 0;

        for (ChickenCoop<Chicken> coop : farm.getChickenCoops()) {
            chickenCount += coop.getChickens().size();
        }

        assertEquals(15, chickenCount);
    }
}
