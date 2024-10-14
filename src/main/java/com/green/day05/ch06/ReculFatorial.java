package com.green.day05.ch06;

public class ReculFatorial {
    public static void main(String[] args) {
        //5!=5x4x3x2x1
        //6!=6x5x4x3x2x1
        //이런 식을 계산(얼마나 반복해야하는지 모를때)할때 재귀호출이 유용하다
        //이 재귀호출을 알려면 Stack 메모리에 대해 알아야한다.
        System.out.println(factorial(6));
        System.out.println(factorial(5));
        System.out.println(factorial(4));
        System.out.println(factorial(3));
        System.out.println(factorial(2));
    }
    static int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1); // 자기가 자신의 method 를 호출하므로 재귀호출이라 한다.
        }
    }
}
