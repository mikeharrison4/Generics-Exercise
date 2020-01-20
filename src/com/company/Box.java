package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Box<T extends Countable> implements Countable {

    private List<T> listOfThingsInABox = new ArrayList<>();

    @Override
    public int getCount(Predicate predicate) {
        return listOfThingsInABox.stream().map(o -> o.getCount(predicate)).mapToInt(Integer::intValue).sum();
    }

    public void addThingsToBox(T thing) {
        listOfThingsInABox.add(thing);
    }
}
