package com.green.day08.ch13;

import java.util.Arrays;

public class ArrayDatSwapping {
    public static void main(String[] args) {
        int arr[]={10,20,30};

        //arr[0]방의 값과 arr[2]의 값을 swapping 해주세요

        int temp;

        temp=arr[0];

        arr[0]=arr[2];
        arr[2]=temp;

        System.out.println(Arrays.toString(arr)); // 배열의 값을 문자열로 출력하게 해주는것



    }














}
