package com.company;

public class Main {

    public static void main(String[] args) {

        Counter<Apple> appleCounter = new Counter<>();
//        Counter<Box> boxCounter = new Counter<>();


        appleCounter.add( new Apple() );
        appleCounter.add( new Apple() );
        appleCounter.add( new Apple() );

        System.out.println( appleCounter.getCount() );

    }
}
