package com.company;

public class Main {

    public static void main(String[] args) {

//        Counter<Apple> appleCounter = new Counter<>();
//        Counter<Box> boxCounter = new Counter<>();
//        Counter<Cart> cartCounter = new Counter<>();

//        appleCounter.add( new Apple() );
//        appleCounter.add( new Apple() );
//        appleCounter.add( new Apple() );
//
//        Box<Apple> box1 = new Box<>();
//        Box<Apple> box2 = new Box<>();
//
//        boxCounter.add( new Box() );
//
//        box1.addThingsToBox( new Apple() );
//        box1.addThingsToBox( new Apple() );
//        box1.addThingsToBox( new Apple() );
//
//        box2.addThingsToBox( new Apple() );
//        box2.addThingsToBox( new Apple() );
//
//        Cart cart1 = new Cart();
//
//        cartCounter.add( cart1 );
//        cart1.addThingsToCart( box2 );
//
//        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 4, 3, 6);
//        System.out.println(numList);
//
//        System.out.println( cartCounter.getCount() );

        Counter counterApples = new Counter<Apple>(o -> true);
        Counter counterRedApples = new Counter<Apple>(o -> ((Apple) o).getColour().equals("red") );

        Box box = new Box<Apple>();
        box.addThingsToBox(new Apple("red"));
        box.addThingsToBox(new Apple("green"));
        box.addThingsToBox(new Apple("green"));
        box.addThingsToBox(new Apple("red"));
        box.addThingsToBox(new Apple("red"));
        box.addThingsToBox(new Apple("green"));

        counterRedApples.add(box);

        System.out.println(counterRedApples.getCount());

    }



}
