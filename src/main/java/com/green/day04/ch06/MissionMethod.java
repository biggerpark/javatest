package com.green.day04.ch06;

import com.sun.security.jgss.GSSUtil;

public class MissionMethod {
    public static void main(String[] args) {


        printStar(9);


        printStar(8); //***** 출력
        printStar(4); // ** 출력
        System.out.println("------------");
        printStarSquare(4);
        printStarTriangle(4);

    }

    static void printStar(int i){
//        System.out.printf("star: %d\t",i);
        for(int n=0;n<i;n++){
            System.out.print("*");
        }
        System.out.println();
    }

    static void printStarSquare(int i){
        for(int n=0;n<i;n++){
//            for(int z=0;z<i;z++){
//                System.out.print("*");
//            } 이렇게 써야 하는 코드를 만들어놓은 메소드 printStar 를 이용하여 간소화할 수 있다.
            printStar(i);
            System.out.println();
        }
    }

    static void printStarTriangle(int i){
        for(int n=1;n<=i;n++){
//            for(int z=0;z<n;z++){
//                System.out.print("*");
//            }
            printStar(n);
            System.out.println();
        }
    }
}
