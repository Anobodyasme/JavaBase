package org.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarInvocationHandler implements InvocationHandler {
    private Star star;
    public StarInvocationHandler(Star star){
        this.star=star;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Preparatory ...");
        method.invoke(star,args);
        return null;
    }
}
