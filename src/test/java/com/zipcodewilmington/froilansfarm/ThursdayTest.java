package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

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

    @Test
    void pilotMakesNoise() {
        assertEquals("Hello, I am Froilanda", froilanda.makeNoise());
    }
}