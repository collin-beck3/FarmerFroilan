package com.zipcodewilmington.froilansfarm;

public abstract class Vehicle implements Rideable, NoiseMaker {

    @Override
    public void beMounted(Rider rider) {}
    @Override
    public void beDismounted(Rider rider) {}
    @Override
    public void makeNoise() {}
}
