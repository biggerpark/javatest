package com.green.day04.ch05;

public class Mission05_7_2 {
    public static void main(String[] args) {
        /*
        다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성

         A  B
        +B  A
        ------
         9  9
         */

        int i;
        int n;

        outer:

        for(i=0;i<=10;i++){
            for(n=0;n<=10;n++){
                if(n+i==9){
                    System.out.printf("%d  %d\n",i,n);
                    System.out.print("+\n");
                    System.out.printf("%d  %d\n",n,i);
                    System.out.println("-----");
                    System.out.println("9  9\n");
                }if(i==9){
                    break outer;
                }
            System.out.println("-----");

            }
        }
    }
}
