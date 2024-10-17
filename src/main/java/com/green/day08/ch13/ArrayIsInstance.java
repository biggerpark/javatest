package com.green.day08.ch13;

public class ArrayIsInstance {
    public static void main(String[] args) {
        //길이가 5인 int 형 1차원 배열의 생성
        int[] ar1=new int[5];

        //길이가 7인 double 형 1차원 배열의 생성
        double[] ar2=new double[7];

        float[] ar3; //배열변수 선언
        ar3=new float[8];// 배열변수 공간의 수 초기화
        float[] ar4=new float[8];// 이렇게 합칠 수 있다



        //각 배열의 길이값을 출력
        System.out.printf("ar1.length: %d\n",ar1.length);
        System.out.printf("ar2.length: %d\n",ar2.length);
        System.out.printf("ar3.length: %d\n",ar3.length);



    }
}
