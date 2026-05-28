package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class MorningRoutineTest {

    @Test
    void testFroilanCanRideEachHorse() {

        Farmer froilan = new Farmer("Froilan");

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        stable1.addHorse(new Horse("Horse1"));
        stable1.addHorse(new Horse("Horse2"));
        stable1.addHorse(new Horse("Horse3"));
        stable2.addHorse(new Horse("Horse4"));
        stable2.addHorse(new Horse("Horse5"));
        stable2.addHorse(new Horse("Horse6"));
        stable3.addHorse(new Horse("Horse7"));
        stable3.addHorse(new Horse("Horse8"));
        stable3.addHorse(new Horse("Horse9"));
        stable3.addHorse(new Horse("Horse10"));

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

        Pilot froilanda = new Pilot("Froilanda");
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        stable1.addHorse(new Horse("Horse1"));
        stable1.addHorse(new Horse("Horse2"));
        stable1.addHorse(new Horse("Horse3"));
        stable2.addHorse(new Horse("Horse4"));
        stable2.addHorse(new Horse("Horse5"));
        stable2.addHorse(new Horse("Horse6"));
        stable3.addHorse(new Horse("Horse7"));
        stable3.addHorse(new Horse("Horse8"));
        stable3.addHorse(new Horse("Horse9"));
        stable3.addHorse(new Horse("Horse10"));

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

        Horse horse = new Horse("TestHorse");

        assertDoesNotThrow(() -> {
            horse.eat(new EarCorn());
            horse.eat(new EarCorn());
            horse.eat(new EarCorn());
        });
    }

    @Test
    void testFroilanCanEatBreakfast() {

        Farmer froilan = new Farmer("Froilan");

        assertDoesNotThrow(() -> {
            froilan.eat(new EarCorn());
            froilan.eat(new Tomato());
            froilan.eat(new Tomato());

            for (int i = 0; i < 5; i++) {
                froilan.eat(new EdibleEgg());
            }
        });
    }

    @Test
    void testFroilandaCanEatBreakfast() {

        Pilot froilanda = new Pilot("Froilanda");

        assertDoesNotThrow(() -> {
            froilanda.eat(new EarCorn());
            froilanda.eat(new EarCorn());
            froilanda.eat(new Tomato());
            froilanda.eat(new EdibleEgg());
            froilanda.eat(new EdibleEgg());
        });
    }
}