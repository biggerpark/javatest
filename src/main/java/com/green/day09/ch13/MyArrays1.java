package com.green.day09.ch13;


//❗❗❗String 공부하기❗❗❗
public class MyArrays1 {


    public static String toString(int[] arr){
        StringBuilder str=new StringBuilder();
        str.append("[");
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]);
            if(i!=arr.length-1){
                str.append(",");
            }
        }
        str.append("]");
        return str.toString();
    }

    public static int[] copyOf(int[] arr){
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        return arr2;
    }

    public static int[] copyOf2(int[] arr, int num){
        int[] arr3=new int[num];
        for(int i=0;i<num;i++){
            arr3[i]=arr[i];
        }
        return arr3;
    }










}









