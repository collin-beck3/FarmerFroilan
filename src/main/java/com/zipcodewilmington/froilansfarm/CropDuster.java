package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements Aircraft {

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
}
