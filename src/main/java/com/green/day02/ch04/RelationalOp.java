package com.green.day02.ch04;

public class RelationalOp {
    public static void main(String[] args) {
        /*
        관계연산자
        관계연산자는 boolen type 이다.
         */

        int n1=3, n2=2, n3=7;

        float n4=7.0f;
        //리터럴 실수는 double 타입이기 때문에 float 타입의 실수를 사용하고 싶으면 끝에 f,F를 붙여주어야 한다.

        double n5=7.0;
        double n6=7.0f;//7.0f는 float type 이지만 double 로 자동형변환이 된다.
        //아래 n4,n7은 자동 형변환이 되지 않는다.(float 이 double 보다 더 작기 때문에)
        //대신 명시적 형변환(강제 형변환)은 가능하다.
        //float n4=7.0d;
        //float n7=n5;
        //리터럴 상수 뒤에 d,D를 붙여도 상관없다. 7.0,7.0d, 7.0D 전부 doubel type 이다.

        System.out.printf("%d>=%d: %b\n",n1,n2,n1>=n2);
        System.out.printf("%d<=%d: %b\n",n1,n2,n1<=n2);
        System.out.printf("%f<=%f: %b\n",n5,n6,n5<=n6);
        System.out.printf("%f>=%f: %b\n",n5,n6,n5>=n6);
        System.out.printf("%f==%d: %b\n",n5,n2,n5==n2);


    }
}
