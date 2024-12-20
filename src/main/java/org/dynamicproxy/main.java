package org.dynamicproxy;

import java.lang.reflect.Proxy;
import java.util.Map;

public class main {
    public static void main(String args[]){
        StarImplement ikun = new StarImplement("Ikun");

         /*
         @Param1:获取代理目标实例的加载器
         @Param2:获取代理目标的接口类
         @Param3:代理方法调用处理器，用于实现代理接口操作
         */
         Star o = (Star)Proxy.newProxyInstance(
                ikun.getClass().getClassLoader(),
                new Class<?>[]{Star.class},
                new StarInvocationHandler(ikun)
        );
        o.sing();
    }
}
