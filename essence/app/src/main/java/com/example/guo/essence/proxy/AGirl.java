package com.example.guo.essence.proxy;

import android.util.Log;

/**
 * Created by guo on 2017/9/20.
 *
 * 一个女孩  男孩的男朋友
 *
 * 代理类
 */

public class AGirl implements IPerson  {

    private IPerson aBoy;

    public AGirl(IPerson aBoy) {
        this.aBoy = aBoy;
    }

    //送礼
    @Override
    public void giveGift() {
        speakSugaredWords();
        aBoy.giveGift();
    }

    //送钱
    @Override
    public void giveMoney() {
        speakSugaredWords();
        aBoy.giveMoney();
    }

    private void speakSugaredWords() {
        Log.i("guohongxin", "说甜言蜜语");
    }

    //not export houseProperty()
}
