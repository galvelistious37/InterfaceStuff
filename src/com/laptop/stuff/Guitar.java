package com.laptop.stuff;

public abstract class Guitar implements Hearable {
    private String color;
    private double cost;

    public Guitar(String color, double cost) {
        this.color = color;
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }

    public abstract String play();

    public String clean(){
        return "You're instrument is clean";
    }

    //    private final String GUITAR_SOUND = "BLawarrrr-riddelly-riddely-rawarrrr";
//
//    public String getColor() {
//        return color;
//    }
//
//    public double getCost() {
//        return cost;
//    }
//
//    @Override
//    public String makeSound() {
//        return GUITAR_SOUND;
//    }
//
//    @Override
//    public String putAway() {
//        String text = "You have put away the "
//                + getColor() + ", $" + getCost() + " guitar";
//        return text;
//    }
//
//    @Override
//    public String takeOut() {
//        String text = "Grab the "
//                + getColor() + ", $" + getCost() + " guitar";
//        return text;
//    }
//
//    @Override
//    public void clean() {
//        System.out.println("Purdy like");
//    }
}
