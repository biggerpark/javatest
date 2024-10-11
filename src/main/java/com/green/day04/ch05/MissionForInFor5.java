package com.green.day04.ch05;

public class MissionForInFor5 {
    public static void main(String[] args) {
          /*
         Q)
         int star=(int)(Math.random()*6.0)+3; // 3~8 사이의 랜덤숫자
         star=3
         __*
         _**
         ***

         star=4
         ___*
         __**
         _***
         ****

         이렇게 찍히도록 해라.
         */

        int i;

        int star = (int) (Math.random() * 6.0) + 3;

        int z;

        System.out.println(star);

        String line = "_";
        String sta = "*";


        //for 문을 한개 쓰고 해결

        for (i = star; i > 0; i--) {
            for (z = 1; z <= star; z++) {
                System.out.print(z < i ? line : sta);
            }
            System.out.println();
        }

        //for 문을 2개 쓰고 해결해보라

        for(i=0;i<star;i++){
            for(z=star;z>i;z--){
                System.out.print(line);
            }for(z=0;z<i;z++){
                System.out.print(sta);
            }
            System.out.println();
        }






    }
}


















