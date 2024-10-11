package com.green.day04.ch05;

public class MissionForInFor4 {
    public static void main(String[] args) {
        /*
         Q)
         int star=(int)(Math.random()*6.0)+3; // 3~8 사이의 랜덤숫자
         star=3
         *
         **
         ***

         star=4
         *
         **
         ***
         ****

         이렇게 찍히도록 해라.
         */

        int star= (int)(Math.random()*6.0)+3; // 3~8 사이의 랜덤숫자

        System.out.println("star:"+star);

        String sta="*";

        int i;
        int j;


        for(i=0;i<star;i++){
            for(j=0;j<=i;j++) { // 열이 바뀔때마다 그 열의 수 만큼 별이 찍힌다.
                System.out.print(sta);
            }System.out.println();
        }




        }
    }

