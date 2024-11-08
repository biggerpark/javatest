package com.green.day27.noneioc;

import com.green.day27.*;

public class SamsungTv implements Tv {
    private Speaker speaker;

    public SamsungTv(){
        this.speaker=new HarmanSpeaker();
    }


    @Override
    public void sound() {
        System.out.println("Samsung TV:소리가 난다");
        speaker.speakerSound();
    }
}
