package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Cart implements Countable {

    List<Box> boxes = new ArrayList<>();

    public void addThingsToCart(Box thing) {
        boxes.add(thing);
    }

    @Override
    public int getCount(Predicate predicate) {
        return boxes.stream().map(o -> o.getCount(predicate)).mapToInt(Integer::intValue).sum();
    }

}
