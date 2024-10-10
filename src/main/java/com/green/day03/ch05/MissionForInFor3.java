package com.green.day03.ch05;

public class MissionForInFor3 {
    public static void main(String[] args) {
        int star=(int)(Math.random()*6.0)+3; // 3~8 사이의 랜덤숫자



        System.out.println(star);

        String st="*";



        for(int i=0;i<star;i++){
            for(int n=0;n<star;n++){
                System.out.print(st);
            }
            System.out.println();
        }



        //for문 하나로 줄여본것.
        int len=star*star;

        for(int i=0;i<=len;i++) {
            System.out.print(st);
            if (i % star == 0) {
                System.out.println();
            }
        }

    }
}
