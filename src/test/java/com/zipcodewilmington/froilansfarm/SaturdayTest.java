package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
        for (CropRow row : farm.getField().getCropRows()) { 
            row.addCrop(new CornStalk());
            row.addCrop(new TomatoPlant());
            row.addCrop(new LettucePlant());
            }
        tractor.operate(farm);
        for (CropRow row : farm.getField().getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                assertTrue(crop.hasBeenHarvested());
            }
        }
    }

    @Test
    void horseCanBeMountedAndDismounted() {
        Horse horse = farm.getStables().get(0).getHorses().get(0);
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

    @Test
    void horseMakesNoise() {
        Horse horse = farm.getStables().get(0).getHorses().get(0);
        assertEquals("Neigh", horse.makeNoise());
    }
    
    @Test
    void chickenMakesNoise() {
        Chicken chicken = farm.getChickenCoops().get(0).getChickens().get(0);
        assertEquals("cluck", chicken.makeNoise());
    }
    
    @Test
    void tractorMakesNoise() {
        assertEquals("vroom", tractor.makeNoise());
    }
    
    @Test
    void cropDusterMakesNoise() {
        assertEquals("whooosh", cropDuster.makeNoise());
    }
    
    @Test
    void froilanMakesNoise() {
        assertEquals("Hello, I am Froilan", froilan.makeNoise());
    }
    
    @Test
    void froilandaMakesNoise() {
        assertEquals("Hello, I am Froilanda", froilanda.makeNoise());
    }

    @Test
    void pilotCanMountAndDismountHorse() {
        Horse horse = farm.getStables().get(0).getHorses().get(0);
        assertDoesNotThrow(() -> {
            froilanda.mount(horse);
            froilanda.dismount(horse);
        });
    }

    @Test
    void farmStartsWithCorrectNumberOfPeople() {
        int peopleCount = farm.getFarmHouse().getPeople().size();
        assertEquals(2, peopleCount);
    }

    @Test
    void chickenStartsUnfertilized() {
        Chicken chicken = farm.getChickenCoops().get(0).getChickens().get(0);
        assertFalse(chicken.hasBeenFertilized());
    }

    @Test
    void chickenCanBeFertilized() {
        Chicken chicken = farm.getChickenCoops().get(0).getChickens().get(0);
        chicken.setHasBeenFertilized(true);
        assertTrue(chicken.hasBeenFertilized());
    }

    @Test
    void genericCropRowStartsEmpty() {
        CropRow row = new CropRow();
        assertEquals(0, row.getCrops().size());
    }

    @Test
    void genericCropRowIsNotEmptyAfterAddingMixedCrops() {
        CropRow row = new CropRow();
        row.addCrop(new CornStalk());
        row.addCrop(new TomatoPlant());
        row.addCrop(new LettucePlant());
        assertFalse(row.getCrops().isEmpty());
    }

    @Test
    void genericProduceYieldDoesNotReturnNull() {
        Produce<EarCorn> cornProducer = new CornStalk();
        Produce<Tomato> tomatoProducer = new TomatoPlant();
        Produce<Lettuce> lettuceProducer = new LettucePlant();
        assertNotNull(cornProducer.yield());
        assertNotNull(tomatoProducer.yield());
        assertNotNull(lettuceProducer.yield());
    }

    @Test
    void differentGenericYieldsAreNotSameClass() {
        Produce<EarCorn> cornProducer = new CornStalk();
        Produce<Tomato> tomatoProducer = new TomatoPlant();
        assertNotEquals(cornProducer.yield().getClass(), tomatoProducer.yield().getClass());
    }

    @Test
    void wildcardCropReferencesDoNotThrowWhenYielding() {
        Crop<?> corn = new CornStalk();
        Crop<?> tomato = new TomatoPlant();
        Crop<?> lettuce = new LettucePlant();
        assertDoesNotThrow(() -> corn.yield());
        assertDoesNotThrow(() -> tomato.yield());
        assertDoesNotThrow(() -> lettuce.yield());
    }

}
