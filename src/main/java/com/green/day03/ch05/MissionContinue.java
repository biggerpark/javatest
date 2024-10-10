package com.green.day03.ch05;

public class MissionContinue {
    public static void main(String[] args) {
        /*
        ContinueBasic class 의 while 문을 for문으로 변경해보자

        int n=0;
        int count=0;

        while(n++<100){
            if((n%5!=0)||(n%7!=0)){
                continue; // continue를 만나면 밑의 코드는 실행되지 않고 while 의 반복문 조건으로 바로 올라간다.
            }count++;
        System.out.println("n:" + n);
        }

        System.out.println("count:" + count);
         */


        int count=0;

        int n;

        for(n=1;n<100;n++){
            if((n%5!=0)||(n%7!=0)){
                continue;
            }count++;
        System.out.println("n:"+n);
        }

        System.out.println("count: "+ count);



    }
}
