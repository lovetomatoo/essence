package com.example.guo.essence.proxy;

import android.util.Log;

/**
 * Created by guo on 2017/9/20.
 * <p>
 * 一个男孩   女孩的男朋友
 * <p>
 * 委托类（被代理类）
 * <p>
 * 委托女朋友把礼物和钱送给丈母娘
 */

public class ABoy implements IPerson {

    //送礼
    @Override
    public void giveGift() {
        Log.i("guohongxin", "送礼物");
    }

    //送钱
    @Override
    public void giveMoney() {
        Log.i("guohongxin", "送钱");
    }

    //房产证
    public void houseProperty() {
        Log.i("guohongxin", "送房子");
    }
}
