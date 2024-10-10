package com.green.day03.ch05;

public class MissionFor1 {
    public static void main(String[] args) {
        /*
        1부터 10까지의 곱의 결과를 출력하는 프로그램을 for 문을 이용하여 작성
         */

        int multi=1;
        int sum=0;

        for(int i=1;i<11;i++){
            multi*=i;
            sum+=multi;
        }
        System.out.printf("1부터 10까지의 곱은 %,d 입니다\n",multi);
        System.out.printf("1부터 10까지의 곱의 합은 %,d 입니다",sum);
    }
}
