package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class MorningRoutineTest
        extends FarmTestBase {

    @Test
    void testFroilanCanRideEachHorse() {

        for (Stable stable : farm.getStables()) {
            for (Horse horse :
                    stable.getHorses()) {

                assertDoesNotThrow(() ->
                        froilan.mount(horse));
            }
        }
    }

    @Test
    void testFroilandaCanRideEachHorse() {

        for (Stable stable : farm.getStables()) {
            for (Horse horse :
                    stable.getHorses()) {

                assertDoesNotThrow(() ->
                        froilanda.mount(horse));
            }
        }
    }

    @Test
    void testEachHorseCanEatThreeEarCorn() {

        for (Stable stable : farm.getStables()) {
            for (Horse horse :
                    stable.getHorses()) {

                assertDoesNotThrow(() -> {
                    horse.eat(new EarCorn());
                    horse.eat(new EarCorn());
                    horse.eat(new EarCorn());
                });
            }
        }
    }

    @Test
    void testFroilanCanEatBreakfast() {

        assertDoesNotThrow(() -> {
            froilan.eat(new EarCorn());
            froilan.eat(new Tomato());
            froilan.eat(new Tomato());

            for (int i = 0; i < 5; i++) {
                froilan.eat(
                        new EdibleEgg());
            }
        });
    }

    @Test
    void testFroilandaCanEatBreakfast() {

        assertDoesNotThrow(() -> {
            froilanda.eat(new EarCorn());
            froilanda.eat(new EarCorn());
            froilanda.eat(new Tomato());
            froilanda.eat(
                    new EdibleEgg());
            froilanda.eat(
                    new EdibleEgg());
        });
    }
}