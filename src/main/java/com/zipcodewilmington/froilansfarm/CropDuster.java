package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements Aircraft {
    public CropDuster(String name) {
        super(name);
    }

    public void fertilize(CropRow row) {}

    @Override
    public void operate(Farm farm) {}
    @Override
    public void fly() {}
}
