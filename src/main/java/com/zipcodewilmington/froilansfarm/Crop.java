package com.zipcodewilmington.froilansfarm;

public abstract class Crop<T extends Edible> implements Produce<T> {
    private boolean hasBeenHarvested;

    public Crop() {
        hasBeenHarvested = false;
    }

    public void harvest() {
        hasBeenHarvested = true;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

}