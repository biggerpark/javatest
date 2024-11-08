package com.green.day27.ioc;

import com.green.day27.Speaker;
import com.green.day27.Woofer;
import com.green.day27.noneioc.SamsungTv;

public class BossSpeaker implements Speaker {
    private Woofer woofer;


    public BossSpeaker(Woofer woofer){
        this.woofer=woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("Boss Speaker: 소리가 짱짱하다");
        woofer.baseSound();
    }
}
