package com.company;

public class Main {

    public static void main(String[] args) {

        Bird birdA = new Bird("Pasha", 5, new Location("Bishkek"));

        Parrot parrotB = new Parrot("Billy", 2, new Location("LA"), Color.YELLOW);

        Parrot parrotC = new Parrot("Eva", 1, new Location("Barcelona"), Color.WHITE);

        System.out.println(birdA.getInfo());
        System.out.println(parrotB.getInfo());
        System.out.println(parrotC.getInfo());
        birdA.greeting();
        birdA.greeting("Hi");
        parrotB.greeting();
        parrotC.greeting("Hola");


    }
}
