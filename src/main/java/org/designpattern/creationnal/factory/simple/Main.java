package org.designpattern.creationnal.factory.simple;

// 产品接口
interface Product {
    void use();
}

// 产品实现类
class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("Using Product A");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void use() {
        System.out.println("Using Product B");
    }
}

// 工厂类
class ProductFactory {
    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}

// 客户端代码
public class Main {
    public static void main(String[] args) {
        Product productA = ProductFactory.createProduct("A");
        productA.use();

        Product productB = ProductFactory.createProduct("B");
        productB.use();
    }
}
