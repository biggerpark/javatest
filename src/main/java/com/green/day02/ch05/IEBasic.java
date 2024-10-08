package com.green.day02.ch05;

public class IEBasic {
    public static void main(String[] args) {
        int n1=5, n2=7;

        if(n1<n2){
            System.out.printf("%d<%d is %b\n",n1,n2,n1<n2);
        }
        if(n1>n2){
            System.out.printf("%d>%d is %b\n",n1,n2,(n1>n2));
        }
        //if-else 문은 둘 중 하나만 실행이 된다.
        //if의 조건이 false 이면 else 가 실행이 된다.

        if(n1==n2){
            System.out.printf("%d==%dis true\n",n1,n2);
        }else{
            System.out.printf("%d==%d is false\n",n1,n2);
        }
        System.out.println("----끝----");
    }
}
