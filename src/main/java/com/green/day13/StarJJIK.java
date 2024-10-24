package com.green.day13;

import java.util.Scanner;

public class StarJJIK {
    public static void main(String[] args) {
        String star="*";

        Scanner scan=new Scanner(System.in);

        int number=scan.nextInt();

        for(int i=number-1;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            System.out.print(star);
        }
        for(int i=0;i<number;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print(star);
        }




    }

}
