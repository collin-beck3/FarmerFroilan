package com.zipcodewilmington.froilansfarm;

public interface Produce<T extends Edible> {
    T yield();
}