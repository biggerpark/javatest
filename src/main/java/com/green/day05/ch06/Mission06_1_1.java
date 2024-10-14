package com.green.day05.ch06;

public class Mission06_1_1 {
    public static void main(String[] args) {
        calc(10,3);
        /*
        10+3=13
        10-3=7
        10/3=3.3333
        10*3=30
        10%3=1
         */
    }
    static void calc(int i,int n){
        System.out.printf("%d + %d  =%d\n",i,n,i+n);
        System.out.printf("%d - %d  =%d\n",i,n,i-n);
        System.out.printf("%d / %d  =%.4f\n",i,n,(float)i/n);
        System.out.printf("%d * %d  =%d\n",i,n,i*n);
        System.out.printf("%d %% %d =%d\n",i,n,i%n);
    }
}
