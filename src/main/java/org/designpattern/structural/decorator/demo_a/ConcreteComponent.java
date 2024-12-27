package org.designpattern.structural.decorator.demo_a;

// 被装饰类
public class ConcreteComponent implements MyInterface {
    @Override
    public void someMethod() {
        System.out.println("ConcreteComponent: Original method logic");
    }
}
