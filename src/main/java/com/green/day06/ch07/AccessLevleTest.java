package com.green.day06.ch07;

// import com.green.day06.ch09.Circle2;
import com.green.day06.ch09.InfoHideCircle;

public class AccessLevleTest {
    public static void main(String[] args) {
        InfoHideCircle ihc=new InfoHideCircle(); // InfoHideCircle class 는 public 이므로 패키지가 달라도 import 를 통해 불러올 수 있다.

        //Circle2 cir=new Circle2()// Circle2 class 는 public 이 아니고 default 이므로 다른 package 에서 import 가 되지 않는다.

        String str="String 은 워낙 자주 사용하기 때문에 자동으로 import가 된다.";
    }
}
