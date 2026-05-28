package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Rider, Botanist{
    public Farmer(String name) {
        super(name);
    }

    @Override
    public void plant(Crop<?> crop, CropRow row) {}
    @Override
    public void mount(Rideable rideable) {}
    @Override
    public void dismount(Rideable rideable) {}
}