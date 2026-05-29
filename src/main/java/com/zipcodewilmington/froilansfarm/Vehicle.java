package com.zipcodewilmington.froilansfarm;

public abstract class Vehicle implements Rideable, NoiseMaker {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public void beMounted(Rider rider) {}
    @Override
    public void beDismounted(Rider rider) {}
    @Override
    public void makeNoise() {}
}
