package com.laptop.stuff;

public class Acoustic extends Guitar {

    public Acoustic(String color, double cost) {
        super(color, cost);
    }

    @Override
    public String clean() {
        return "Polish the acoustic guitar";
    }

    @Override
    public String play() {
        return "Pretty sounds";
    }

    @Override
    public String putAway() {
        return "Put the " + getColor() + " acoustic away";
    }

    @Override
    public String takeOut() {
        return "Grab the $" + getCost() + " acoustic";
    }
}
