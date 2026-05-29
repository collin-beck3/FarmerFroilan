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
        field.getCropRows().get(0).addCrop(new CornStalk());
        field.getCropRows().get(1).addCrop(new TomatoPlant());
        field.getCropRows().get(2).addCrop(new LettucePlant());
        field.getCropRows().get(3).addCrop(new LettucePlant());
        field.getCropRows().get(4).addCrop(new LettucePlant());

        farmVehicles = new ArrayList<>();
        farmVehicles.add(new Tractor());
        farmVehicles.add(new CropDuster());

        chickenCoops = new ArrayList<>();
        chickenCoops.add(new ChickenCoop());
        chickenCoops.add(new ChickenCoop());
        chickenCoops.add(new ChickenCoop());
        chickenCoops.add(new ChickenCoop());
        chickenCoops.get(0).addChicken(new Chicken("Chicken1"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken2"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken3"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken4"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken5"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken6"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken7"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken8"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken9"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken10"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken11"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken12"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken13"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken14"));
        chickenCoops.get(0).addChicken(new Chicken("Chicken15"));

        stables = new ArrayList<>();
        stables.add(new Stable());
        stables.add(new Stable());
        stables.add(new Stable());
        stables.get(0).addHorse(new Horse("Horse1"));
        stables.get(0).addHorse(new Horse("Horse2"));
        stables.get(0).addHorse(new Horse("Horse3"));
        stables.get(1).addHorse(new Horse("Horse4"));
        stables.get(1).addHorse(new Horse("Horse5"));
        stables.get(1).addHorse(new Horse("Horse6"));
        stables.get(2).addHorse(new Horse("Horse7"));
        stables.get(2).addHorse(new Horse("Horse8"));
        stables.get(2).addHorse(new Horse("Horse9"));
        stables.get(2).addHorse(new Horse("Horse10"));
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
