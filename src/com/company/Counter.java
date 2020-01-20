package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Counter<T extends Countable> {

    private Predicate predicate;
    private List<T> contents = new ArrayList<T>();

    public Counter(Predicate predicate) {
        this.predicate = predicate;
    }

    public void add(T thing) {
        contents.add(thing);
    }

    public int getCount() {
        return contents.stream().map(o -> o.getCount(predicate)).mapToInt(Integer::intValue).sum();
    }

}
