package com.company;

public class Cube implements Shape3d {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    public double calculateSurfaceArea() {

        return 6 * side * side;
    }
}
