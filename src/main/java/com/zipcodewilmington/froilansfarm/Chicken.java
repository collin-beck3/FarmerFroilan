package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce<Edible> {
    protected boolean hasBeenFertilized = false;

    public Chicken(String name, String sound) {
        super(name, sound);
    }

    @Override
    public EdibleEgg yield() {
        if (!hasBeenFertilized) {
            return new EdibleEgg();
        }
        return null;
    }

    public boolean hasBeenFertilized() {
       return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}