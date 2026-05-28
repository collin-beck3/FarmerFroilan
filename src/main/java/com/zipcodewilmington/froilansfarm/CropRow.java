package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    private List<Crop<?>> crops;

    public CropRow() {
        crops = new ArrayList<>();
    }

    public void addCrop(Crop<?> crop) {
        crops.add(crop);
    }

    public List<Crop<?>> getCrops() {
        return crops;
    }
}