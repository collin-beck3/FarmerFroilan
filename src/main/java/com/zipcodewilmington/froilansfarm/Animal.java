package com.zipcodewilmington.froilansfarm;

public abstract class Animal implements Eater, NoiseMaker {
    protected String name;

    public Animal(String name) { this.name = name;}
    @Override
    public void eat(Edible edible) {}
    @Override
    public void makeNoise() {}
}