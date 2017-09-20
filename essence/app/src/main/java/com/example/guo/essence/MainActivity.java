package com.example.guo.essence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.guo.essence.proxy.ABoy;
import com.example.guo.essence.proxy.AGirl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AGirl aGirl = new AGirl(new ABoy());
        aGirl.giveGift();
        aGirl.giveMoney();
    }
}
