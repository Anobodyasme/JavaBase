package org.designpattern.structural.decorator.demo_a;

// 测试代码
public class Main {
    public static void main(String[] args) {
        // 创建被装饰的组件
        MyInterface component = new ConcreteComponent();

        // 添加第一个装饰器（Logging）
        MyInterface loggingDecorator = new LoggingDecorator(component);

        // 添加第二个装饰器（Timing），嵌套调用
        MyInterface timingDecorator = new TimingDecorator(loggingDecorator);

        // 执行最终装饰后的方法
        timingDecorator.someMethod();
    }
}
