package com.laptop.stuff;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Electric electricGuitar = new Electric("Black", 450);
        Electric electricGuitar2 = new Electric("Blue", 199.99);
        Acoustic acoustic = new Acoustic("Brown", 399.99);
        Bass bass = new Bass("Red", 699.59);

        System.out.println("*******************************");
        System.out.println(electricGuitar.takeOut());
        System.out.println(electricGuitar.play());
        System.out.println(electricGuitar.clean());
        System.out.println(electricGuitar.putAway());
        System.out.println("*******************************");
        System.out.println(electricGuitar2.takeOut());
        System.out.println(electricGuitar2.play());
        System.out.println(electricGuitar2.clean());
        System.out.println(electricGuitar2.putAway());
        System.out.println("*******************************");
        System.out.println(acoustic.takeOut());
        System.out.println(acoustic.play());
        System.out.println(acoustic.clean());
        System.out.println(acoustic.putAway());
        System.out.println("*******************************");
        System.out.println(bass.takeOut());
        System.out.println(bass.play());
        System.out.println(bass.clean());
        System.out.println(bass.putAway());
        System.out.println(bass.wreckIt(bass.getCost()));
    }
}
