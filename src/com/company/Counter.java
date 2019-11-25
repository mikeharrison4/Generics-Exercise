package com.company;

import java.util.ArrayList;
import java.util.List;

public class Counter<T extends Countable> {

    private List<T> contents = new ArrayList<>();

    public void add(T thing) {
        contents.add(thing);
    }

    public int getCount() {
        return contents.size();
    }

}
