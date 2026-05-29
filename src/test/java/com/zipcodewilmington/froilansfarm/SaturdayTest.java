package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

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
    void cropDusterCanFertilizeEachCropRow() {

        for (CropRow row : farm.getField().getCropRows()) {
            cropDuster.fertilize(row);
            assertTrue(row.hasBeenFertilized());
        }
    }

    @Test
    void cropDusterOperateFertilizesEntireFarm() {
        cropDuster.operate(farm);
        for (CropRow row : farm.getField().getCropRows()) {
            assertTrue(row.hasBeenFertilized());
        }
    }
    
    @Test
    void tractorOperateHarvestsEntireFarm() {
        tractor.operate(farm);
        for (CropRow row : farm.getField().getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                assertTrue(crop.hasBeenHarvested());
            }
        }
    }

    @Test
    void horseCanBeMountedAndDismounted() {
        assertDoesNotThrow(() -> horse.beMounted(froilan));
        assertDoesNotThrow(() -> horse.beDismounted(froilan));
    }

    @Test
    void tractorCanBeMountedAndDismounted() {
        assertDoesNotThrow(() -> tractor.beMounted(froilan));
        assertDoesNotThrow(() -> tractor.beDismounted(froilan));
    }

    @Test
    void cropDusterCanBeMountedAndDismounted() {
        assertDoesNotThrow(() -> cropDuster.beMounted(froilanda));
        assertDoesNotThrow(() -> cropDuster.beDismounted(froilanda));
    }
}
