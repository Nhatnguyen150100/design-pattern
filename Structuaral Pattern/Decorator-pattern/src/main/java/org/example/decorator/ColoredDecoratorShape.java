package org.example.decorator;

import org.example.entity.Shape;

public class ColoredDecoratorShape extends ShapeDecorator{
    private String color;

    public ColoredDecoratorShape(Shape decoratorShape, String color) {
        super(decoratorShape);
        this.color = color;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Màu sắc: " + color);
    }
}
