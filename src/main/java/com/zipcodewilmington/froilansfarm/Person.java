package com.zipcodewilmington.froilansfarm;

public abstract class Person implements Eater, NoiseMaker {
    protected String name;
    public Person(String name) {this.name = name;}
    @Override
    public void eat(Edible edible) {}
    @Override
    public void makeNoise() {}
}