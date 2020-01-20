package com.company;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Countable> implements Countable {

    private List<T> listOfThingsInABox = new ArrayList<>();

    public void addThingsToBox(T thing) {
        listOfThingsInABox.add(thing);
    }

    @Override
    public int getCount() {
        int totalCount = 0;
        for (T things : listOfThingsInABox) {
            totalCount += things.getCount();
        }
        return totalCount;
    }
}
