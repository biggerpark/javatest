package com.green.day05.ch06;

public class Mission06_2_1 {
    /*
    인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산하여 반환하는 메소드와
    원의 둘레를 계산하여 반환하는 메소드를 각각 정의하고
    이 둘을 호출하는 메인 메소드를 정의하자.
     */

    public static void main(String[] args) {
        double r;
        r=(Math.random()*10.0)+1;

        System.out.println(r);

        double i=circleOp(r);
        double n=circlesOp(r);
        System.out.printf("원의 둘레: %.1f\n",i);
        System.out.printf("원의 넓이: %.1f\n",n);
    }

    static double circleOp(double r){
        return 3.14*2.0*r;
    }
    static double circlesOp(double r){
        return 3.14*r*r;
    }
}
