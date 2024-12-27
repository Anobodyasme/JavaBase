package org.designpattern.structural.decorator.demo;

// 装饰器基类
class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();  // 委托给被装饰对象
    }
}
