package com.zipcodewilmington.froilansfarm;

public abstract class Person implements Eater, NoiseMaker {
    protected String name;
    protected String sound;
    public Person(String name, String sound) {this.name = name; this.sound = sound;}
    @Override
    public void eat(Edible edible) {}
    @Override
    public String makeNoise() { return sound; }
}