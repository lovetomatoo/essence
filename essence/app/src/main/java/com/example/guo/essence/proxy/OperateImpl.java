package com.example.guo.essence.proxy;

/**
 * Created by guo on 2017/9/20.
 */

public class OperateImpl implements Operate {

    @Override
    public void method1() {
        System.out.println("Invoke operateMethod1");
        sleep(110);
    }

    @Override
    public void method2() {
        System.out.println("Invoke operateMethod1");
        sleep(110);
    }

    @Override
    public void method3() {
        System.out.println("Invoke operateMethod1");
        sleep(110);
    }

    private static void sleep(long millSeconds) {
        try {
            Thread.sleep(millSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }}
