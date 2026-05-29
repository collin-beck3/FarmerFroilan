package com.zipcodewilmington.froilansfarm;

import java.util.List;

public abstract class FarmVehicle extends Vehicle {
    private List<FarmVehicle> farmVehicles;
    public abstract void operate(Farm farm);
}
