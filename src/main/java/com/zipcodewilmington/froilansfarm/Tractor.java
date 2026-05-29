package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle {

    public Tractor(String name, String sound) { super(name, sound); }

    public void harvest(Crop<?> crop) {
        crop.harvest();
    }

    @Override
    public void operate(Farm farm) {
        for (CropRow row : farm.getField().getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                harvest(crop);
            }
        }
    }
}
