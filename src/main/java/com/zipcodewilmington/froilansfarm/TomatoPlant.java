package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop<Tomato>{
    @Override
    public Tomato yield() {
        return new Tomato();
    }
}
