package org.callbackfunc.byanonymousclass;

// 定义一个回调接口
interface TaskCallback {
    void onTaskCompleted(String result);
}

// 任务执行类
class TaskExecutor {
    public void executeTask(TaskCallback callback) {
        // 模拟任务执行
        System.out.println("Executing task...");
        
        // 任务完成后调用回调方法
        callback.onTaskCompleted("Task completed successfully!");
    }
}

public class Main {
    public static void main(String[] args) {
        TaskExecutor executor = new TaskExecutor();
        
        // 创建一个回调实例并传递给 executeTask 方法
        executor.executeTask(new TaskCallback() {

            public void onTaskCompleted(String result) {
                System.out.println("Callback received: " + result);
            }
        });
    }
}
