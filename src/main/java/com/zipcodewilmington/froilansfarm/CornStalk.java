package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop<EarCorn> {
    @Override
    public EarCorn yield() {
        return new EarCorn();
    }
}
