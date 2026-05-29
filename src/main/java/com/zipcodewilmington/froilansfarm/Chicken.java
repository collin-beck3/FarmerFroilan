package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce<Edible> {

    public Chicken(String name) {
        super(name);
    }

    @Override
    public EdibleEgg yield() {
        return new EdibleEgg();
    }
}