package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable{
    public Horse(String name) {
        super(name);
    }

    @Override
    public void beMounted(Rider rider) {}
    @Override
    public void beDismounted(Rider rider) {}
}