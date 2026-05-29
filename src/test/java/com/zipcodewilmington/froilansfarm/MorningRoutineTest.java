package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class MorningRoutineTest
        extends FarmTestBase {

    @Test
    void testFroilanCanRideEachHorse() {

        Farmer froilan = new Farmer("Froilan", "Hello, I am Froilan");

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        stable1.addHorse(new Horse("Horse1", "Neigh"));
        stable1.addHorse(new Horse("Horse2", "Neigh"));
        stable1.addHorse(new Horse("Horse3", "Neigh"));
        stable2.addHorse(new Horse("Horse4", "Neigh"));
        stable2.addHorse(new Horse("Horse5", "Neigh"));
        stable2.addHorse(new Horse("Horse6", "Neigh"));
        stable3.addHorse(new Horse("Horse7", "Neigh"));
        stable3.addHorse(new Horse("Horse8", "Neigh"));
        stable3.addHorse(new Horse("Horse9", "Neigh"));
        stable3.addHorse(new Horse("Horse10", "Neigh"));

        List<Horse> horses = new ArrayList<>();
        horses.addAll(stable1.getHorses());
        horses.addAll(stable2.getHorses());
        horses.addAll(stable3.getHorses());

        for (Horse horse : horses) {
            assertDoesNotThrow(() -> froilan.mount(horse));
        }
    }

    @Test
    void testFroilandaCanRideEachHorse() {

        Pilot froilanda = new Pilot("Froilanda", "Hello, I am Froilanda");
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        stable1.addHorse(new Horse("Horse1", "Neigh"));
        stable1.addHorse(new Horse("Horse2", "Neigh"));
        stable1.addHorse(new Horse("Horse3", "Neigh"));
        stable2.addHorse(new Horse("Horse4", "Neigh"));
        stable2.addHorse(new Horse("Horse5", "Neigh"));
        stable2.addHorse(new Horse("Horse6", "Neigh"));
        stable3.addHorse(new Horse("Horse7", "Neigh"));
        stable3.addHorse(new Horse("Horse8", "Neigh"));
        stable3.addHorse(new Horse("Horse9", "Neigh"));
        stable3.addHorse(new Horse("Horse10", "Neigh"));

        List<Horse> horses = new ArrayList<>();
        horses.addAll(stable1.getHorses());
        horses.addAll(stable2.getHorses());
        horses.addAll(stable3.getHorses());

        for (Horse horse : horses) {
            assertDoesNotThrow(() -> froilanda.mount(horse));
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

        Farmer froilan = new Farmer("Froilan", "Hello, I am Froilan");

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

        Pilot froilanda = new Pilot("Froilanda", "Hello, I am Froilanda");

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