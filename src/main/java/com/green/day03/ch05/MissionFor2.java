package com.green.day03.ch05;

public class MissionFor2 {
    public static void main(String[] args) {
        /*
        구구단을 랜덤으로 출력하는 프로그램을 for 문을 이용해서 작성
         */


        int n; //자료형 정수 type 변수 선언

        while(true){ // 무한루프 생성
            n=(int)(Math.random()*11);
            if(n==9){
                break;
            }
            for(int i=1;i<10;i++){
            System.out.printf("%d * %d= %d\n",n,i,(n*i));
            }
        }
        System.out.println(n);
    }
}
