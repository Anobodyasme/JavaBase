package org.designpattern.creationnal.factory.method;

// 产品接口
interface Product {
    void use();
}

// 产品实现类
class ProductA implements Product {
    @Override
    public void use() {
        System.out.println("Using Product A");
    }
}

class ProductB implements Product {
    @Override
    public void use() {
        System.out.println("Using Product B");
    }
}

// 抽象工厂接口
interface ProductFactory {
    Product createProduct();
}

// 工厂实现类
class ProductAFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

class ProductBFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}

// 客户端代码
public class Main {
    public static void main(String[] args) {
        ProductFactory factoryA = new ProductAFactory();
        Product productA = factoryA.createProduct();
        productA.use();

        ProductFactory factoryB = new ProductBFactory();
        Product productB = factoryB.createProduct();
        productB.use();
    }
}
