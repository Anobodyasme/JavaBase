package org.designpattern.structural.decorator.demo;

// 添加边框的装饰器
class BorderDecorator extends ShapeDecorator {

    public BorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();  // 委托给原始对象
        addBorder();
    }

    private void addBorder() {
        System.out.println("Adding border to the shape");
    }
}

// 添加颜色的装饰器

