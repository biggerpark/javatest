package com.green.day03.ch05;

public class MissionWhile2 {
    public static void main(String[] args) {
        /*
        1부터 100까지 출력,
        100~1까지 출력

        do~while,while 각 1번씩 사용하여 해결
         */

        int n=1;

        do{
            System.out.println(n);}while(n++<100);

        while(n>1){
            System.out.println(--n);
        }
    }
}
