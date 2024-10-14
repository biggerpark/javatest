package com.green.day05.ch06;

public class MethodReturns {
    public static void main(String[] args) {
        int result;
        result=adder(4,5);
        System.out.println(result);
        System.out.printf("%d + %d = %d\n",4,5,result);
        System.out.printf("%.2f x %.2f = %.1f\n",3.5,3.5,square(3.5)); // 3.5는 double 타입이다. float 타입으로 해주고 싶으면 3.5f 로 해준다.
    }

    static int adder(int i, int n){
//        int r=i+n;
//        return r;
        return i+n;
    }

    static double square(double i){
        return i*i;
    }
}
