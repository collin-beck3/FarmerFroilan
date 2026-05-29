package com.zipcodewilmington.froilansfarm;

public class Pilot extends Person implements Rider {
    public Pilot(String name) {
        super(name);
    }
    @Override
    public void mount(Rideable rideable) {}
    @Override
    public void dismount(Rideable rideable) {}
    @Override
    public String makeNoise() { return sound; }
}
