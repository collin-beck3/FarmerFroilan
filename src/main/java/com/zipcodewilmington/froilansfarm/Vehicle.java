package com.zipcodewilmington.froilansfarm;

public abstract class Vehicle implements Rideable, NoiseMaker {

    protected String name;
    protected String sound;

    public Vehicle(String name, String sound) { this.name = name; this.sound = sound;}

    @Override
    public void beMounted(Rider rider) {}
    @Override
    public void beDismounted(Rider rider) {}
    @Override
    public String makeNoise() {return sound; }
}
