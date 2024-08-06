package org.example.entity;

public class Car {
    private static Car instance;

    public Car() {
    }

    public static Car getInstance() {
        if(instance == null) {
            instance = new Car();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Car{}";
    }
}
