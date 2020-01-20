package com.company;

public class Main {

    public static void main(String[] args) {

        Counter<Apple> appleCounter = new Counter<>();
        Counter<Box> boxCounter = new Counter<>();
        Counter<Cart> cartCounter = new Counter<>();

        appleCounter.add( new Apple() );
        appleCounter.add( new Apple() );
        appleCounter.add( new Apple() );

        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();

        boxCounter.add( new Box() );

        box1.addThingsToBox( new Apple() );
        box1.addThingsToBox( new Apple() );
        box1.addThingsToBox( new Apple() );

        box2.addThingsToBox( new Apple() );
        box2.addThingsToBox( new Apple() );

        Cart cart1 = new Cart();

        cartCounter.add( cart1 );
        cart1.addThingsToCart( box2 );

        System.out.println( cartCounter.getCount() );

    }

}
