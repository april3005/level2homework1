package com.company;

final public class Parrot extends Bird {
    private Color color;

    public Color getColor() {
        return color;
    }


    public Parrot (String name, int age, Location location, Color color) {
        super(name, age, location);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + getColor();
    }
}
