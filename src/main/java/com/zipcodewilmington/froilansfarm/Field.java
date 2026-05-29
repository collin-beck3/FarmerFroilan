package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<CropRow> cropRows;

    public Field() {
        cropRows = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            cropRows.add(new CropRow());
        }
    }

    public List<CropRow> getCropRows() {
        return cropRows;
    }
}
