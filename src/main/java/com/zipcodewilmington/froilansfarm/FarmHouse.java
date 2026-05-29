package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
        private List<Person> people;

    public FarmHouse() {
        people = new ArrayList<>();
    }

    public List<Person> getPeople() {
        return people;
    }

    public void addPerson(Person person) {
        people.add(person);
    }
}
