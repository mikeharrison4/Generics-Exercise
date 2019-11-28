package com.company;

public class Main {

    public static void main(String[] args) {

        Counter<Apple> appleCounter = new Counter<>();
        Box<Object> box = new Box<>();

        appleCounter.add( new Apple() );
        appleCounter.add( new Apple() );
        appleCounter.add( new Apple() );

        box.addThingsToBox( new Apple() );
        box.addThingsToBox( "String" );
        box.addThingsToBox( 34 );

        System.out.println( appleCounter.getCount() );
        System.out.println( box.getCount() );

    }

    private static String  changeString(String str) {
        str += "fff";
        return str;
    }
}
