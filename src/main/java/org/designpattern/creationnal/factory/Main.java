package org.designpattern.creationnal.factory;

// 日志接口
interface Logger {
    void log(String message);
}

// 具体实现类
class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("Console: " + message);
    }
}

class FileLogger implements Logger {
    public void log(String message) {
        System.out.println("File: " + message);
    }
}

// 工厂类
class LoggerFactory {
    public static Logger getLogger(String type) {
        if ("console".equalsIgnoreCase(type)) {
            return new ConsoleLogger();
        } else if ("file".equalsIgnoreCase(type)) {
            return new FileLogger();
        } else {
            throw new IllegalArgumentException("Unknown logger type");
        }
    }
}

// 客户端
public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("console");
        logger.log("This is a console log.");

        Logger fileLogger = LoggerFactory.getLogger("file");
        fileLogger.log("This is a file log.");
    }
}
