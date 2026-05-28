package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;

public abstract class FarmTestBase {

    protected Farm farm;
    protected Farmer froilan;
    protected Pilot froilanda;
    protected Tractor tractor;
    protected CropDuster cropDuster;

    @BeforeEach
    void setUp() {
        farm = new Farm();

        froilan = new Farmer("Froilan");
        froilanda = new Pilot("Froilanda");

        tractor = new Tractor();
        cropDuster = new CropDuster();

        farm.setFarmHouse(new FarmHouse());
        farm.getFarmHouse().addPerson(froilan);
        farm.getFarmHouse().addPerson(froilanda);

        farm.setField(new Field());

        for (int i = 0; i < 5; i++) {
            farm.getField().addCropRow(new CropRow<>());
        }

        for (int i = 0; i < 3; i++) {
            farm.addStable(new Stable<>());
        }

        for (int i = 0; i < 4; i++) {
            farm.addChickenCoop(new ChickenCoop<>());
        }

        addHorses();
        addChickens();

        farm.addFarmVehicle(tractor);
        farm.addFarmVehicle(cropDuster);
    }

    private void addHorses() {
        int horseCount = 0;

        for (Stable<Horse> stable : farm.getStables()) {
            while (stable.getHorses().size() < 4 && horseCount < 10) {
                stable.add(new Horse());
                horseCount++;
            }
        }
    }

    private void addChickens() {
        int chickenCount = 0;

        for (ChickenCoop<Chicken> coop : farm.getChickenCoops()) {
            while (coop.getChickens().size() < 4 && chickenCount < 15) {
                coop.add(new Chicken());
                chickenCount++;
            }
        }
    }
}
