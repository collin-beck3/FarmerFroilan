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
        hasBeenFertilized = true;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }
}