package org.designpattern.structural.decorator.demo_a;

// 子类装饰器2
public class TimingDecorator extends AbstractDecorator {
    public TimingDecorator(MyInterface decoratedComponent) {
        super(decoratedComponent);
    }

    @Override
    public void someMethod() {
        long startTime = System.currentTimeMillis();
        System.out.println("TimingDecorator: Start timing");
        super.someMethod();
        long endTime = System.currentTimeMillis();
        System.out.println("TimingDecorator: Execution time = " + (endTime - startTime) + "ms");
    }
}
