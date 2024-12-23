package org.designpattern.creationnal.factory._abstract;

// 抽象产品接口
interface CPU {
    void process();
}

interface GPU {
    void render();
}

// 产品实现类
class IntelCPU implements CPU {
    @Override
    public void process() {
        System.out.println("Processing with Intel CPU");
    }
}

class AMDGPU implements GPU {
    @Override
    public void render() {
        System.out.println("Rendering with AMD GPU");
    }
}

// 抽象工厂接口
interface ComputerFactory {
    CPU createCPU();
    GPU createGPU();
}

// 工厂实现类
class GamingComputerFactory implements ComputerFactory {
    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public GPU createGPU() {
        return new AMDGPU();
    }
}

// 客户端代码
public class Main {
    public static void main(String[] args) {
        ComputerFactory factory = new GamingComputerFactory();
        CPU cpu = factory.createCPU();
        GPU gpu = factory.createGPU();

        cpu.process();
        gpu.render();
    }
}
