package com.green.day13.bbaekjjun;

import java.util.Scanner;

public class StarJJIK {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >");
        int number=scan.nextInt();


        System.out.println("number:"+number);

        int number2=number*2;



        for(int i=0;i<number;i++){
            for(int z=0;z<number+1;z++){
                if(z>=number-i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            for(int z=number2;z>0;z--){
                if(z<number2-i){
                    System.out.print(" ");
                }else if(z>=number2-i+1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=number;i>1;i--){
            for(int z=0;z<number+1;z++){
                if(z>number-i+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            for(int z=number2-2;z>0;z--){
                if(z>number2-i){
                    System.out.print("*");
                }else if(z<=number2-i+1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}