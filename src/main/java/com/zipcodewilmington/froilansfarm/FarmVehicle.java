package com.zipcodewilmington.froilansfarm;

import java.util.List;

public abstract class FarmVehicle extends Vehicle {

    public FarmVehicle(String name, String sound) { super(name, sound); }
    private List<FarmVehicle> farmVehicles;
    public abstract void operate(Farm farm);
}
