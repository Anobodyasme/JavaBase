package org.designpattern.structural.decorator.demo;

class ColorDecorator extends ShapeDecorator {

    public ColorDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        addColor();
    }

    private void addColor() {
        System.out.println("Adding color to the shape");
    }
}