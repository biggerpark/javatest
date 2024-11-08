package com.green.day27;

import com.green.day27.ioc.TvFactory;
import com.green.day27.noneioc.HarmanSpeaker;
import com.green.day27.noneioc.SamsungTv;

public class Test {
    public static void main(String[] args) {
        HarmanSpeaker harmanSpeaker = new HarmanSpeaker();
        harmanSpeaker.speakerSound();

        System.out.println("--------------");
        Tv tv = new SamsungTv();
        tv.sound();
    }
}

class IocTest2 {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();
        TvFactory tvFactory2 = TvFactory.getInstance();
        TvFactory tvFactory3 = TvFactory.getInstance();

        System.out.println(tvFactory == tvFactory2);
        System.out.println(tvFactory2 == tvFactory3);
        System.out.println(tvFactory);
        System.out.println(tvFactory2);
        System.out.println(tvFactory3);

    }
}

class IocTest3{
    //이제 우리는 코드 수정없이 객체를 마음대로 바꿀 수 있다.
    //args에서
    public static void main(String[] args) {
        System.out.println("--IoC Test--");
        TvFactory tvFactory=TvFactory.getInstance();
        Tv tv=tvFactory.factory(args[0],args[1],args[2]);
        tv.sound();
    }
}
