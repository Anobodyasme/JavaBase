package org.designpattern.structural.decorator.demo_a;

// 子类装饰器1
public class LoggingDecorator extends AbstractDecorator {
    public LoggingDecorator(MyInterface decoratedComponent) {
        super(decoratedComponent);
    }

    @Override
    public void someMethod() {
        System.out.println("LoggingDecorator: Before method execution");
        super.someMethod();
        System.out.println("LoggingDecorator: After method execution");
    }
}
