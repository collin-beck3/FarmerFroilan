package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    private List<Crop<?>> crops;
    private boolean hasBeenFertilized;

    public CropRow() {
        crops = new ArrayList<>();
        hasBeenFertilized = false;
    }

    public void addCrop(Crop<?> crop) {
        crops.add(crop);
    }

    public List<Crop<?>> getCrops() {
        return crops;
    }

    public void fertilize() {
        for (Crop crop : crops) {
            crop.setHasBeenFertilized(true);
        }
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }
}