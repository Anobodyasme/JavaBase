package org.designpattern.creationnal.builder;
/**/
// 产品类
class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int Storage;

    // 私有化构造器
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM=" + RAM +
                " GB, Storage=" + Storage + " GB}";
    }

    // 静态内部类：Builder
    public static class Builder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int Storage;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int Storage) {
            this.Storage = Storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

// 使用 Builder 模式创建对象
public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setGPU("NVIDIA RTX 4090")
                .setRAM(32)
                .setStorage(2000)
                .build();

        System.out.println(myComputer);
    }
}

