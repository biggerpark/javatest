package com.green.day10.ch13;

import com.green.day01.ch01.SystemOutPrintln;

//Two Dimension Array 2차원 배열
public class TwoDimenArray {
    public static void main(String[] args) {
        //⭕2차원 배열⭕
        int[][]arr=new int[3][5];//2차원, 배열 안에 배열이 있는것,arr 의 각 방의 타입은 int[] 이다.
        //arr 과 arr3 가 같다.5개의 공간을 가지는 배열을 3개를 가진 배열
        //arr,arr3의 각 방의 타입은 int[] (int 1차원 배열) 이다.
        int[][]arr3={
                {0,0,7,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };

        System.out.println("arr.length:"+arr.length);
        System.out.println("arr3.length:"+arr3.length);

        //Q1) tmp1 은 무슨 타입일까-배열의 주소값 타입
        //Q2) Sout 에서 7을 찍어보자
        int[] tmp1=arr3[0];
        System.out.println("tmp1[2]:"+tmp1[2]);
        System.out.println("arr3[0][2]:"+arr3[0][2]);//위의 식과 동일하다.


        int n=1;
        for(int i=0;i<arr.length;i++){
            for(int i2=0;i2<arr[0].length;i2++){
                arr[i][i2]=n++;
            }
        }
        System.out.println("-----------");



        for(int i=0;i<arr.length;i++) {
            for (int i2 = 0; i2 < arr[0].length; i2++) {
                System.out.printf("%d, ",arr[i][i2]);
            }
            System.out.println();
        }
    }








        //⭕3차원 배열⭕
        int[][][]arr2=new int[3][5][2];//3차원
        //arr2의 각 방의 타입은 int[][](int 2차원 배열)이다.






}
