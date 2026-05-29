package com.zipcodewilmington.froilansfarm;

public abstract class FarmVehicle extends Vehicle {
    
    public FarmVehicle(String name) {
        super(name);
    }

    public abstract void operate(Farm farm);
}
