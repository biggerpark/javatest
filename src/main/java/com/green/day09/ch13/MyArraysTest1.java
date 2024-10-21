package com.green.day09.ch13;

import java.util.Arrays;

public class MyArraysTest1 {
    public static void main(String[] args) {
        int[] arr={3,10,66,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(MyArrays1.toString(arr)); // 이 코드를 MyArrays 에 구현해보자
//        System.out.println(MyArrays1.toString2(arr)); // 이 코드를 MyArrays 에 구현해보자
//        System.out.println(MyArrays1.toString3(arr)); // 이 코드를 MyArrays 에 구현해보자

        int[] arr2=Arrays.copyOf(arr,arr.length); // arr 배열을 오른쪽 인자 길이만큼 복사해줘
        System.out.println(arr==arr2);//false
        System.out.println(MyArrays1.toString(arr2));//[3,10,66,7]

        int[] arr3=MyArrays1.copyOf(arr);
        System.out.println(arr==arr3);//false
        System.out.println(MyArrays1.toString(arr3));//[3,10,66,7]

        int[] arr4=MyArrays1.copyOf2(arr,2);
        System.out.println(MyArrays1.toString(arr4));//[3,10]

        int[] arr5=MyArrays1.copyOf2(arr,1);
        System.out.println(MyArrays1.toString(arr5));//[3,10,66]

        int[] arr6=MyArrays1.copyOf2(arr,12); // 에러안나도록 해보기
        System.out.println(MyArrays1.toString(arr6));//[3,10,66]
    }
}
