package org.example;

import org.example.entity.Car;

public class Main {
    public static void main(String[] args) {
        Car newCar = Car.getInstance();
        System.out.println(newCar.toString());
    }
}