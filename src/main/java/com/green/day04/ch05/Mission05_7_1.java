package com.green.day04.ch05;

public class Mission05_7_1 {
    public static void main(String[] args) {
        /*
        구구단의 짝수 단인 2,4,6, 8 단만 출력하는 프로그램 작성하되
        2단은 2X2 까지,
        4단은 4x4 까지,
        6단은 6x6 까지,
        8단은 8x8 까지,
         */

        int dan;
        int n;


        for(dan=2;dan<10;dan+=2){
            for(n=1;n<=dan;n++){
                System.out.printf("%d x %d = %d\n",dan,n,(n*dan));
                }
            }
            System.out.println("-------");
        }
    }
