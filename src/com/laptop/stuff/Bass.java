package com.laptop.stuff;

public class Bass extends Guitar implements Boomable{

    private double cost;

    public Bass(String color, double cost) {
        super(color, cost);
    }

    @Override
    public String clean() {
        return super.clean();
    }

    @Override
    public String play() {
        return "Thump Thump Booooooooooooom";
    }

    @Override
    public String putAway() {
        return "Put the " + getColor() + " Bass away";
    }

    @Override
    public String takeOut() {
        return "Grab the thick strings";
    }

    @Override
    public String wreckIt(double cost) {
        this.cost = cost;
        return "Bustin out $" + cost + " worth of rumbling wreckage";
    }
}
