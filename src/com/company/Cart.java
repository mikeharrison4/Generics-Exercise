package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Countable {

    List<Box> boxes = new ArrayList<>();

    public void addThingsToCart(Box thing) {
        boxes.add(thing);
    }

    @Override
    public int getCount() {
        int totalCount = 0;
        for (Box box : boxes) {
            totalCount += box.getCount();
        }
        return totalCount;
    }

}
