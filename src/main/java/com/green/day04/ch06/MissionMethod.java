package com.green.day04.ch06;

public class MissionMethod {
    public static void main(String[] args) {


        printStar(9);


        printStar(8); //***** 출력
        printStar(4); // ** 출력
    }

    static void printStar(int i){
        String sta="*";
        System.out.printf("star: %d\t",i);
        for(int n=0;n<i;n++){
            System.out.print(sta);
        }
        System.out.println();
    }
}
