package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable{
    public Horse(String name) {
        super(name);
    }

    public void beMounted(Rider rider) {}
    public void beDismounted(Rider rider) {}
}