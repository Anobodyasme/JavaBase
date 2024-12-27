package org.designpattern.structural.decorator.demo;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();  // 基本的圆形

        Shape redCircle = new ColorDecorator(new Circle());  // 给圆形添加颜色
        Shape redCircleWithBorder = new BorderDecorator(new ColorDecorator(new Circle()));  // 给圆形添加颜色和边框

        System.out.println("Normal Circle:");
        circle.draw();

        System.out.println("\nCircle with Red Color:");
        redCircle.draw();

        System.out.println("\nCircle with Red Color and Border:");
        redCircleWithBorder.draw();
    }
}
