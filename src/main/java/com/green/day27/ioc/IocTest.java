package com.green.day27.ioc;

import com.green.day27.MartenWoofer;
import com.green.day27.Speaker;
import com.green.day27.Tv;
import com.green.day27.Woofer;

public class IocTest {
    public static void main(String[] args) {

        Woofer woofer=new MartenWoofer();
        Speaker speaker=new BossSpeaker(woofer);
        Tv tv=new LgTv(speaker);

        tv.sound();


    }
}
