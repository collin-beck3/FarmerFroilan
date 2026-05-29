package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//import com.zipcodewilmington.froilansfarm.CornStalk;
//import com.zipcodewilmington.froilansfarm.Crop;
//import com.zipcodewilmington.froilansfarm.CropRow;
//import com.zipcodewilmington.froilansfarm.FarmTestBase;

public class MondayTest extends FarmTestBase {

    @Test
    void cropDusterCanFly() {
        assertDoesNotThrow(() -> cropDuster.fly());
    }

    @Test
    void froilandaUsesCropDusterToFertilizeEveryCropRow() {
        for (CropRow row : farm.getField().getCropRows()) {
            row.addCrop(new CornStalk());
            cropDuster.fertilize(row);
        }

        for (CropRow row : farm.getField().getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                assertTrue(crop.hasBeenFertilized());
            }
        }
    }
}
