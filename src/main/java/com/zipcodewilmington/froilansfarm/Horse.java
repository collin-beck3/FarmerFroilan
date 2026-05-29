package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable{
    public Horse(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void beMounted(Rider rider) {}
    @Override
    public void beDismounted(Rider rider) {}
    @Override
    public String makeNoise() { return sound; }
}