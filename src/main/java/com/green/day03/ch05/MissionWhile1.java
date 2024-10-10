package com.green.day03.ch05;

public class MissionWhile1 {
    public static void main(String[] args) {
        /*
        while문을 활용하여 1~99까지의 합을 구하는 프로그램 작성
         */
        int n=0;
        int sum=0;

        while(n<100){
            sum=sum+(++n);
            // sum+=n++ ;//도 가능
        }
        System.out.println(n);
        System.out.println("sum :"+sum);
    }
}
