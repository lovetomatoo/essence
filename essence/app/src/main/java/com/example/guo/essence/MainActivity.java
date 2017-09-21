package com.example.guo.essence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.guo.essence.proxy.ABoy;
import com.example.guo.essence.proxy.AGirl;
import com.example.guo.essence.proxy.Operate;
import com.example.guo.essence.proxy.OperateImpl;
import com.example.guo.essence.proxy.TestInvocationHandler;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        AGirl aGirl = new AGirl(new ABoy());
//        aGirl.giveGift();
//        aGirl.giveMoney();

        TestInvocationHandler testInvocationHandler = new TestInvocationHandler(new OperateImpl());
        Operate operate = (Operate) Proxy.newProxyInstance(Operate.class.getClassLoader(), new Class[]{Operate.class}, testInvocationHandler);

        operate.method1();
        operate.method2();
        operate.method3();
    }
}
