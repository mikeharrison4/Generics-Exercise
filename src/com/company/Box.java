package com.company;

import java.util.ArrayList;
import java.util.List;

public class Box<T> implements Countable {

    private List<T> listOfThingsInABox = new ArrayList<>();

    public void addThingsToBox(T thing) {
        listOfThingsInABox.add(thing);
    }

    @Override
    public int getCount() {
        return listOfThingsInABox.size();
    }
}
