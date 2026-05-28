package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private Field field;
    private List<Stable> stables;

    public Farm() {
        field = new Field();
        stables = new ArrayList<>();
        // stables.add(new Stable());
        // stables.add(new Stable());
        // stables.add(new Stable());
        // stables.get(0).addHorse(new Horse("Horse1"));
        // stables.get(0).addHorse(new Horse("Horse2"));
        // stables.get(0).addHorse(new Horse("Horse3"));
        // stables.get(1).addHorse(new Horse("Horse4"));
        // stables.get(1).addHorse(new Horse("Horse5"));
        // stables.get(1).addHorse(new Horse("Horse6"));
        // stables.get(2).addHorse(new Horse("Horse7"));
        // stables.get(2).addHorse(new Horse("Horse8"));
        // stables.get(2).addHorse(new Horse("Horse9"));
        // stables.get(2).addHorse(new Horse("Horse10"));
    }

    public Field getField() {
        return field;
    }

    public List<Stable> getStables() {
        return stables;
    }
}
