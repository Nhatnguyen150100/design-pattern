package org.example.decorator;

import org.example.entity.Shape;

public class BorderDecoratorShape extends ShapeDecorator{
    private int borderWidth;

    public BorderDecoratorShape(Shape decoratorShape, int borderWidth) {
        super(decoratorShape);
        this.borderWidth = borderWidth;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Độ dày đường viền: " + borderWidth);
    }
}
