package com.company;

import java.util.function.Predicate;

public class Apple implements Countable {

    private String colour;

    public Apple(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public int getCount(Predicate predicate) {
        return 1;
    }
}
