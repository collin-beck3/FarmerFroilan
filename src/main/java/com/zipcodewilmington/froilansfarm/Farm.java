    package com.zipcodewilmington.froilansfarm;

    import java.util.ArrayList;
    import java.util.List;

    public class Farm {
        private Field field;
        private FarmHouse farmHouse;
        private Vehicle vehicle;
        private List<FarmVehicle> farmVehicles;
        private List<ChickenCoop> chickenCoops;
        private List<Stable> stables;

        public Farm() {
            field = new Field();
            farmHouse = new FarmHouse();

            farmVehicles = new ArrayList<>();

            chickenCoops = new ArrayList<>();

            stables = new ArrayList<>();
        }

        public void addFarmVehicle(FarmVehicle vehicle) {
            farmVehicles.add(vehicle);
        }

        public void addChickenCoop(ChickenCoop coop) {
            chickenCoops.add(coop);
        }

        public void addStable(Stable stable) {
            stables.add(stable);
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
