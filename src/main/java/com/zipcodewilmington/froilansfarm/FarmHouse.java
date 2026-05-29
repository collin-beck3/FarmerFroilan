package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
        private List<Person> people;

    public FarmHouse() {
        people = new ArrayList<>();
        people.add(new Farmer("Froilan"));
        people.add(new Pilot("Froilanda"));
    }

    public List<Person> getPeople() {
        return people;
    }
}
