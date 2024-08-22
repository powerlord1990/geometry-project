package com.company;

public class Main {
    public static void main(String[] args) {


        Shape triangle = new Triangle(5, 3, 4);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

        Shape rectangle = new Rectangle(5, 5);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}