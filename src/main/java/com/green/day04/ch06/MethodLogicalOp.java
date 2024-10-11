package com.green.day04.ch06;

public class MethodLogicalOp {
    public static void main(String[] args) {
        int n1=101;
        int n2=20;
        boolean b=logicalOp1(n1);// 값이 1 이상 100이하라면 true, 아니라면 false
        System.out.println(b);
        boolean b2=logicalOp2(n2); // 2의 배수이거나 3의 배수면 true 아니면 false
        System.out.println(b2);
    }

     static boolean logicalOp1(int n1){
        return (n1>=1)&&(n1<=100);
    }

    static boolean logicalOp2(int n2){
        return ((n2%2==0)||(n2%3==0));
    }



}
