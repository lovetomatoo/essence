package com.example.guo.essence.proxy;

/**
 * Created by guo on 2017/9/20.
 *
 * 一个女孩  男孩的男朋友
 *
 * 代理类
 */

public class AGirl {

    private ABoy aBoy;

    public AGirl(ABoy aBoy) {
        this.aBoy = aBoy;
    }

    //送礼
    public void giveGift() {
        aBoy.giveGift();
    }

    //送钱
    public void giveMoney() {
        aBoy.giveMoney();
    }

    //not export houseProperty()
}
