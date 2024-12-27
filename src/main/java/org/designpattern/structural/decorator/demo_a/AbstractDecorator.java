package org.designpattern.structural.decorator.demo_a;

// 抽象装饰器
public abstract class AbstractDecorator implements MyInterface {
    private final MyInterface decoratedComponent;

    public AbstractDecorator(MyInterface decoratedComponent) {
        if (decoratedComponent == null) {
            throw new IllegalArgumentException("Decorated component cannot be null");
        }
        this.decoratedComponent = decoratedComponent;
    }

    protected MyInterface getDecoratedComponent() {
        return this.decoratedComponent;
    }

    @Override
    public void someMethod() {
        decoratedComponent.someMethod();
    }
}
