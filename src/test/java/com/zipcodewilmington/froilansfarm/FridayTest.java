package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//import com.zipcodewilmington.froilansfarm.Chicken;
//import com.zipcodewilmington.froilansfarm.Edible;
//import com.zipcodewilmington.froilansfarm.EdibleEgg;
//import com.zipcodewilmington.froilansfarm.FarmTestBase;

public class FridayTest extends FarmTestBase {

    @Test
    void unfertilizedChickenYieldsEdibleEgg() {
        Chicken chicken = new Chicken("chicken", "cluck");

        chicken.setHasBeenFertilized(false);

        Edible egg = chicken.yield();

        assertTrue(egg instanceof EdibleEgg);
    }

    @Test
    void fertilizedChickenDoesNotYieldEdibleEgg() {
        Chicken chicken = new Chicken("chicken", "cluck");

        chicken.setHasBeenFertilized(true);

        Edible egg = chicken.yield();

        assertNull(egg);
    }
}