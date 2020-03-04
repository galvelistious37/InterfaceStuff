package com.laptop.stuff;

public class Electric extends Guitar {

    public Electric(String color, double cost) {
        super(color, cost);
    }

    @Override
    public String play() {
        String text = "waka-chicka-waka-chicka-waka...";
        return text;
    }

    @Override
    public String putAway() {
        String text = "Gently put away the $"
                + getCost() + " guitar";
        return text;
    }

    @Override
    public String takeOut() {
        String text = "You grab the " + getColor()
                + " electric guitar";
        return text;
    }

    @Override
    public String clean() {
        return super.clean() + " ... Super fresh!";
    }
}
