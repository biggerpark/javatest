package com.green.day27.ioc;

import com.green.day27.*;

public class TvFactory {
    //SingleTon 패턴, 싱글톤 패턴
    // 객체는 딱 하나만 만들어서 돌려쓴다. 라는 개념

    private static TvFactory tvFactory;

    //객체생성이 한번만 이루어지도록 한것. 왜냐하면 멤버필드가 static으로 되어있으므로 처음에 null일때 한번 만들어지고, 계속 같은 주소값으로 리턴시킨다.
    public static TvFactory getInstance(){
        if(tvFactory==null){
            tvFactory=new TvFactory();
        }
        return tvFactory;
    }

    //생성자에 private을 달면 더이상 객체를 만들지 않겠다는 의미
    private TvFactory(){

    }

    public Tv factory(String tvName,String speakerName,String wooferName){
        Woofer woofer=switch (wooferName){
            case "hanil"->new HanilWoofer();
            case "marten"->new MartenWoofer();
            default -> null;
        };

        Speaker speaker=switch (speakerName){
            case "boss"->new BossSpeaker(woofer);
            case "genelec"->new GenericSpeaker(woofer);
            default -> null;
        };

        return switch (tvName){
            case "lg"->new LgTv(speaker);
            default -> null;
        };
    }
}
