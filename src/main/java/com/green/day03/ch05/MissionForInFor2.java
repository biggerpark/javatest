package com.green.day03.ch05;

public class MissionForInFor2 {
    public static void main(String[] args) {
        /*
        중첩 for 문을 이용하여 구구단을 출력

         */

        int dan;
        int i;

        for(dan=1;dan<10;dan++){
            for(i=1;i<10;i++){
                System.out.printf("%d X %d = %d\t",i,dan,(dan*i)); //"\t"을 이용하여 가로로 출력을 반복하고
            }
            System.out.println(); //개행을 하여 또 가로로 출력을 반복하는 것.
        }
    }
}
