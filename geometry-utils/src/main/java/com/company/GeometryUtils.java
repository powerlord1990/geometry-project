package com.company;

public class GeometryUtils {

    public static double convertToSquareMeters(double area, String unit) {
        switch (unit) {
            case "cm":
                return area / 10000;
            case "m":
            default:
                return area;
        }
    }

    public static int compareAreas(Shape shape1, Shape shape2) {
        return Double.compare(shape1.calculateArea(), shape2.calculateArea());
    }
}
