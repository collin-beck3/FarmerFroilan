package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

//import com.zipcodewilmington.froilansfarm.EarCorn;
//import com.zipcodewilmington.froilansfarm.FarmTestBase;
//import com.zipcodewilmington.froilansfarm.Horse;
//import com.zipcodewilmington.froilansfarm.Stable;

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
        Horse horse = new Horse("horse", "Neigh");
        EarCorn corn = new EarCorn();

        assertDoesNotThrow(() -> horse.eat(corn));
    }

    @Test
    void horseMakesNoise() {
        Horse horse = new Horse("horse", "Neigh");

        assertEquals("Neigh", horse.makeNoise());
    }
}