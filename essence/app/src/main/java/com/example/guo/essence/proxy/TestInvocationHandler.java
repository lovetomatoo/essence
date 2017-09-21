package com.example.guo.essence.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by guo on 2017/9/20.
 *
 * InvocationHandler 负责连接代理类和委托类的中间类必须实现的接口
 */

public class TestInvocationHandler implements InvocationHandler {

    //委托类对象
    private Object target;

    public TestInvocationHandler() {
    }

    public TestInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        Object invoke = method.invoke(target, args);
        System.out.println(method.getName() + " cost time is:" + (System.currentTimeMillis() - start));
        return invoke;
    }
}
