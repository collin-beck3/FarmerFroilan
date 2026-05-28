import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TuesdayTest extends FarmTestBase {

    @Test
    void tractorHarvestsEveryCrop() {
        for (CropRow<Crop> row : farm.getField().getCropRows()) {
            row.addCrop(new CornStalk());
        }

        for (CropRow<Crop> row : farm.getField().getCropRows()) {
            for (Crop crop : row.getCrops()) {
                tractor.harvest(crop);
            }
        }

        for (CropRow<Crop> row : farm.getField().getCropRows()) {
            for (Crop crop : row.getCrops()) {
                assertTrue(crop.hasBeenHarvested());
            }
        }
    }

    @Test
    void harvestedCornStalkYieldsEarCorn() {
        CornStalk corn = new CornStalk();

        tractor.harvest(corn);

        Edible food = corn.yield();

        assertTrue(food instanceof EarCorn);
    }

    @Test
void harvestedTomatoPlantProducesTomato() {
    TomatoPlant tomatoPlant = new TomatoPlant();

    tractor.harvest(tomatoPlant);

    Edible edible = tomatoPlant.yield();

    assertTrue(edible instanceof Tomato);
}

@Test
void harvestedLettucePlantProducesLettuce() {
    LettucePlant lettucePlant = new LettucePlant();

    tractor.harvest(lettucePlant);

    Edible edible = lettucePlant.yield();

    assertTrue(edible instanceof Lettuce);
}
}