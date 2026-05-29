package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

//import com.zipcodewilmington.froilansfarm.CornStalk;
//import com.zipcodewilmington.froilansfarm.Crop;
//import com.zipcodewilmington.froilansfarm.CropRow;
//import com.zipcodewilmington.froilansfarm.EarCorn;
//import com.zipcodewilmington.froilansfarm.Edible;
//import com.zipcodewilmington.froilansfarm.FarmTestBase;
//import com.zipcodewilmington.froilansfarm.Lettuce;
//import com.zipcodewilmington.froilansfarm.LettucePlant;
//import com.zipcodewilmington.froilansfarm.Tomato;
//import com.zipcodewilmington.froilansfarm.TomatoPlant;

public class TuesdayTest extends FarmTestBase {

    @Test
    void tractorHarvestsEveryCrop() {
        for (CropRow row : farm.getField().getCropRows()) {
            row.addCrop(new CornStalk());
        }

        for (CropRow row : farm.getField().getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                tractor.harvest(crop);
            }
        }

        for (CropRow row : farm.getField().getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
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