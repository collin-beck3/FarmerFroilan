package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<CropRow> cropRows;

    public Field() {
        cropRows = new ArrayList<>();
    }

    public List<CropRow> getCropRows() {
        return cropRows;
    }

    public void addCropRow(CropRow row) {
        cropRows.add(row);
    }
}
