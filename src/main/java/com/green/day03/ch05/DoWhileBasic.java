package com.green.day03.ch05;

public class DoWhileBasic {
    public static void main(String[] args) {
        /*
        while문은 ()의 결과가 true인지 체크 먼저 한다.
        체크 후에 true면 반복 시작

        do-while문은 do {} 안의 반복문을 실행 1번 먼저 하고 while ()의 결과가 true 인지 체크한다.
        체크후에 true면 반복문 시작
         */


        int n=0;

        do{
            System.out.println("I like Java"+(n++));} while(n<5);

        System.out.println("--끝--");

    }
}
