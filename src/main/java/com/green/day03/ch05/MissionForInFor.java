package com.green.day03.ch05;

public class MissionForInFor {
    public static void main(String[] args) {
        /*
         중첩 for 문을 이용하여 구구단을 출력
         */

    int n;
    int i;

    for(i=1;i<10;i++){
        for(n=1;n<10;n++){
            System.out.printf("%d X %d : %d\n",i,n,(i*n));
        }
        System.out.println();
    }
    }
}
