package org.example;

import org.example.decorator.BorderDecoratorShape;
import org.example.decorator.ColoredDecoratorShape;
import org.example.entity.Circle;
import org.example.entity.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new ColoredDecoratorShape(circle, "red");
        Shape borderCircle = new BorderDecoratorShape(circle, 15);

        redCircle.draw();
        borderCircle.draw();
    }
}