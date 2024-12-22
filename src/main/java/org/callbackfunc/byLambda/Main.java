package org.callbackfunc.byLambda;

// 定义回调接口
interface Callback {
    void onEvent(String message);
}

// 实现接口的类
class MyCallback implements Callback {
    @Override
    public void onEvent(String message) {
        System.out.println("Callback received: " + message);
    }
}

// 使用回调函数的类
class MyClass {
    public void doSomething(Callback callback) {
        // 执行某些任务
        System.out.println("Doing something...");

        // 调用回调函数
        callback.onEvent("Task completed!");
    }
}

// 测试回调
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // 使用 Lambda 表达式实现回调
        myClass.doSomething(message -> System.out.println("Callback received: " + message));
    }
}

