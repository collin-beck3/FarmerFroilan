package com.zipcodewilmington.froilansfarm;

public class LettucePlant extends Crop<Lettuce> {
    @Override
    public Lettuce yield() {
        return new Lettuce();
    }
}
