package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements Aircraft {
    protected String name;
    protected String sound;

    public CropDuster(String name, String sound) { super(name, sound); }

    public void fertilize(CropRow row) {
        row.fertilize();
    }

    @Override
    public void fly() {}
    @Override
    public void operate(Farm farm) {
        for (CropRow row : farm.getField().getCropRows()) {
            fertilize(row);
        }
    }
    @Override
    public String makeNoise() { return sound; }
}
