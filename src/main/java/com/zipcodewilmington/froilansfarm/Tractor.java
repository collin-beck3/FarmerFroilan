package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle {
    public Tractor(String name) {
        super(name);
    }

    public void harvest(Crop<?> crop) {}

    @Override
    public void operate(Farm farm) {}
}
