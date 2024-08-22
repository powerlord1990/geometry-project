package com.company;

public interface Shape {
    double calculateArea();
    double calculatePerimeter();

    default void sayHello(){
        System.out.println("HELLO");
    }
}