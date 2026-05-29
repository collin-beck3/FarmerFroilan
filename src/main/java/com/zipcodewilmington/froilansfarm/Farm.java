package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private Field field;
    private FarmHouse farmHouse;
    private List<FarmVehicle> farmVehicles;
    private List<ChickenCoop> chickenCoops;
    private List<Stable> stables;

    public Farm() {
        field = new Field();
        farmHouse = new FarmHouse();

        farmVehicles = new ArrayList<>();
        farmVehicles.add(new Tractor("tractor", "vroum"));
        farmVehicles.add(new CropDuster("CropDuster", "whoossh"));

        chickenCoops = new ArrayList<>();
        chickenCoops.add(new ChickenCoop());
        chickenCoops.add(new ChickenCoop());
        chickenCoops.add(new ChickenCoop());
        chickenCoops.add(new ChickenCoop());

        stables = new ArrayList<>();
        stables.add(new Stable());
        stables.add(new Stable());
        stables.add(new Stable());
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public Field getField() {
        return field;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public List<FarmVehicle> getFarmVehicles() {
        return farmVehicles;
    }
}
