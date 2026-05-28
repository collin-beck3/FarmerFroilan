package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Stable {
    private List<Horse> horses;

    public Stable() {
        horses = new ArrayList<>();
    }

    public void addHorse(Horse horse) {
        horses.add(horse);
    }

    public List<Horse> getHorses() {
        return horses;
    }
}