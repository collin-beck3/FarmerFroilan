import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MondayTest extends FarmTestBase {

    @Test
    void cropDusterCanFly() {
        assertDoesNotThrow(() -> cropDuster.fly());
    }

    @Test
    void froilandaUsesCropDusterToFertilizeEveryCropRow() {
        for (CropRow<Crop> row : farm.getField().getCropRows()) {
            row.addCrop(new CornStalk());
            cropDuster.fertilize(row);
        }

        for (CropRow<Crop> row : farm.getField().getCropRows()) {
            for (Crop crop : row.getCrops()) {
                assertTrue(crop.hasBeenFertilized());
            }
        }
    }
}
